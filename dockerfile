FROM openjdk:17-jdk-alpine
WORKDIR /app
COPY . /app
RUN javac MiddleCharacterApp.java
CMD ["java","MiddleCharacterApp"]