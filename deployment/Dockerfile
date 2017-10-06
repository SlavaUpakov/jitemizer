FROM openjdk:8-jre-alpine

VOLUME /tmp
ADD jitemizer.jar app.jar
# RUN sh -c 'touch /app.jar'

# ENTRYPOINT [
#     "java",
#     "-Djava.security.egd=file:/dev/./urandom",
#     "-Dspring.profiles.active=container",
#     "-jar",
#     "/app.jar"
# ]

CMD ["java", "--version"]
ENV JAVA_OPTS=""
ENTRYPOINT [ "sh", "-c", "java $JAVA_OPTS -Djava.security.egd=file:/dev/./urandom -jar /app.jar" ]
