FROM openjdk:11
# JAR File
ADD rexharge-deploy-test-8080.jar myapplication
ENTRYPOINT ["java", "-jar","myapplication"]
EXPOSE 8081