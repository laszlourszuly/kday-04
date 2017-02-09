// Use the Android library gradle plugin
apply plugin: 'com.android.library'

// Android configuration
android {
    compileSdkVersion 25
    buildToolsVersion "25.0.2"

    // Note! No "applicationId" for library projects
    defaultConfig {
        minSdkVersion 16
        targetSdkVersion 25
        versionCode 1
        versionName "0.0.1"
    }
    buildTypes {
        release {
            minifyEnabled true
            proguardFiles getDefaultProguardFile('proguard-android.txt'), 'proguard-rules.pro'
        }
    }
}

