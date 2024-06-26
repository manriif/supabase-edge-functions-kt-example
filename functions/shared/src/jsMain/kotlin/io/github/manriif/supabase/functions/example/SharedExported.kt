package io.github.manriif.supabase.functions.example

@JsExport
fun publicSharedHello(): String {
    return sharedHello()
}