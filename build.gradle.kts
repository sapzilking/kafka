plugins {
    id("java")
}

group = "org.example"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

dependencies {
    testImplementation(platform("org.junit:junit-bom:5.9.1"))
    testImplementation("org.junit.jupiter:junit-jupiter")

    // kafka
    implementation("org.apache.kafka:kafka-clients:3.5.1")
}

tasks.test {
    useJUnitPlatform()
}