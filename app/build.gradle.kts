plugins {
    alias(libs.plugins.android.application)
    alias(libs.plugins.kotlin.android)
}

android {
    namespace = "com.nonthakorn.sheetwork"
    compileSdk = 36 // หรือตามที่โปรเจกต์กำหนด

    defaultConfig {
        applicationId = "com.nonthakorn.sheetwork"
        minSdk = 26  // ยืนยันว่าเป็น 26 ตามที่คุณตั้งไว้
        targetSdk = 36
        versionCode = 1
        versionName = "1.0"

        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
    }

    // เพิ่มบล็อกนี้เพื่อแก้ปัญหา Inconsistent JVM-target
    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_21
        targetCompatibility = JavaVersion.VERSION_21
    }

    // เพิ่มบล็อกนี้เพื่อให้ Kotlin ใช้ JVM target เดียวกัน
    kotlinOptions {
        jvmTarget = "21"
    }

    // เปิดใช้งาน View Binding
    buildFeatures {
        viewBinding = true
    }
}

dependencies {

    implementation(libs.androidx.core.ktx)
    implementation(libs.androidx.appcompat)
    implementation(libs.material)
    implementation(libs.androidx.activity)
    implementation(libs.androidx.constraintlayout)
    testImplementation(libs.junit)
    androidTestImplementation(libs.androidx.junit)
    androidTestImplementation(libs.androidx.espresso.core)
}