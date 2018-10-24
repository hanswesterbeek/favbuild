FROM frolvlad/alpine-oraclejdk8:slim
MAINTAINER hanswesterbeek
VOLUME /tmp
RUN sh -c 'touch /app.jar' && apk update && apk add curl
ENTRYPOINT [ "sh", "-c", "java $JAVA_OPTS -jar /app.jar" ]
COPY favbuild.jar app.jar
