plugins {
    id ("com.android.application")
    id ("org.jetbrains.kotlin.android")
    id("kotlin-kapt")
    id ("dagger.hilt.android.plugin")
}

android {
    namespace = "com.example.taskmanagerapp"
    compileSdk = 34

    defaultConfig {
        applicationId = "com.example.taskmanagerapp"
        minSdk = 24
        targetSdk = 34
        versionCode = 1
        versionName = "1.0"

        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
        vectorDrawables {
            useSupportLibrary = true
        }
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
    kotlinOptions {
        jvmTarget = "1.8"
    }
    buildFeatures {
        compose = true
    }
    composeOptions {
        kotlinCompilerExtensionVersion = "1.3.2"
    }
    packaging {
        resources {
            excludes += "/META-INF/{AL2.0,LGPL2.1}"
        }
    }
}

dependencies {

    implementation ("androidx.core:core-ktx:1.10.1'")
    implementation (platform("org.jetbrains.kotlin:kotlin-bom:1.8.0"))
    implementation ("androidx.lifecycle:lifecycle-runtime-ktx:2.6.1")
    implementation ("androidx.activity:activity-compose:1.7.2")
    implementation (platform("androidx.compose:compose-bom:2023.06.00"))
    implementation ("androidx.compose.ui:ui")
    implementation ("androidx.compose.ui:ui-graphics")
    implementation ("androidx.compose.ui:ui-tooling-preview")
    implementation ("androidx.compose.foundation:foundation")
    implementation ("androidx.compose.material3:material3")
    testImplementation ("junit:junit:4.13.2")
    androidTestImplementation ("androidx.test.ext:junit:1.1.5")
    androidTestImplementation ("androidx.test.espresso:espresso-core:3.5.1'")
    androidTestImplementation (platform("androidx.compose:compose-bom:2023.06.00"))
    androidTestImplementation ("androidx.compose.ui:ui-test-junit4")
    debugImplementation ("androidx.compose.ui:ui-tooling")
    debugImplementation ("androidx.compose.ui:ui-test-manifest")

    // Compose Navigation
    implementation("androidx.navigation:navigation-compose:2.7.0-beta02")
    // compose dependencies
    implementation ("androidx.lifecycle:lifecycle-viewmodel-compose:2.6.1")

    // for changing the status bar color
    implementation ("com.google.accompanist:accompanist-systemuicontroller:0.27.0")

    // Room components
    implementation ("androidx.room:room-runtime:2.5.2")
    kapt ("androidx.room:room-compiler:2.5.2")
    implementation ("androidx.room:room-ktx:2.5.2")

    // DataStore Preferences
    implementation("androidx.datastore:datastore-preferences:1.0.0")

    // Dagger - Hilt
    implementation ("com.google.dagger:hilt-android:2.44.2")
    kapt ("com.google.dagger:hilt-compiler:2.44.2")
    kapt ("com.google.dagger:hilt-android-compiler:2.44")
    implementation("androidx.hilt:hilt-navigation-compose:1.0.0")
//    kapt 'androidx.hilt:hilt-compiler:1.0.0'

    // Splash API
    implementation ("androidx.core:core-splashscreen:1.0.1")
}