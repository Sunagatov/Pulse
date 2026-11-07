# Pulse

A small Spring Boot Kafka consumer that receives string messages and logs them.

<p>
  <a href="https://buymeacoffee.com/lucky_1uck">
    <img src="https://img.shields.io/badge/Support_the_project-FFDD00?style=for-the-badge&amp;logo=buymeacoffee&amp;logoColor=black" alt="Support the project" width="260" height="40">
  </a>
</p>

## What it does

[KafkaConsumerService](src/main/java/com/zufar/pulse/KafkaConsumerService.java)
subscribes to a configurable topic and consumer group using `@KafkaListener`.
It logs each received message. Custom processing, metrics persistence and an
HTTP API are not implemented in this starter.

## Stack

Java 17 · Spring Boot 3.4.4 · Spring Kafka 3.3.4 · Gradle · Lombok

## Configure

Set these environment variables before starting the application:

| Variable | Purpose |
| --- | --- |
| `KAFKA_BOOTSTRAP_SERVERS` | Broker bootstrap addresses |
| `KAFKA_CONSUMER_GROUP` | Consumer group ID |
| `KAFKA_TOPIC` | Topic to subscribe to |
| `KAFKA_API_KEY` | SASL username/API key |
| `KAFKA_API_SECRET` | SASL password/API secret |
| `APP_PORT` | Value referenced by the existing root `port` setting |

The checked-in Kafka configuration expects `SASL_SSL` with `PLAIN`
authentication. A plaintext local broker requires a corresponding configuration
override. The root `port` property is not Spring Boot's `server.port`; this
consumer has no web starter.

## Run and build

Install JDK 17 and a Gradle version compatible with Spring Boot 3.4. There is no
Gradle wrapper in this repository.

```bash
gradle bootRun
gradle build
```

Dependency versions are collected in [gradle.properties](gradle.properties).
Application configuration lives in [application.yml](src/main/resources/application.yml).

## ☕ Support the project

If this project helps you learn or build, you can support its development.

<p>
  <a href="https://buymeacoffee.com/lucky_1uck">
    <img src="https://img.shields.io/badge/Support_the_project-FFDD00?style=for-the-badge&amp;logo=buymeacoffee&amp;logoColor=black" alt="Support the project" width="260" height="40">
  </a>
</p>
