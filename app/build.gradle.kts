plugins {  
    id("com.android.application") version "8.2.0"  
    id("org.jetbrains.kotlin.android") version "1.9.0"  
}  
  
android {  
    namespace = "com.moon.mji"  
    compileSdk = 34  
  
    defaultConfig {  
        applicationId = "com.moon.mji"  
        minSdk = 26  
        targetSdk = 34  
        versionCode = 1  
        versionName = "1.0"  
  
        ndk {  
            abiFilters += listOf("arm64-v8a", "armeabi-v7a", "x86_64", "x86")  
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
}  
  
dependencies {  
    implementation(fileTree(mapOf("dir" to "libs", "include" to listOf("*.jar"))))  
  
    // AndroidX 基础库  
    implementation("androidx.core:core-ktx:1.10.1")  
    implementation("androidx.appcompat:appcompat:1.6.1")  
    implementation("com.google.android.material:material:1.10.0")  
    implementation("androidx.constraintlayout:constraintlayout:2.1.4")  
  
    // 测试库  
    testImplementation("junit:junit:4.13.2")  
    androidTestImplementation("androidx.test.ext:junit:1.1.5")  
    androidTestImplementation("androidx.test.espresso:espresso-core:3.5.1")  
  
    // OkHttp3 网络库  
    implementation("com.squareup.okhttp3:okhttp:4.12.0")  
    implementation("com.squareup.okhttp3:logging-interceptor:4.12.0")  
  
    // uCrop 图片裁剪库（需要先在 settings.gradle.kts 中添加 JitPack 仓库）  
    implementation("com.github.yalantis:ucrop:2.2.11")  
  
    // 可选：Gson 用于 JSON 解析（如果项目需要）  
    implementation("com.google.code.gson:gson:2.10.1")  
}  
