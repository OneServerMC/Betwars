import org.apache.tools.ant.filters.ReplaceTokens
import org.jetbrains.kotlin.gradle.tasks.KotlinCompile

plugins {
    kotlin("jvm")
    application
}

group = "io.github.oneserver"
version = "0.1.0"
java.sourceCompatibility = JavaVersion.VERSION_17

repositories {
    // Maven Central
    mavenCentral()

    // JitPack
    maven { url = uri("https://jitpack.io") }

    // Paper
    maven { url = uri("https://papermc.io/repo/repository/maven-public/") }
}

tasks.withType<KotlinCompile> {
    kotlinOptions {
        freeCompilerArgs = listOf("-Xjsr305=strict")
        jvmTarget = "17"
    }
}

tasks.processResources {
    filteringCharset = "UTF-8"
    from(sourceSets["main"].resources.srcDirs) {
        include("**/*.yml")
        duplicatesStrategy = DuplicatesStrategy.INCLUDE
        filter<ReplaceTokens>("tokens" to mapOf("version" to project.version))
        filter<ReplaceTokens>("tokens" to mapOf("name" to project.name))
    }
}

dependencies {
    implementation(kotlin("stdlib"))

    implementation("com.github.hazae41:mc-kutils:master-SNAPSHOT")
    implementation("com.github.M1n1don:SmartInvsR:1.1")

    compileOnly("io.papermc.paper:paper-api:1.17.1-R0.1-SNAPSHOT")
}