# Usa una imagen base con Java 17
FROM openjdk:17-jdk-alpine

# Crea un directorio de trabajo
WORKDIR /app

# Copia el archivo .jar compilado al contenedor
COPY target/pagos-1.0-SNAPSHOT.jar app.jar

# Comando para ejecutar el microservicio
ENTRYPOINT ["java", "-jar", "/app/app.jar"]
