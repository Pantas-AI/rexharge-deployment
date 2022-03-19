FROM openjdk:11
# JAR File
ADD rexharge-deploy-test-8081.jar myapplication
ENTRYPOINT ["java", "-jar","myapplication"]
EXPOSE 8081