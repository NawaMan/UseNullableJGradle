# UseNullableJGradle

![alt "Build status"](https://travis-ci.org/NawaMan/UseNullableJGradle.svg?branch=master)

Example of how to use NullableJ in a Gradle project.

It basically boils down to adding NawaMan maven repository (hosted by github).

```Groovy
repositories {
    jcenter()
    maven { url 'https://raw.githubusercontent.com/nawmaman/nawaman-maven-repository/master/' }
}

dependencies {
    compileOnly 'org.projectlombok:lombok:1.16.16'
    compile     'nawaman:nullablej:0.4.0'
}
```

See the full code here: [build.gradle](https://github.com/NawaMan/UseNullableJGradle/blob/master/build.gradle)
