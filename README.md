<p align="center">
  <img src="https://i.imgur.com/ar1z86m.png" alt="logo" width="400">
</p>
<br>

Officium SpringBoot API es un servicio de backend desarrollado para la aplicación Officium elaborado utilizando los conceptos de "Arquitectura Hexagonal" o "Puertos y Adaptadores" para obtener una capa de dominio y capa de aplicación que se desacopla del framework principal, en este caso de "Spring Boot" y de otros detalles de implementación, como lo es la utilización de "PostgreSQL" como base de datos.

### :page_facing_up: Tabla de Contenidos

---

Este README consiste de las siguientes partes, listadas a continuación:

- [Colaboradores de Desarrollo](#man_technologist-colaboradores-de-desarrollo)
- [Stack de Tecnologías](#computer-stack-de-tecnologías)
- [Instalación de la Aplicación](#wrench-instalación-de-la-aplicación)
- [Construcción de la Aplicación (build)](#hammer-construcción-de-la-aplicación-build)
- [Ejecución de la Aplicación](#electric_plug-ejecución-de-la-aplicación)
- [Ejecución de las Pruebas Automatizadas](#test_tube-ejecución-de-las-pruebas-automatizadas)
- [Referencias](#mag_right-referencias)

Adicionalmente, se utilizan las siguientes plantillas para el repositorio:

- [Commit](https://github.com/OrangeSoft-Team/readme-guide/blob/main/Commit.md)
- [Pull Request](https://github.com/OrangeSoft-Team/readme-guide/blob/main/Pull_Request.md)
- [Issue](https://github.com/OrangeSoft-Team/readme-guide/blob/main/Issue.md)

### :man_technologist: Colaboradores de Desarrollo

---

| Nombre y Apellido    | Usuario    | Enlace                        |
| -------------------- | ---------- | ----------------------------- |
| Isaac Da Pena | IxDevel   | https://github.com/IxDevel   |
| Daniel Luis     | daluisgarcia | https://github.com/daluisgarcia |
| Diorfelis Medina         | Diormsmith  | https://github.com/Diormsmith  |

### :computer: Stack de Tecnologías

---

| Logo                                                                                                                                                                                                                                                                                                | Tipo                       | Nombre         | Enlace de Descarga                       | Versión |
| --------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------- | -------------------------- | -------------- | ---------------------------------------- | ------- |
| <img src="https://seeklogo.com/images/J/java-logo-7F8B35BAB3-seeklogo.com.png" width="24">                                                                                                                                                                                                 | Lenguaje                   | Java     | https://www.oracle.com/java/technologies/javase-jdk16-downloads.html  | 16    |
| <img src="https://upload.wikimedia.org/wikipedia/commons/thumb/9/9c/IntelliJ_IDEA_Icon.svg/1024px-IntelliJ_IDEA_Icon.svg.png" width="24">                                                                                                                                                                                                                                    | Ambiente de desarrollo      | IntelliJ IDEA        | https://www.jetbrains.com/es-es/idea/download/         | 2021.1.3 |
| <img src="https://upload.wikimedia.org/wikipedia/commons/thumb/5/52/Apache_Maven_logo.svg/2560px-Apache_Maven_logo.svg.png" width="24">                                                                                                                                                                               | Manejador de Dependencias  | Maven            | https://maven.apache.org/download.cgi            | 3.8.1  |
| <img src="https://upload.wikimedia.org/wikipedia/commons/thumb/2/29/Postgresql_elephant.svg/1200px-Postgresql_elephant.svg.png" width="24">                                                                                                                                                         | Manejador de base de datos | PostgreSQL     | https://www.postgresql.org/download/     | 13.1    |
| <img src="https://spring.io/images/spring-logo-9146a4d3298760c2e7e49595184e1975.svg" width="24">                                                                                                                                                                 | Framework                  | Spring Boot        | https://spring.io/projects/spring-boot    | 2.5.1  |
| <img src="https://upload.wikimedia.org/wikipedia/commons/2/2c/Mockito_Logo.png" width="24">                                                                                                                                                                                                                   | Testing                    | Mockito          | https://site.mockito.org/  | 3  |
| <img src="https://junit.org/junit5/assets/img/junit5-logo.png" width="24">                                                                                                                                                                                                                                                 | Testing                    | junit       | https://junit.org/junit5/ | 5   |



### :wrench: Instalación de la Aplicación

---

Para realizar la instalación de la aplicación, es necesario realizar los siguientes pasos:

- Previo a la instalación de la aplicación, debe crear una bases de datos en PostgreSQL 13, para la misma.

- Clone el repositorio

- De preferencia abra la carpeta del proyecto como un proeycto de IntelliJ IDEA

- Cree un archivo application.properties en la ruta "src/main/resources" y copie el contenido del archivo application.properties.example en este.

- Llene los datos en este nuevo archivo con las credenciales de la base de datos postgreSQL que creó.


### :hammer: Construcción de la Aplicación (build)

---

Para hacer build de la aplicación y que la misma pueda funcionar debe hacer los siguientes pasos dentro del IDE IntelliJ IDEA:

- Ejecute el proyecto presionando el boton de play verde arriba a la derecha en el IDE.

- Una vez realizado esto el IDE se encargará de hacer build y ejecutar al aplicación

### :electric_plug: Ejecución de la Aplicación

---

Una vez realizados los pasos anteriores solo queda hacer solicitudes a la aplicación mediante la url `http://localhost:8080/api`

### :test_tube: Ejecución de las Pruebas Automatizadas

---

Para la ejecución de las prueba se deben realizar los siguiente pasos:

- Desde IntelliJ IDEA ubiquese en la carpeta 'src/test'

- Haga click derecho sobre la carpeta llamada 'java' y elija la opción que dice "Run" o "Run 'All Tests' "


### :mag_right: Referencias

---

- [Clean Architecture por Robert C. Martin (Libro) ](https://www.amazon.com/Clean-Architecture-Craftsmans-Software-Structure/dp/0134494164)
- [Get your Hands Dirty on Clean Architecture por Tom Hombergs (Libro) ](https://www.amazon.com/-/es/Tom-Hombergs/dp/1839211962)
- [Introducción a DDD y arquitectura hexagonal con un ejemplo de aplicación en Java](https://picodotdev.github.io/blog-bitix/2021/02/introduccion-a-ddd-y-arquitectura-hexagonal-con-un-ejemplo-de-aplicacion-en-java/)
- [Documentación de Spring Boot](https://spring.io/)