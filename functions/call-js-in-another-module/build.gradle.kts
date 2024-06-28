plugins {
    alias(libs.plugins.conventions.function)
}

kotlin.sourceSets {
    jsMain {
        dependencies {
            implementation(projects.functions.shared)
        }
    }
}