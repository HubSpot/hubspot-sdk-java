plugins {
    id("io.github.gradle-nexus.publish-plugin") version "1.1.0"
    id("org.jetbrains.dokka") version "2.0.0"
}

repositories {
    mavenCentral()
}

allprojects {
    group = "com.hubspot.sdk"
    version = "0.1.0-alpha.2" // x-release-please-version
}

subprojects {
    // These are populated with dependencies by `buildSrc` scripts.
    tasks.register("format") {
        group = "Verification"
        description = "Formats all source files."
    }
    tasks.register("lint") {
        group = "Verification"
        description = "Verifies all source files are formatted."
    }
    apply(plugin = "org.jetbrains.dokka")
}

subprojects {
    apply(plugin = "org.jetbrains.dokka")
}

// Avoid race conditions between `dokkaJavadocCollector` and `dokkaJavadocJar` tasks
tasks.named("dokkaJavadocCollector").configure {
    subprojects.flatMap { it.tasks }
        .filter { it.project.name != "hubspot-java" && it.name == "dokkaJavadocJar" }
        .forEach { mustRunAfter(it) }
}

nexusPublishing {
    repositories {
        sonatype {
            nexusUrl.set(uri("https://ossrh-staging-api.central.sonatype.com/service/local/"))
            snapshotRepositoryUrl.set(uri("https://central.sonatype.com/repository/maven-snapshots/"))

            username.set(
                (findProperty("mavenCentralUsername") as String?)
                    ?: System.getenv("SONATYPE_USERNAME"),
            )
            password.set(
                (findProperty("mavenCentralPassword") as String?)
                    ?: System.getenv("SONATYPE_PASSWORD"),
            )
        }
    }
}
