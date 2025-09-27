plugins {
    id("application")
}

repositories {
    mavenCentral()
}

dependencies {
    testImplementation("org.junit.jupiter:junit-jupiter:5.9.3")
}

application {
    // Fully qualified name: if you have "package engine" in Main.java
    mainClass.set("Main")
}

tasks.test {
    useJUnitPlatform()
}

// Tell Gradle where to find sources
sourceSets {
    named("main") {
        java.srcDirs("src/main")
    }
}
