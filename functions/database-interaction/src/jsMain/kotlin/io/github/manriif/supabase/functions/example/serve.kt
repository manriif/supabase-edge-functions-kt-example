package io.github.manriif.supabase.functions.example

import io.github.jan.supabase.gotrue.auth
import io.github.jan.supabase.gotrue.providers.builtin.Email
import io.github.jan.supabase.gotrue.user.UserInfo
import io.github.manriif.supabase.functions.fetch.json.body
import io.github.manriif.supabase.functions.fetch.json.jsonResponse
import kotlinx.serialization.Serializable
import org.w3c.fetch.Request
import org.w3c.fetch.Response

@Serializable
data class RequestBody(
    val email: String,
    val password: String
)

@Serializable
data class ResponseBody(
    val user: UserInfo,
    val created: Boolean
)

suspend fun serve(request: Request): Response {
    val requestBody = request.body<RequestBody>()
    val client = createSupabaseAdminClient()

    val responseBody = runCatching {
        client.auth.signInWith(Email) {
            email = requestBody.email
            password = requestBody.password
        }

        ResponseBody(
            user = client.auth.currentUserOrNull()!!,
            created = false
        )
    }.getOrElse {
        ResponseBody(
            user = client.auth.admin.createUserWithEmail {
                autoConfirm = true
                email = requestBody.email
                password = requestBody.password
            },
            created = true
        )
    }

    return jsonResponse(body = responseBody)
}