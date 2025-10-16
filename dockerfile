FROM openjdk:17
WORKDIR /app

# Copiar TODOS los archivos del proyecto
COPY . .

# Dar permisos al mvnw (para Linux)
RUN chmod +x mvnw

# Compilar el proyecto
RUN ./mvnw clean package -DskipTests

EXPOSE 8080
ENTRYPOINT ["java", "-jar", "target/crud-1.0.0.jar"]