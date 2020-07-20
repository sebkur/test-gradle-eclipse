A testing project to get to the bottom of some inconsistent resource handling of
resources on the test classpath between Eclipse and Gradle.

Run `./gradlew test` to see the tests run fine with Gradle and import the
project into Eclipse (`./gradlew eclipse` → then import from Eclipse) to see
them fail from within Eclipse.

Tested with Gradle 6.5.1 and Eclipse 2020-06 (4.16.0).
