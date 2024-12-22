FROM openjdk:latest
WORKDIR /app
COPY . /app
RUN javac First.java
CMD ["java","First"] 
