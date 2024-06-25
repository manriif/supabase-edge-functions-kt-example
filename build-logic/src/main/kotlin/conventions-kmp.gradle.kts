plugins {
    org.jetbrains.kotlin.multiplatform
}

kotlin {
    applyDefaultHierarchyTemplate()

    js(IR) {
        moduleName = project.name
        useEsModules()
        nodejs()
    }
}


