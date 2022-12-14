plugins {
    id("java")
}

group = "org.lindgrei"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

dependencies {
    testImplementation("org.junit.jupiter:junit-jupiter-api:5.8.1")
    testRuntimeOnly("org.junit.jupiter:junit-jupiter-engine:5.8.1")
    implementation("com.github.twitch4j:twitch4j:1.12.0")
    implementation ("org.apache.logging.log4j:log4j-api:2.19.0")
    implementation ("org.apache.logging.log4j:log4j-core:2.19.0")
}

tasks.getByName<Test>("test") {
    useJUnitPlatform()
}