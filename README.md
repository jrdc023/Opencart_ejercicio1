# README - Prueba E2E en OpenCart con Serenity BDD

## 📌 Descripción

Este proyecto contiene una prueba funcional automatizada End-to-End (E2E) para el flujo de compra en la tienda OpenCart. Se utiliza Serenity BDD junto con Cucumber y Selenium para la automatización.

## 🛠️ Tecnologías Utilizadas

* Java 11 o superior

* Maven como gestor de dependencias

* Serenity BDD para reportes detallados

* Cucumber para definir escenarios

* Selenium WebDriver para la automatización del navegador

## 📂 Estructura del Proyecto

opencart-serenity


│── src


│   ├── test


│   │   ├── java


│   │   │   ├── com.opencart.tests


│   │   │   │   ├── steps (Pasos de las pruebas)


│   │   │   │   ├── pages (Page Objects de la aplicación)


│   │   │   │   ├── runners (Configuración de ejecución)


│   │   ├── resources


│   │   │   ├── features (Archivos .feature con escenarios de prueba)


│── pom.xml (Archivo de configuración de Maven)


│── README.md (Este archivo)


## 🚀 Instalación y Configuración

### 1️⃣ Clonar el repositorio

git clone <URL_DEL_REPOSITORIO>
cd opencart-serenity

### 2️⃣ Configurar el entorno

 * Asegúrate de tener Java 11 o superior instalado y configurado.

 * Asegúrate de que Maven esté correctamente instalado y funcionando:
   mvn -version

### 3️⃣ Ejecutar las pruebas

  * Ejecuta los tests desde la terminal con el siguiente comando:

    mvn clean verify

Esto ejecutará la prueba y generará un reporte en target/site/serenity/index.html.

### 📝 Escenario de Prueba (Cucumber)

El flujo automatizado sigue estos pasos:

1. Agregar dos productos al carrito

2. Visualizar el carrito

3. Completar el checkout como invitado

4. Finalizar la compra hasta la confirmación

### 📊 Reportes de Serenity

Después de ejecutar las pruebas, puedes ver los reportes detallados en:
