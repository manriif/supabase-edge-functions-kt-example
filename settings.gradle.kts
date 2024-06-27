rootProject.name = "supabase-edge-functions-kt-example"

enableFeaturePreview("TYPESAFE_PROJECT_ACCESSORS")

pluginManagement {
    includeBuild("build-logic")

    repositories {
        mavenCentral()
        gradlePluginPortal()
    }
}

@Suppress("UnstableApiUsage")
dependencyResolutionManagement {
    repositoriesMode.set(RepositoriesMode.PREFER_PROJECT)

    repositories {
        mavenCentral()
    }
}

include(":functions:shared")
include(":functions:hello-world")
include(":functions:call-js-from-kotlin")
include(":functions:call-js-in-another-module")
include(":functions:call-kotlin-from-js")
include(":functions:database-interaction")