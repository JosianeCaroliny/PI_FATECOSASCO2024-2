import org.gradle.internal.impldep.com.amazonaws.PredefinedClientConfigurations.defaultConfig

plugins {
    alias(libs.plugins.android.application)
}

android {
    namespace = "com.fatecosasco.zedamanga"
    compileSdk = 34

    defaultConfig {
        applicationId = "com.fatecosasco.zedamanga"
        minSdk = 24
        targetSdk = 34
        versionCode = 1
        versionName = "1.0"

        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
    }

    buildTypes {
        release {
            isMinifyEnabled = false
            proguardFiles(
                getDefaultProguardFile("proguard-android-optimize.txt"),
                "proguard-rules.pro"
            )
        }
    }
    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_1_8
        targetCompatibility = JavaVersion.VERSION_1_8
    }
}

dependencies {

    implementation(libs.appcompat)
    implementation(libs.material)
    implementation(libs.activity)
    implementation(libs.constraintlayout)
    implementation(libs.androidXCore)
    implementation(libs.kotlinStdLib)
    testImplementation(libs.junit)
    androidTestImplementation(libs.ext.jUnit)
    androidTestImplementation(libs.espresso.core)
}