![Travis](https://travis-ci.org/hanswesterbeek/favbuild.svg)
[![Codacy Badge](https://api.codacy.com/project/badge/Grade/602d39b6ae9d467da4a97e7a6b7a495d)](https://www.codacy.com/app/hanswesterbeek/favbuild?utm_source=github.com&amp;utm_medium=referral&amp;utm_content=hanswesterbeek/favbuild&amp;utm_campaign=Badge_Grade)
# Introduction

This is a sample project demonstrating execution of UI tests. 
By 'UI tests' I mean tests that talk to the app through its endpoints only 
(as opposed to unit or integration tests). Note that UI != GUI. A REST endpoint is a UI too.

The project in this repo is setup I like for Java projects and I thought I should keep a blueprint of it somewhere.

## Running the build

 - `./gradlew uT` runs the ui-tests.
 - `./gradlew build`. In addition to creating a fatjar, this will put a docker image in your local repo.
 - `./gradlew iT` runs integration tests. Not really interesting, I just add it here to show the conceptual difference to unit tests and ui-tests.
 
 
## Requirements

 - Gradle
 - Docker
 - [gradle-docker-plugin](https://github.com/bmuschko/gradle-docker-plugin)
 - [docker-compose-gradle-plugin](https://github.com/avast/gradle-docker-compose-plugin)
 - Spring Boot, though that is not essential to the point in case
 

## Assumptions

 - That you run your app using docker (in production)
 
## Disclaimers

I use docker-compose here to boot the app and the services it depends on. I do not advocate for production-deployments. This is just to get a bare-bones version of your app running so you can run some tests against it.
 
