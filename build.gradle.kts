import org.jetbrains.kotlin.ir.backend.js.compile

plugins {
    kotlin("jvm") version "1.9.23"
}

group = "cool.but"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

dependencies {
    implementation("com.github.jsonzou:jmockdata:4.3.0")
    implementation("org.junit.jupiter:junit-jupiter")
    implementation(platform("org.junit:junit-bom:5.10.0"))
    testImplementation("org.jetbrains.kotlin:kotlin-test")
}

tasks.test {
    useJUnitPlatform()
}
kotlin {
    jvmToolchain(17)
}