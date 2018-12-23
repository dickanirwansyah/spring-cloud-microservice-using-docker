FROM java:8
EXPOSE 9090
ADD /target/app-config-server.jar app-config-server.jar
ENTRYPOINT ["java", "-jar", "app-config-server.jar"]