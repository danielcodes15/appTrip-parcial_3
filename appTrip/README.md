# AppTrip - Proyecto Universidad

Proyecto Spring Boot MVC adaptado al estilo de las guías de clase.

## Tecnologías

- Java 17
- Spring Boot
- Spring MVC
- Thymeleaf
- Spring Data JPA
- MySQL
- Bootstrap local

## Estructura de paquetes

```text
com.sv.appTrip
 ├── controllers
 ├── models
 ├── repository
 └── services
```

## Base de datos

Nombre de base de datos:

```sql
apptrip
```

Tablas:

- perfil
- categoria
- usuario
- trip
- perfil_usuario
- trip_usuario

El script está en:

```text
src/main/resources/database/apptrip.sql
```

## Configuración MySQL

Archivo:

```text
src/main/resources/application.properties
```

Por defecto está configurado así:

```properties
spring.datasource.username=root
spring.datasource.password=
```

Si tu MySQL tiene contraseña, cambia esa línea.

## Cómo ejecutar

1. Crear la base de datos en MySQL:

```sql
CREATE DATABASE apptrip;
```

2. Abrir el proyecto en Spring Tool Suite, Eclipse, IntelliJ o VS Code.
3. Ejecutar la clase:

```text
AppTripApplication.java
```

4. Entrar en el navegador:

```text
http://localhost:8080/
```

## Rutas principales

```text
/                  Inicio con cards de Trips
/tabla             Tabla de Trips
/trips/view/{id}   Detalle de un Trip
/trips/create      Crear Trip
/categorias/index  Listar categorías
/categorias/create Crear categoría
/usuarios/index    Listar usuarios
```

## Nota

El proyecto incluye recursos dados en clase:

- imágenes de Trips
- Bootstrap local
- TinyMCE
- estructura MVC
- inyección de dependencias con servicios
