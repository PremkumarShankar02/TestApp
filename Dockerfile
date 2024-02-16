FROM eclipse-temurin:17
COPY target/testapp.jar testapp.jar
CMD ["java","-jar","testapp.jar"]