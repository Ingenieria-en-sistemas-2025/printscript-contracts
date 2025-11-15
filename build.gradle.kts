plugins {
    kotlin("jvm") version "1.9.23"
    `java-library`
    `maven-publish`
}

group = "io.printscript"
version = "0.1.0"

java {
    toolchain {
        languageVersion.set(JavaLanguageVersion.of(21))
    }
}

repositories {
    mavenCentral()
}

dependencies {
    // comun a servicioss
}

publishing {
    publications {
        create<MavenPublication>("gpr") {
            from(components["java"])

            groupId = group.toString()
            artifactId = "contracts"   // io.printscript:contracts:0.1.0
            version = version
        }
    }
    repositories {
        maven {
            name = "GitHubPackages"
            url = uri("https://maven.pkg.github.com/Ingenieria-en-sistemas-2025/printscript-contracts")
            credentials {
                username = System.getenv("GITHUB_ACTOR") ?: ""
                password = System.getenv("GITHUB_TOKEN") ?: ""
            }
        }
    }

}
