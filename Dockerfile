FROM openjdk:17-jdk-slim

WORKDIR /app

COPY EvenSum.java /app

RUN javac EvenSum.java

CMD ["java", "EvenSum"]