FROM openjdk:11
# JAR File
ADD web.jar myapplication
ENTRYPOINT ["java", "-jar","myapplication"]
EXPOSE 8080