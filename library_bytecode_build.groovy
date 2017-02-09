// Use the Android library gradle plugin
apply plugin: 'com.android.library'

// Force Retrolambda output to Java7 bytecode version
retrolambda {
    bytecodeVersion 51
}

// Android configuration
android {
    // ...
    
    // Force AAR output to Java7 bytecode version
    compileOptions {
        sourceCompatibility JavaVersion.VERSION_1_8
        targetCompatibility JavaVersion.VERSION_1_7
    }
}

