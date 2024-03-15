import java.util.regex.Pattern.compile

plugins {
    alias(libs.plugins.androidApplication)
}

android {
    namespace = "com.example.scratch"
    compileSdk = 34

    defaultConfig {
        applicationId = "com.example.scratch"
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
   

}

dependencies {

    implementation(libs.appcompat)
    implementation(libs.material)
    implementation(libs.activity)
    implementation(libs.constraintlayout)

    testImplementation(libs.junit)
    androidTestImplementation(libs.ext.junit)
    androidTestImplementation(libs.espresso.core)



    compile ("com.github.cooltechworks:ScratchView:v1.1")
    compile ("com.clock.scratch:Scratch:1.0.0")

//    implementation ("in.codeshuffle.scratchcardlayout:ScratchCardLayout:1.0.8")
    implementation ("com.github.cooltechworks:ScratchView:v1.1")

    implementation ("com.github.AnupKumarPanwar:ScratchView:2.0.2")

    implementation ("com.airbnb.android:lottie:3.4.0")

    implementation ("in.codeshuffle.scratchcardlayout:ScratchCardLayout:1.0.8")

}

