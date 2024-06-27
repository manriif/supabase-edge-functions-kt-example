import io.github.manriif.supabase.functions.ExperimentalSupabaseFunctionApi
import io.github.manriif.supabase.functions.serve.stacktrace.StackTraceSourceMapStrategy
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
        @OptIn(ExperimentalSupabaseFunctionApi::class)
        stackTraceSourceMapStrategy = StackTraceSourceMapStrategy.KotlinPreferred

        autoRequest {
            // Set to false if you do not want responses to be printed
            logResponse = true
        }
    }
}