FROM java:8
EXPOSE 9091
ADD /target/app-service-registry.jar app-service-registry.jar
ENTRYPOINT ["java", "-jar", "app-service-registry.jar"]