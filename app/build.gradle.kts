plugins {
    id("com.android.application")
}

android {
    namespace = "com.example.wikimarvel"
    compileSdk = 34

    defaultConfig {
        applicationId = "com.example.wikimarvel"
        minSdk = 24
        targetSdk = 34
        versionCode = 1
        versionName = "1.0"

        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
    }

    buildTypes {
        release {
            isMinifyEnabled = false
            proguardFiles(getDefaultProguardFile("proguard-android-optimize.txt"), "proguard-rules.pro")
        }
    }
    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_1_8
        targetCompatibility = JavaVersion.VERSION_1_8
    }
    buildFeatures {
        viewBinding = true
    }
}

dependencies {

    implementation("androidx.appcompat:appcompat:1.6.1")
    implementation("com.google.android.material:material:1.10.0")
    implementation("androidx.constraintlayout:constraintlayout:2.1.4")
    implementation("androidx.navigation:navigation-fragment:2.7.5")
    implementation("androidx.navigation:navigation-ui:2.7.5")
    testImplementation("junit:junit:4.13.2")
    implementation("com.github.bumptech.glide:glide:4.16.0")
    implementation("androidx.preference:preference:1.2.0")
    androidTestImplementation("androidx.test.ext:junit:1.1.5")
    androidTestImplementation("androidx.test.espresso:espresso-core:3.5.1")
    dependencies {
        constraints {
            implementation("org.jetbrains.kotlin:kotlin-stdlib-jdk8:1.8.0") {
                because("kotlin-stdlib-jdk8 is now a part of kotlin-stdlib")
            }
        }
    }
    dependencies {
        implementation ("com.google.code.gson:gson:2.10.1")

    }
    dependencies {
        implementation ("androidx.recyclerview:recyclerview:1.3.2")
        implementation ("androidx.recyclerview:recyclerview-selection:1.1.0")
    }
    dependencies {
        implementation ("com.squareup.okhttp3:okhttp:4.9.0")
    }

}