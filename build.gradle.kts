plugins {
    alias(libs.plugins.kotlin.multiplatform) apply false
    alias(libs.plugins.supabase.edge.functions) apply false
}

subprojects {
    group = property("project.group").toString()
    version = rootProject.libs.versions.template.get()
}