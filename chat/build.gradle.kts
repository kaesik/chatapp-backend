plugins {
    id("java-library")
    id("chatapp.spring-boot-service")
    kotlin("plugin.jpa")
}

group = "com.kaesik"
version = "unspecified"

repositories {
    mavenCentral()
}

dependencies {
    implementation(projects.common)
}