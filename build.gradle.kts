plugins {
    kotlin("jvm") version "2.0.0"
}

group = property("maven_group")!!
version = property("version")!!

repositories {
    mavenCentral()

    mavenCentral()
    maven("https://repo.papermc.io/repository/maven-public/")
}

dependencies {
    testImplementation(kotlin("test"))

    compileOnly("io.papermc.paper:paper-api:${property("paper_version")}")
}

tasks.processResources {
    val props = mapOf("version" to version, "api_version" to project.property("plugin_api_version"))
    inputs.properties(props)
    filteringCharset = "UTF-8"
    filesMatching("plugin.yml") {
        expand(props)
    }
}

val targetJavaVersion = 21

kotlin {
    jvmToolchain(targetJavaVersion)
}
