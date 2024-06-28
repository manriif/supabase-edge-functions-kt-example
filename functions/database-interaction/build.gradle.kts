plugins {
    alias(libs.plugins.conventions.function)
    alias(libs.plugins.kotlinx.serialization)
}

kotlin.sourceSets {
    jsMain {
        dependencies {
            implementation(projects.functions.shared)
        }
    }
}