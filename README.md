<div align="center">

# ☕ Paradigmas de Programación — 2° Parcial

**Centro Universitario UAEMéx Atlacomulco · Ingeniería en Computación (ICO 30)**

Portafolio de prácticas, proyectos en Java, patrones de diseño y desarrollo backend full-stack con Spring Boot, JPA/Hibernate, MySQL y Spring Security.

![Java](https://img.shields.io/badge/Java-17%2B-ED8B00?style=for-the-badge&logo=openjdk&logoColor=white)
![Spring Boot](https://img.shields.io/badge/Spring%20Boot-3%20%7C%204-6DB33F?style=for-the-badge&logo=springboot&logoColor=white)
![Spring Security](https://img.shields.io/badge/Spring%20Security-BCrypt-6DB33F?style=for-the-badge&logo=springsecurity&logoColor=white)
![Hibernate](https://img.shields.io/badge/Hibernate-JPA-59666C?style=for-the-badge&logo=hibernate&logoColor=white)
![MySQL](https://img.shields.io/badge/MySQL-8.0-4479A1?style=for-the-badge&logo=mysql&logoColor=white)
![Maven](https://img.shields.io/badge/Maven-Build-C71A36?style=for-the-badge&logo=apachemaven&logoColor=white)
![Postman](https://img.shields.io/badge/Postman-API%20Testing-FF6C37?style=for-the-badge&logo=postman&logoColor=white)

</div>

---

## 📋 Índice de Actividades y Reportes

| Actividad | Tema | Tecnologías / Conceptos Clave | Código | Reporte |
| :--- | :--- | :--- | :---: | :---: |
| **A16** | **Interfaz Gráfica & Spring Boot (48 Lecciones)** | MVC, Thymeleaf, REST API, DI, Excepciones, Interceptores, JPA/Hibernate, MySQL, Frontend Web, Spring Security (BCrypt) | [📁 Abrir](./A16%20Interfaz%20Gr%C3%A1fica) | [📄 Ver PDF](./A16%20Interfaz%20Gr%C3%A1fica/RSPRINGBOOT.pdf) |
| **A17** | **Clases Genéricas (`<T>`)** | Genéricos simples y múltiples (`<K, V>`), tipos acotados (`extends Number`), Pila LIFO genérica, objetos personalizados | [📁 Abrir](./A17%20Clases%20Genericas) | [📄 Ver PDF](./A17%20Clases%20Genericas/RCLASESGENERICAS.pdf) |
| **A18** | **Colecciones e Iteradores** | `ArrayList`, `LinkedList`, `HashSet`, `TreeSet`, `HashMap`, `TreeMap`, `Iterator`, `ListIterator` | [📁 Abrir](./A18%20Colecciones%20e%20Iteradores) | [📄 Ver PDF](./A18%20Colecciones%20e%20Iteradores/RCOLLECTIONS.pdf) |
| **A20** | **Patrón de Diseño DAO** | Interfaz genérica `DAO<T>`, serialización binaria (`.dat`), persistencia MySQL con JDBC (`PreparedStatement`), UML | [📁 Abrir](./A20%20Ejercicio%20DAO) | [📄 Ver PDF](./A20%20Ejercicio%20DAO/RDAO.pdf) |

---

## 🗂️ Estructura del Repositorio

```text
📦 PARADIGMAS-2-PARCIAL-
 ┣ 📂 A16 Interfaz Gráfica
 ┃ ┣ 📂 spring-boot-app1       # Lecciones 01–18: MVC, Thymeleaf, REST, DTO, @RequestParam, @PathVariable, @Value, JAR
 ┃ ┣ 📂 libreria               # Lecciones 20–31: Inyección de Dependencias, Inmutabilidad, Cloneable, Excepciones e Interceptores
 ┃ ┣ 📂 ferreteria             # Lecciones 32–48: JPA/Hibernate + MySQL, Mapper/DTO, CRUD completo, Frontend Web y Spring Security
 ┃ ┗ 📄 RSPRINGBOOT.pdf
 ┣ 📂 A17 Clases Genericas     # Almacen, ParGenerico, CalculadoraNumerica, PilaGenerica, ContenedorObjetos + RCLASESGENERICAS.pdf
 ┣ 📂 A18 Colecciones e Iteradores # DemoCollections, ArrayList, HashSet, LinkedList, Mapas, Iterator, ListIterator, TreeSet + RCOLLECTIONS.pdf
 ┣ 📂 A20 Ejercicio DAO        # DAO<T>, Estudiante, EstudianteDAOArchivo (.dat), EstudianteDAOMySQL (JDBC), Main + RDAO.pdf
 ┣ 📜 .gitignore
 ┗ 📜 README.md
```

---

## 🚀 Detalle de Proyectos

### 1. `A16 Interfaz Gráfica` — Curso Completo Java Spring Boot (48 Lecciones)
Dividido en tres proyectos Maven progresivos:
* **[`spring-boot-app1`](./A16%20Interfaz%20Gr%C3%A1fica/spring-boot-app1):** Fundamentos de Spring Boot, controladores `@Controller` y `@RestController`, plantillas dinámicas con Thymeleaf, `@ModelAttribute`, `@RequestParam`, `@PathVariable`, `@RequestBody` (POST en Postman), inyección de propiedades con `@Value` y empaquetado `.jar` por consola.
* **[`libreria`](./A16%20Interfaz%20Gr%C3%A1fica/libreria):** Arquitectura por capas desacoplada con interfaces de Servicio y Repositorio, Inyección de Dependencias e Inmutabilidad (`private final`), clonación de objetos (`Cloneable`), manejo global de excepciones (`@ControllerAdvice` / `@ExceptionHandler`) e interceptores HTTP (`HandlerInterceptor`).
* **[`ferreteria`](./A16%20Interfaz%20Gr%C3%A1fica/ferreteria):** Aplicación full-stack conectada a MySQL (`db_ferreteria`) con **Spring Data JPA / Hibernate**, patrón **DTO + Mapper**, operaciones CRUD completas (`GET`, `POST`, `PUT`, `DELETE`), interfaz web interactiva (`index.html` con `fetch` + CORS) y autenticación con roles y contraseñas encriptadas con **BCrypt** en **Spring Security**.

### 2. `A17 Clases Genericas`
Cinco programas independientes en Java enfocados en reutilización y seguridad de tipos en tiempo de compilación (*Type Safety*): almacenamiento simple (`Almacen<T>`), pares clave-valor (`ParGenerico<K, V>`), genéricos acotados (`CalculadoraNumerica<T extends Number>`), estructura LIFO (`PilaGenerica<T>`) y contenedores para objetos personalizados (`ContenedorObjetos<T>`).

### 3. `A18 Colecciones e Iteradores`
Ocho ejercicios prácticos del **Java Collections Framework (`java.util`)** comparando rendimiento, ordenamiento y control de duplicados entre `ArrayList`, `LinkedList`, `HashSet`, `TreeSet`, `HashMap` y `TreeMap`, además de recorrido seguro, eliminación con `Iterator` y navegación bidireccional con `ListIterator`.

### 4. `A20 Ejercicio DAO`
Implementación del patrón **Data Access Object (DAO)** mediante una interfaz genérica `DAO<T>` con dos estrategias intercambiables sin alterar la lógica en `Main.java`:
* **Persistencia local:** Serialización de objetos `Estudiante` en archivo binario (`estudiantes_uaemex.dat`).
* **Persistencia relacional:** Conexión directa a MySQL (`universidad_db`) mediante JDBC y `PreparedStatement`.

---

## ⚙️ Requisitos y Ejecución

* **JDK 17+** y **Maven** (o el wrapper incluido `./mvnw`).
* **MySQL Server 8+** (requerido para `A20 Ejercicio DAO` con `universidad_db` y `A16/ferreteria` con `db_ferreteria`).
* **VS Code** con *Extension Pack for Java* y *Spring Boot Extension Pack* (o IntelliJ IDEA).

### Ejecutar cualquiera de los proyectos Spring Boot
```bash
# Entra al proyecto que quieras probar (spring-boot-app1, libreria o ferreteria)
cd "A16 Interfaz Gráfica/ferreteria"

# Arranca el servidor embebido
./mvnw spring-boot:run
```
> **Nota:** Antes de arrancar `ferreteria` o `A20 Ejercicio DAO`, asegúrate de tener activo tu servicio de MySQL y configuradas tus credenciales locales en `application.properties` o `EstudianteDAOMySQL.java`.

---

## 👨‍💻 Información Académica

* **Estudiante:** Ángel Apolonio Sánchez Sánchez ([`@EarthGT8`](https://github.com/EarthGT8))
* **Docente:** Julio Alberto De La Teja Lopez
* **Materia:** Paradigmas de Programación
* **Grupo:** ICO 30 — Ingeniería en Computación, UAEMéx Atlacomulco
