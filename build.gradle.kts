plugins {
    id("io.spring.dependency-management") version "1.1.5"
    java
}

allprojects {
    group = "com.logitrack"
    version = "1.0.0-SNAPSHOT"
    repositories { mavenCentral() }
}

subprojects {
    apply(plugin = "io.spring.dependency-management")
    apply(plugin = "java")

    java {
        toolchain { languageVersion.set(JavaLanguageVersion.of(21)) }
    }

    tasks.withType<Test> { useJUnitPlatform() }
}

