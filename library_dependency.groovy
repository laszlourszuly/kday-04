// Just a regular Android app configuration
apply plugin: 'com.android.application'

android {
    // Stuff
}

// Non-default repositories used by this app. This is
// required for local libraries, see the 'dependencies'
// configuration below.
repositories {
    flatDir{
        dirs 'libs'
    }
}
 
dependencies {
    // AAR distributed through JCenter
    compile 'some.package.name:library:0.0.1'
    
    // Library module dependency (note the leading ':')
    compile project(':module-name')
    
    // Local AAR library in the "libs" directory
    // Note the "repository" configuration above
    compile(name:'nameOfYourAARFileWithoutExtension', ext:'aar')
}

