
FROM amazoncorretto:17-alpine-jdk 
MAINTAINER jbproyect 
COPY target/eslatercera-0.0.1-SNAPSHOT.jar eslatercera-0.0.1-SNAPSHOT.jar 
ENTRYPOINT ["java","-jar","/eslatercera-0.0.1-SNAPSHOT.jar"]