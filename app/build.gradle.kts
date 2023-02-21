plugins {
    id(BuildPlugins.androidApplication)
    id(BuildPlugins.kotlin_android)
}

android {
    namespace = "com.recrd.recrdtest"
    compileSdk = ConfigData.compileSDK

    defaultConfig {
        applicationId = "com.recrd.recrdtest"
        minSdk = ConfigData.minSDk
        targetSdk = ConfigData.compileSDK
        versionCode = ConfigData.versionCode
        versionName = ConfigData.versionName

        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
        vectorDrawables {
            useSupportLibrary = true
        }
    }

    buildTypes {
        debug {
            applicationIdSuffix = ""
        }
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
    kotlinOptions {
        jvmTarget = "1.8"
    }
    buildFeatures {
        compose = true
    }
    composeOptions {
        kotlinCompilerExtensionVersion = "1.2.0"
    }
    packagingOptions {
        resources {
            excludes += "/META-INF/{AL2.0,LGPL2.1}"
        }
    }
}

dependencies {

    implementation(Deps.core_ktx)
    implementation(Deps.lifecycle_runtime)
    implementation(Deps.androidx_compose_activity)
    implementation(Deps.androidx_compose_compiler)
    implementation(Deps.androidx_compose_foundation)
    implementation(Deps.androidx_compose_livedata)
    implementation(Deps.androidx_compose_layout)
    implementation(Deps.androidx_compose_material_icons_core)
    implementation(Deps.androidx_compose_constraintlayout)
    implementation(Deps.androidx_compose_tooling)
    implementation(Deps.androidx_compose_ui)
    implementation(Deps.compose_material)
    implementation(Deps.androidx_compose_navigation)
    implementation(Deps.android_compose_coil)
    implementation(Deps.compose_coil_svg)

    //testing
    testImplementation(Deps.junit)
    androidTestImplementation(Deps.ext_junit)
    androidTestImplementation(Deps.espresso)
    androidTestImplementation(Deps.compose_ui_test)
    testImplementation(Deps.mockito)
    testImplementation(Deps.mockk)
    androidTestImplementation(Deps.arch_testing)
    testImplementation(Deps.arch_testing)
    testImplementation(Deps.test_coroutines)
    testImplementation(Deps.google_truth)

    //retrofit
    implementation(Deps.retrofit)
    implementation(Deps.moshi)
    implementation(Deps.moshi_kotlin)


    //DI
    implementation(Deps.koin_core)
    implementation(Deps.koin_android)
    implementation(Deps.koin_compose)
}