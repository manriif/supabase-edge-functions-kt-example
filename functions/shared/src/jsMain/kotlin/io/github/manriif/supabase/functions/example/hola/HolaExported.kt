package io.github.manriif.supabase.functions.example.hola

@JsExport
fun publicSharedHello(): String {
    return sharedHello()
}