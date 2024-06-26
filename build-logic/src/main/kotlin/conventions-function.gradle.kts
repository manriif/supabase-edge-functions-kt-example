import io.github.manriif.supabase.functions.task.SupabaseFunctionServeTask

plugins {
    id("conventions-kmp")
    io.github.manriif.`supabase-functions`
}

supabaseFunction {
    // All functions share the same package name for simplicity
    packageName = "io.github.manriif.supabase.functions.example"
    verifyJwt = false
}

tasks {
    withType<SupabaseFunctionServeTask> {
        autoRequest {
            // Set to true if you want more output about request
            logResponse = false
        }
    }
}