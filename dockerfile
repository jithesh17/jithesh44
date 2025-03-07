FROM openjdk:17-jdk-alpine
WORKDIR /app
COPY . /app
RUN javac OddNum.java
CMD ["java","OddNum"]
