# City Search API App #

## Version ##

`0.0.1`

## Summary ##

Many situations in web applications arise when a user is prompted to fill in some text in a form where the text is expected to be one of a fixed number of strings. This could be people names, profession names, cities, countries, etc. A common interface in this kind of "choose from a large but fixed set" scenario is to let the user type a few characters and provide completion suggestions.

* [Prerequisites](#markdown-header-prerequisites)
* [Build](#markdown-header-build)
* [Test](#markdown-header-test)
* [Run](#markdown-header-run)
* [Author](#markdown-header-author)

## Prerequisites ##

Ensure local installation of following softwares/tools:

* JDK - 1.8
* Git (2.9.0 or higher) - only for cloning project from repository
* Apache Maven (3.3.9 or higher)


## Build

Open your command/shell terminal

Clone locally, an appropriate version of sample-test from [git](https://github.com/sammeraj/test).

Execute standard maven command to build and install library:

~~~bash
# CD into project folder

# Build package(downloading dependencies)
mvn clean install
~~~
Verify that it generates below artifacts:

* ./target/sample-test-*.jar

---

## Test

This api can be tested using below url.

`http://localhost:8082/suggest_cities?start=B&atmost=3`

---

## Run

Local

```
# java -jar <JAR_NAME>.jar

java -jar sample-test/target/sample-test-0.0.1-SNAPSHOT.jar

```

## Author ##

Meraj Ahmad
