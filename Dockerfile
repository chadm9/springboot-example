FROM amazoncorretto:19-al2-jdk AS build

COPY . /home/gradle/src
WORKDIR /home/gradle/src
RUN ./gradlew build

FROM amazoncorretto:19-al2-full

EXPOSE 8080
RUN mkdir /app
COPY --from=build /home/gradle/src/build/libs/springboot-example-0.0.1-SNAPSHOT.jar /app/springboot-example.jar

ENTRYPOINT ["java", "-jar", "/app/springboot-example.jar"]