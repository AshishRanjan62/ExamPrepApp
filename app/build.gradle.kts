plugins {
    alias(libs.plugins.android.application)
    alias(libs.plugins.google.gms.google.services)

}

android {
    namespace = "com.example.mainactivity"
    compileSdk = 34

    defaultConfig {
        applicationId = "com.example.mainactivity"
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
    buildFeatures {
        viewBinding = true
    }
}

dependencies {

    implementation(libs.appcompat)
    implementation(libs.material)
    implementation(libs.activity)
    implementation(libs.constraintlayout)
    implementation(libs.lifecycle.livedata.ktx)
    implementation(libs.lifecycle.viewmodel.ktx)
    implementation(libs.navigation.fragment)
    implementation(libs.navigation.ui)
    testImplementation(libs.junit)
    androidTestImplementation(libs.ext.junit)
    androidTestImplementation(libs.espresso.core)


        implementation ("com.google.firebase:firebase-auth:19.4.0")
        implementation ("com.google.android.gms:play-services-auth:18.1.0")
        implementation ("com.github.bumptech.glide:glide:4.11.0")
        annotationProcessor ("com.github.bumptech.glide:compiler:4.15.1")
    implementation(platform("com.google.firebase:firebase-bom:33.1.1"))
    implementation ("com.google.firebase:firebase-storage")
    implementation ("com.squareup.picasso:picasso:2.71828")
    implementation ("com.airbnb.android:lottie:5.0.3")




    }