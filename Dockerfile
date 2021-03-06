FROM java:8
VOLUME /tmp
ADD client-visit-approval*.jar client-visit-approval.jar
ADD cacerts /usr/lib/jvm/java-8-openjdk-amd64/jre/lib/security/cacerts
RUN sh -c 'touch /client-visit-approval.jar'
ENV JAVA_OPTS="-Xmx256m -Xms128m"
ENTRYPOINT [ "sh", "-c", "java $JAVA_OPTS -Djava.security.egd=file:/dev/./urandom -jar /client-visit-approval.jar" ]