FROM azul/zulu-openjdk-alpine:11.0.4 as default
ADD target/service.jar service.jar
EXPOSE 8090
ENTRYPOINT ["java", "-jar", "service.jar"]