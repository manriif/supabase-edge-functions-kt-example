package io.github.manriif.supabase.functions.example

import org.w3c.fetch.Request
import org.w3c.fetch.Response

@Suppress("UNUSED_PARAMETER")
fun serve(request: Request): Response {
    return Response(
        body = aJsFunctionThatWillCallAnotherJsFunctionDeclaredInKotlinSourceOfAnotherModule()
    )
}