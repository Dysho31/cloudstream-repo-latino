plugins {
    kotlin("jvm") version "1.6.10"
}

repositories {
    mavenCentral()
    maven("https://jitpack.io")
}

dependencies {
    implementation("com.github.recloudstream.cloudstream:cloudstream:latest.release")
}
