FROM adorsys/openjdk-jre-base:8
MAINTAINER clovis
WORKDIR /opt/test
# Install Gradle
RUN wget -q http://www-eu.apache.org/dist/maven/maven-3/${MAVEN_VERSION}/binaries/apache-maven-${MAVEN_VERSION}-bin.tar.gz && \
    mkdir /opt/maven && \
    tar xzf apache-maven-${MAVEN_VERSION}-bin.tar.gz -C /opt/maven && \
    rm apache-maven-${MAVEN_VERSION}-bin.tar.gz && \
    ln -s /opt/maven/apache-maven-${MAVEN_VERSION}/bin/mvn /usr/local/bin/mvn
    
RUN ["mvn", "clean", "package"]
COPY ./target/envTest-0.0.1-SNAPSHOT.jar .
EXPOSE 8081
CMD exec $JAVA_HOME/bin/java $JAVA_OPTS -jar /opt/test/envTest-0.0.1-SNAPSHOT.jar
