package io.github.manriif.supabase.functions.example

@OptIn(ExperimentalJsExport::class)
@JsExport
fun howAreYou() : String {
    return "comment allez-vous ?"
}