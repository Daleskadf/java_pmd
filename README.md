## 🚀 Cómo ejecutar la aplicación

1. Asegúrate de tener **Java** instalado y configurado en tu variable de entorno `PATH`.  
2. Abre una terminal en la carpeta raíz del proyecto y compila los archivos:

> javac -d out src/**/*.java

3. Luego ejecuta la aplicación:

> java -cp out Main


## 🛠️ Análisis de Código con PMD

Este proyecto utiliza [PMD](https://pmd.github.io/) como herramienta de análisis estático para detectar errores comunes, duplicaciones, código muerto y malas prácticas de programación.

### ✅ Requisitos previos

- Haber descargado PMD desde su página oficial.
- Tener agregado el directorio `/bin` de PMD a tu variable de entorno `PATH`.
- Tener instalado Java.

### 🔍 Comando para analizar con PMD

Desde la raíz del proyecto, ejecuta:

pmd check -d src -R rulesets/java/quickstart.xml -f html -r reporte_pmd.html

> Este comando genera un archivo `reporte_pmd.html` con los resultados del análisis.

### 📂 Ver el reporte

Abre el archivo `reporte_pmd.html` en tu navegador para revisar los resultados del análisis de calidad del código.
