# To-Do List App

Herramienta de gestión de tareas que permite al usuario crear, editar, marcar como completadas y eliminar tareas.

---

## Tecnologías Utilizadas

- **Backend**: 
  - Spring Boot (3.x)
  - Spring Data JPA
  - MySQL 5.7
  
- **Frontend**: 
  - HTML/Bootstrap
  - Spring Thymeleaf
    
- **Otras Herramientas**:
  - Hibernate para mapeo objeto-relacional
  - Maven para la gestión de dependencias

---

## Características

- **Gestión de tareas**: Crear, editar, eliminar y visualizar tareas.
- **Estado de tareas**: Las tareas pueden marcarse como completadas o pendientes.
- **Interfaz intuitiva**: Interfaz simple y fácil de usar para gestionar tareas.

---

## Pasos para Ejecutar el Proyecto

1. **Clonar el repositorio**:
   ```bash
   git clone <url-del-repositorio>
   ```

2. **Configurar la base de datos**:
   Asegúrate de tener una instancia de MySQL corriendo y crea la base de datos dbtodolist_app.

3. **Configurar las credenciales en application.properties**:
    Abre el archivo src/main/resources/application.properties y configura las credenciales de la base de datos:
    ```properties
    spring.application.name=todolistapp
    spring.datasource.url=jdbc:mysql://localhost:3306/dbtodo-app
    spring.datasource.username=root
    spring.datasource.password=root
    spring.jpa.hibernate.ddl-auto=update
    spring.jpa.properties.hibernate.dialect=org.hibernate.dialect.MySQLDialect
    ```
    
---

## Estructura de Base de Datos
  Tabla `tasks`:
  - `id` (INT, PRIMARY KEY)
  - `title` (VARCHAR)
  - `completed` (BIT)
