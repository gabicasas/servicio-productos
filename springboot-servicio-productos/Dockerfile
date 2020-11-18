FROM openjdk:11
VOLUME /tmp

ADD ./target/springboot-servicio-productos-0.0.1-SNAPSHOT.jar servicio-productos.jar
ENTRYPOINT ["java", "-jar", "servicio-productos.jar"]
#crear docker build config-server:v1 .
#

#docker run -p 8888<el que sea>:8888 --name <asdfafconfig-server> --network network-spring config-server:v1


