FROM 10.10.101.22:8443/middleware/openjdk:11.0.15-jdk
RUN ln -sf /usr/share/zoneinfo/Asia/Shanghai /etc/localtime && echo "Asia/Shanghai" > /etc/timezone
COPY target/*.jar /bootdo.jar
ENTRYPOINT [ "sh", "-c", "java -jar $JAVA_OPTS /bootdo.jar" ]