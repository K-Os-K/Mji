
pluginManagement {  
    repositories {  
        google()  
        mavenCentral()  
        gradlePluginPortal()  
    }  
}  
dependencyResolutionManagement {  
    repositoriesMode.set(RepositoriesMode.FAIL_ON_PROJECT_REPOS)  
    repositories {  
        google()  
        mavenCentral()  
        maven { url = uri("https://jitpack.io") }  // 添加这一行  
    }  
}  
  
rootProject.name = "Mji"  
include(":app")  
