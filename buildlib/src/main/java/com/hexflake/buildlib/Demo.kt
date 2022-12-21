package com.hexflake.buildlib

object class Buildlib {
companion object{
    val BuildlibName="Demo"
}
   // build.gradle settings
/*
buildscript {
    ext {
        compose_ui_version = '1.1.1'
    }
    dependencies {
        classpath 'com.google.gms:google-services:4.3.13'
        classpath "com.google.dagger:hilt-android-gradle-plugin:2.40.5" }
}

plugin is for json to pojo
"robo pojo generator"

    buildscript {
        repositories {
            google()
            jcenter()
            mavenCentral()
            maven { url "https://jitpack.io" }
        }
        dependencies {
            classpath 'com.android.tools.build:gradle:7.0.3'
            classpath 'com.google.gms:google-services:4.3.10'
            classpath 'org.jetbrains.kotlin:kotlin-gradle-plugin:1.6.10'//do not touch it else truecaller SDK will stop working
            classpath "com.google.dagger:hilt-android-gradle-plugin:2.38.1"
            classpath "androidx.navigation:navigation-safe-args-gradle-plugin:2.4.1"
        }
    }

    allprojects {
        repositories {
            google()
            jcenter()
            mavenCentral()
            maven { url 'https://jitpack.io' }
        }
    }

    task clean(type: Delete) {
        delete rootProject.buildDir
    }



    //build.gradle app
    plugins {
        id 'com.android.application'
        id 'kotlin-android'
        id 'kotlin-kapt'
        id 'dagger.hilt.android.plugin'
        id 'com.google.gms.google-services'
        id 'com.google.firebase.crashlytics'
        id 'androidx.navigation.safeargs.kotlin'
    }
    multiDexEnabled true
    buildFeatures {
        viewBinding true
    }
    dataBinding{
        enabled true
    }


    implementation 'com.github.bumptech.glide:glide:4.12.0'
    implementation 'androidx.constraintlayout:constraintlayout:2.1.1'
    implementation "androidx.paging:paging-runtime-ktx:3.1.0-alpha03"
    implementation 'com.squareup.retrofit2:retrofit:2.9.0'
    implementation 'com.squareup.retrofit2:converter-gson:2.9.0'
    implementation 'com.google.code.gson:gson:2.8.6'
    implementation 'com.squareup.okhttp3:okhttp:4.9.1'
    implementation "androidx.navigation:navigation-fragment-ktx:2.3.5"
    implementation "androidx.navigation:navigation-ui-ktx:2.3.5"
    implementation "androidx.navigation:navigation-runtime-ktx:2.3.5"
    implementation 'androidx.annotation:annotation:1.2.0'
    implementation 'androidx.browser:browser:1.3.0'
    implementation 'com.airbnb.android:lottie:3.4.0'
    implementation 'net.gotev:uploadservice:4.7.0'
    implementation 'io.reactivex.rxjava3:rxjava:3.0.2'
    implementation 'io.reactivex.rxjava3:rxandroid:3.0.0'
    implementation 'com.squareup.retrofit2:adapter-rxjava2:2.3.0'
    implementation 'androidx.activity:activity-ktx:1.3.1'
    implementation 'androidx.fragment:fragment-ktx:1.3.6'
    implementation "androidx.lifecycle:lifecycle-viewmodel-ktx:2.3.1"
    implementation "androidx.lifecycle:lifecycle-viewmodel-ktx:2.3.1"
    implementation 'androidx.lifecycle:lifecycle-common-java8:2.3.1'
    implementation 'androidx.lifecycle:lifecycle-livedata-ktx:2.3.1'
    implementation 'androidx.lifecycle:lifecycle-extensions:2.2.0'
    implementation 'com.google.dagger:hilt-android:2.38.1'
    implementation 'androidx.hilt:hilt-common:1.0.0'
    implementation 'androidx.hilt:hilt-work:1.0.0'
    kapt 'com.google.dagger:hilt-android-compiler:2.38.1'
    kapt 'androidx.hilt:hilt-compiler:1.0.0'
    implementation 'com.karumi:dexter:6.2.3'
    implementation "androidx.viewpager2:viewpager2:1.1.0-beta01"
    implementation 'androidx.work:work-runtime-ktx:2.7.1'
    implementation 'com.fasterxml.jackson.core:jackson-core:2.12.6'
    implementation 'com.fasterxml.jackson.core:jackson-annotations:2.12.6'
    implementation 'com.fasterxml.jackson.core:jackson-databind:2.12.6'
    implementation 'commons-codec:commons-codec:1.10'
    implementation "androidx.datastore:datastore-preferences:1.0.0"
    implementation "androidx.datastore:datastore-preferences-core:1.0.0"
    implementation "io.coil-kt:coil:2.1.0"

    kapt {
        correctErrorTypes true
    }

*/


}