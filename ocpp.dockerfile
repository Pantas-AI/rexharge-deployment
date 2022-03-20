FROM openjdk:11
# JAR File
ADD steve/steve.jar myapplication
COPY steve ./
ENTRYPOINT ["java", "-jar","myapplication"]
EXPOSE 8081