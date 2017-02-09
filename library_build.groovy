apply plugin: 'com.android.library'

// Force Retrolambda to output Java7 compatible byte code
retrolambda {
    bytecodeVersion 51
}

// Android configuration
android {
    compileSdkVersion 25
    buildToolsVersion "25.0.2"

    defaultConfig {
        // Note! No application id for library projects
        
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
    compileOptions {
        // Force AAR to correct bytecode version
        sourceCompatibility JavaVersion.VERSION_1_8
        targetCompatibility JavaVersion.VERSION_1_7
    }
}

// Library dependencies
dependencies {
    // Same as for app projects
}

