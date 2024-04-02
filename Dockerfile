FROM eclipse-temurin:21.0.2_13-jdk-jammy as build
WORKDIR /app
COPY .mvn/ .mvn
COPY mvnw pom.xml ./
COPY src ./src
RUN ./mvnw clean install

FROM eclipse-temurin:21.0.2_13-jre-jammy
WORKDIR /app
EXPOSE 8080
COPY --from=build /app/target/*.jar /app/*.jar
ENTRYPOINT [ "java", "-jar", "/app/*.jar" ]
