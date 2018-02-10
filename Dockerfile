FROM adorsys/openjdk-jre-base:8
MAINTAINER clovis
WORKDIR /opt/test
COPY ./target/envTest-0.0.1-SNAPSHOT.jar .
EXPOSE 8081
CMD exec $JAVA_HOME/bin/java $JAVA_OPTS -jar /opt/test/envTest-0.0.1-SNAPSHOT.jar
