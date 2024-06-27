package io.github.manriif.supabase.functions.example

import io.github.jan.supabase.postgrest.postgrest
import io.github.manriif.supabase.functions.fetch.json.body
import io.github.manriif.supabase.functions.fetch.json.jsonResponse
import kotlinx.serialization.Serializable
import org.w3c.fetch.Request
import org.w3c.fetch.Response

@Serializable
data class City(
    val id: Long,
    val name: String,
    val country: String
)

@Serializable
data class RequestBody(
    val rowCount: Int
)

@Serializable
data class ResponseBody(
    val cities: List<City>
)

suspend fun serve(request: Request): Response {
    val requestBody = request.body<RequestBody>()
    val client = createSupabaseAnonClient()

    val cities = client.postgrest["city"]
        .select {
            limit(requestBody.rowCount.toLong())
        }
        .decodeList<City>()

    return jsonResponse(
        body = ResponseBody(
            cities = cities
        )
    )
}