plugins {
    org.jetbrains.kotlin.multiplatform
}

kotlin {
    applyDefaultHierarchyTemplate()

    js(IR) {
        moduleName = project.name
        binaries.library()
        useEsModules()
        nodejs()
    }
}


