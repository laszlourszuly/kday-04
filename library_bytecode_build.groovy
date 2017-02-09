// Use the Android library gradle plugin
apply plugin: 'com.android.library'

// Force Retrolambda to output Java7 compatible byte code
retrolambda {
    bytecodeVersion 51
}

// Android configuration
android {
    // ...
    
    // Force AAR to correct bytecode version
    compileOptions {
        sourceCompatibility JavaVersion.VERSION_1_8
        targetCompatibility JavaVersion.VERSION_1_7
    }
}

