// Top-level build file where you can add configuration options common to all sub-projects/modules.
plugins {
    alias(libs.plugins.androidApplication) apply false

}

// you addedd
buildscript {
    repositories {
        jcenter()
    }
    dependencies {
        classpath ("com.android.tools.build:gradle:8.3.0")

        classpath ("com.google.gms:google-services:1.3.0-beta1")

    }
}

