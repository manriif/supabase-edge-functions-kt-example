rootProject.name = "supabase-edge-functions-kt-example"

enableFeaturePreview("TYPESAFE_PROJECT_ACCESSORS")

pluginManagement {
    includeBuild("build-logic")

    repositories {
        mavenCentral()
        gradlePluginPortal()
        mavenLocal()
    }
}

@Suppress("UnstableApiUsage")
dependencyResolutionManagement {
    repositoriesMode.set(RepositoriesMode.PREFER_PROJECT)

    repositories {
        mavenCentral()
        mavenLocal()
    }
}

include(":functions:shared")
include(":functions:hello-world")
include(":functions:call-js-from-js")
include(":functions:call-js-located-in-other-module")
include(":functions:call-kotlin-from-js")
include(":functions:database-interaction")