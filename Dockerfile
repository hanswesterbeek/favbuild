FROM frolvlad/alpine-oraclejdk8:slim
VOLUME /tmp
RUN sh -c 'touch /app.jar' && apk update && apk add curl
ENTRYPOINT [ "sh", "-c", "java $JAVA_OPTS -jar /app.jar" ]
ADD favbuild.jar app.jar
