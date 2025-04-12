# 📝 TaskManager - Aplicación de Consola en Java

TaskManager es una aplicación de consola escrita en Java que permite gestionar tareas de manera sencilla. Está organizada con el patrón de diseño MVC (Modelo-Vista-Controlador) y no requiere base de datos ni herramientas externas como Maven o Gradle. El objetivo principal es ofrecer una experiencia clara y funcional para añadir, editar, eliminar, listar y marcar tareas como realizadas o no realizadas.

## 🎯 Funcionalidades

- ➕ Agregar tareas  
- 📋 Listar tareas  
- ✏️ Editar tareas  
- ✅ Marcar o desmarcar tareas como completadas  
- ❌ Eliminar tareas  
- 📊 Análisis de código estático con PMD  

## 🧠 Estructura del Proyecto

TaskManager/ ├── src/ │ ├── controller/ │ │ └── TaskController.java │ ├── model/ │ │ └── Task.java │ ├── service/ │ │ └── TaskService.java │ ├── util/ │ │ └── InputHelper.java │ └── Main.java ├── reporte_pmd.html └── README.md

markdown
Copiar
Editar

## 🚀 Cómo ejecutar la aplicación

1. Asegúrate de tener **Java** instalado y configurado en tu variable de entorno `PATH`.  
2. Abre una terminal en la carpeta raíz del proyecto y compila los archivos:

javac -d out src/**/*.java

markdown
Copiar
Editar

3. Luego ejecuta la aplicación:

java -cp out Main

shell
Copiar
Editar

## 📋 Menú principal de la aplicación

=== Task Manager ===

Agregar Tarea

Listar Tareas

Editar Tarea

Marcar/Desmarcar Tarea

Eliminar Tarea

Salir

markdown
Copiar
Editar

## 🛠️ Análisis de Código con PMD

Este proyecto utiliza [PMD](https://pmd.github.io/) como herramienta de análisis estático para detectar errores comunes, duplicaciones, código muerto y malas prácticas de programación.

### ✅ Requisitos previos

- Haber descargado PMD desde su página oficial.
- Tener agregado el directorio `/bin` de PMD a tu variable de entorno `PATH`.
- Tener instalado Java.

### 🔍 Comando para analizar con PMD

Desde la raíz del proyecto, ejecuta:

pmd check -d src -R rulesets/java/quickstart.xml -f html -r reporte_pmd.html

python
Copiar
Editar

> Este comando genera un archivo `reporte_pmd.html` con los resultados del análisis.

### 📂 Ver el reporte

Abre el archivo `reporte_pmd.html` en tu navegador para revisar los resultados del análisis de calidad del código.

## 👨‍💻 Autor

Desarrollado por un estudiante de Ingeniería de Sistemas con enfoque en buenas pr