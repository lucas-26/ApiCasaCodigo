FROM openjdk:11

CMD  "cd.."  "./mvnw clean package"  "cd target"

EXPOSE 8077
COPY casaDoCodigo-0.0.1.jar casaCodigo.jar
ENTRYPOINT ["java", "-jar", "/casaCodigo.jar"]