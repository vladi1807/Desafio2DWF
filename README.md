link del video

https://drive.google.com/file/d/1UzxwVg8WMMzGPWXOZAaSrhpc3sNVruU9/view?usp=drive_link

#Sistema Educativo API
API desarrollada con Spring Boot para la gestión de alumnos, profesores y materias.
##Tecnologías utilizadas
- Java 17+
- Spring Boot
- Spring Data JPA
- MySQL
- Maven
- Swagger (OpenAPI)
##Arquitectura
El proyecto utiliza una arquitectura en capas:
- **Model**: Representa las entidades de la base de datos
- **Repository**: Acceso a datos usando JPA
- **Service**: Lógica de negocio
- **Controller**: Manejo de peticiones HTTP (API REST)
##Entidades
- Alumno
- Profesor
- Materia
- AlumnoMateria (relación entre alumno y materia)
##Configuración
### 1. Crear base de datos

sql
CREATE DATABASE colegio;

application.properties

spring.datasource.url=jdbc:mysql://localhost:3306/colegio
spring.datasource.username=root
spring.datasource.password=

spring.jpa.hibernate.ddl-auto=update
spring.jpa.show-sql=true

Ejecutar la clase 

SistemaEducativoApplication.java

swagger

http://localhost:8080/swagger-ui/index.html

Angel Vladimir Argueta Portillo
