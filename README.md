# jitemizer

## description


## how to
* mvnw install -o -T 1C
* HOST RUN:     mvnw spring-boot:run -pl host

* DOCKER BUILD:   mvn package docker:build -DpushImage
* DOCKER RUN:     docker run -p 8080:8080 -t jitemizer/jitemizer


## technical
* [Maven wrapper](https://github.com/takari/maven-wrapper) is used. So install the wrapper by copying it from an existing project, or by executing  

> mvn io.takari:maven:wrapper goal 

(follow instructions in 

* [Docker maven plugin](https://github.com/spotify/docker-maven-plugin)
