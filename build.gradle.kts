buildscript {
    repositories {
        gradlePluginPortal()
        google()
        mavenCentral()
    }
    dependencies {
        classpath("org.jetbrains.kotlin:kotlin-gradle-plugin:1.7.0")
        classpath("com.android.tools.build:gradle:7.2.1")
        classpath("io.gitlab.arturbosch.detekt:detekt-gradle-plugin:1.20.0")
        classpath("org.jetbrains.kotlin:kotlin-serialization:1.7.0")
    }
}

tasks.register("clean", Delete::class) {
    delete(rootProject.buildDir)
}