plugins {
    kotlin("jvm") version "1.5.31"
    id("java-library")
}

group = "com.anime3rb"
version = "1.0"

repositories {
    mavenCentral()
}

dependencies {
    implementation(kotlin("stdlib"))
}
