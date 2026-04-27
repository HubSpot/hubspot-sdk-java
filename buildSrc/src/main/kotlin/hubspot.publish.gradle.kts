plugins {
    `maven-publish`
    signing
}

configure<PublishingExtension> {
    publications {
        register<MavenPublication>("maven") {
            from(components["java"])

            pom {
                name.set("HubSpot API Specification")
                description.set("Merged HubSpot API specifications from all endpoints")
                url.set("https://developers.hubspot.com/docs/api-reference/overview")

                licenses {
                    license {
                        name.set("Apache-2.0")
                    }
                }

                developers {
                    developer {
                        name.set("HubSpot")
                    }
                }

                scm {
                    connection.set("scm:git:git://github.com/HubSpot/hubspot-sdk-java.git")
                    developerConnection.set("scm:git:git://github.com/HubSpot/hubspot-sdk-java.git")
                    url.set("https://github.com/HubSpot/hubspot-sdk-java")
                }

                versionMapping {
                    allVariants {
                        fromResolutionResult()
                    }
                }
            }
        }
    }
    repositories {
        if (project.hasProperty("publishLocal")) {
            maven {
                name = "LocalFileSystem"
                url = uri("${rootProject.layout.buildDirectory.get()}/local-maven-repo")
            }
        }
    }
}

signing {
    val signingKeyId = (findProperty("signingInMemoryKeyId") as String?)?.ifBlank { null }
        ?: System.getenv("GPG_SIGNING_KEY_ID")?.ifBlank { null }
    val signingKey = (findProperty("signingInMemoryKey") as String?)?.ifBlank { null }
        ?: System.getenv("GPG_SIGNING_KEY")?.ifBlank { null }
    val signingPassword = (findProperty("signingInMemoryKeyPassword") as String?)?.ifBlank { null }
        ?: System.getenv("GPG_SIGNING_PASSWORD")?.ifBlank { null }
    if (signingKey != null && signingPassword != null) {
        useInMemoryPgpKeys(
            signingKeyId,
            signingKey,
            signingPassword,
        )
        sign(publishing.publications["maven"])
    }
}

tasks.named("publish") {
    dependsOn(":closeAndReleaseSonatypeStagingRepository")
}
