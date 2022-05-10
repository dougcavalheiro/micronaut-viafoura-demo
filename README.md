# Micronaut viafoura demo

This is a sample project based on micronaut framework which includes:
- A simple micronaut rest framework
- K6 load testing script
- Grafana dashboard for k6 test results

## Running

### To the natives
The following gradle command builds the artifact to a native binary:  

`./gradlew nativeCompile`

The binary will be located at _/build/native/nativeCompile_ folder.

### Docker

By running `docker-compose -f docker-compose.local.yaml up` the entire environment + k6 tests will start to execute. To track them just open _http://localhost:3000/d/k6/k6-load-testing-results?orgId=1&refresh=5s_ into your browser. 

## Contributing

This project runs the micronaut basics for native compilation + k6 load testing. It might be helpful for us to replicate the same idea into other frameworks in order to compare them.
Adding some features that we are used to can help to experiment this framework as well, such as:
- Event message handling
- Database operations (with or without Jooq)
- Metrics
- Testing
- Reactive

Thanks to [Shamil](https://github.com/skashmeri) who shared [this infoq article](https://www.infoq.com/articles/native-java-micronaut/) 

## More info: Micronaut 3.4.3 Documentation

- [User Guide](https://docs.micronaut.io/3.4.3/guide/index.html)
- [API Reference](https://docs.micronaut.io/3.4.3/api/index.html)
- [Configuration Reference](https://docs.micronaut.io/3.4.3/guide/configurationreference.html)
- [Micronaut Guides](https://guides.micronaut.io/index.html)
---

- [Shadow Gradle Plugin](https://plugins.gradle.org/plugin/com.github.johnrengelman.shadow)
## Feature http-client documentation

- [Micronaut HTTP Client documentation](https://docs.micronaut.io/latest/guide/index.html#httpClient)


