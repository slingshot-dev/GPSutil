FROM openjdk:8-jdk-alpine
EXPOSE 8050
COPY GPSUtil.jar /
ENTRYPOINT ["java", "-jar", "GPSUtil.jar"]


