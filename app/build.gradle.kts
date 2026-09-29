plugins {
    id("com.android.application")
}

android {
    namespace = "com.autocheck.app"
    compileSdk = 35

    defaultConfig {
        applicationId = "com.autocheck.app"
        minSdk = 23
        targetSdk = 35
        versionCode = 1
        versionName = "1.0"
    }
}

java {
    toolchain {
        languageVersion.set(JavaLanguageVersion.of(17))
    }
}
