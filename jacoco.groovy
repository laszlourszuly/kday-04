

apply plugin: 'jacoco'

jacoco {
    // At some point in time this was the only version working with
    // Robolectric.
    toolVersion = "0.7.6.201602180812"
    reportsDir = file("${buildDir}/reports/coverage/")
}

android {
    testOptions {
        unitTests.all {
            jacoco {
                // Needed in order to have Robolectric play ball
                // This command only works with Gradle 2.13+ though...
                includeNoLocationClasses = true
            }
        }
    }
}

