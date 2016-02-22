property-gradle-plugin
======================

## Reason
I was struck by Gradle and the lack of possibility to easy forward ```-D``` marked properties for tests execution. Ths plugin is the
recipe for that. Just use:
```
```
and it'll be possible to execute your tests with given properties which will be passed to your tests:
```
gradle test -DmyProp=value
```