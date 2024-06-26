plugins {
    org.jetbrains.kotlin.multiplatform
}

kotlin {
    applyDefaultHierarchyTemplate()

    js(IR) {
        binaries.library()
        useEsModules()
        nodejs()
    }

    sourceSets {
        jsMain {
            languageSettings.optIn("kotlin.js.ExperimentalJsExport")
        }
    }
}

