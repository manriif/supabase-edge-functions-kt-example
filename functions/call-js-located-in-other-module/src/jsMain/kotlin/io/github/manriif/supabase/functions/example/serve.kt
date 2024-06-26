package io.github.manriif.supabase.functions.example

import kotlinx.coroutines.await
import org.w3c.fetch.Request
import org.w3c.fetch.Response

suspend fun serve(request: Request): Response {
    if (request.method == "GET") {
        return Response(body = "Hello, world !!")
    }

    // Assuming the request has a body
    val body = request.text().await()

    return Response(body = "Hello, $body !!")
}