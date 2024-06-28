package io.github.manriif.supabase.functions.example

import org.w3c.dom.url.URL
import org.w3c.fetch.Request
import org.w3c.fetch.Response
import org.w3c.fetch.ResponseInit

fun serve(request: Request): Response {
    val url = URL(request.url)
    val params = url.searchParams

    val name = params.get("name") ?: return Response(
        body = "Missing name in request parameters",
        init = ResponseInit(400)
    )

    return Response(body = bonjour(name))
}