property-gradle-plugin
======================

## Reason
I was struck by Gradle and the lack of possibility to easy forward ```-D``` marked properties for tests execution. Ths plugin is the
recipe for that. Just use:
```
buildscript {
  repositories {
    maven {
      url "https://plugins.gradle.org/m2/"
    }
  }
  dependencies {
    classpath "gradle.plugin.com.gmaslowski.gradle.plugin.property:property-gradle-plugin:0.4"
  }
}

apply plugin: "com.gmaslowski.gradle.plugin.property"
```
and it'll be possible to execute your tests with given properties which will be passed to your tests:
```
gradle test -DmyProp=value
```

## Gradle plugin
[https://plugins.gradle.org/plugin/com.gmaslowski.gradle.plugin.property](https://plugins.gradle.org/plugin/com.gmaslowski.gradle.plugin.property)