pluginManagement {
    includeBuild("build-logic")
    repositories {
        gradlePluginPortal()
        mavenCentral()
    }
}

rootProject.name = "chatapp"

include("app")
include("user")
include("chat")
include("notification")
include("common")