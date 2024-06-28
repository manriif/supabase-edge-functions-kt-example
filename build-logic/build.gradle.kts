plugins {
    `kotlin-dsl`
}

gradlePlugin {
    plugins {
        listOf("function", "kmp").forEach { scriptName ->
            named("conventions-$scriptName") {
                version = libs.versions.template.get()
            }
        }
    }
}

dependencies {
    implementation(libs.kotlin.gradle.plugin)
    implementation(libs.supabase.edge.functions.gradle.plugin)

    // https://github.com/gradle/gradle/issues/15383#issuecomment-779893192
    implementation(files(libs.javaClass.superclass.protectionDomain.codeSource.location))
}