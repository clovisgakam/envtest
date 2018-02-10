FROM maven:3.5.2-jdk-8-slim
WORKDIR /opt/env
COPY . .
RUN ["mvn", "clean", "package"]
EXPOSE 8080
CMD exec $JAVA_HOME/bin/java $git -jar target/envTest-*.jar