FROM adoptopenjdk/openjdk8
COPY delivery-0.0.1-SNAPSHOT.jar /usr/src/bootdocker/delivery-0.0.1-SANPSHOT.jar
WORKDIR /usr/src/bootdocker
EXPOSE 8089
ENTRYPOINT ["java", "-jar", "/usr/src/bootdocker/delivery-0.0.1-SANPSHOT.jar"]