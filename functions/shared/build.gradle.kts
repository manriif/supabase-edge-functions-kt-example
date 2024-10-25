plugins {
    alias(libs.plugins.conventions.kmp)
}

kotlin.sourceSets {
    jsMain {
        dependencies {
            api(libs.supabase.edge.functions.module.binding.deno)
            api(libs.supabase.edge.functions.module.fetch.json)
            api(libs.supabase.auth)
            api(libs.supabase.postgrest)
        }
    }
}