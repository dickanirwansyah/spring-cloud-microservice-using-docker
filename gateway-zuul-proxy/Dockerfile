FROM java:8
EXPOSE 8084
ADD /target/gateway-zuul-proxy.jar gateway-zuul-proxy.jar
ENTRYPOINT ["java", "-jar", "gateway-zuul-proxy.jar"]