FROM azul/zulu-openjdk-alpine:11.0.4 as default
ADD target/data.jar data.jar
EXPOSE 8095
ENTRYPOINT ["java", "-jar", "data.jar"]