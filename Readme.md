### README para el Proyecto de Automatización de Pruebas con Selenium

---

# My Automation Framework

Este es un framework básico de automatización de pruebas desarrollado con Selenium, Java y Maven. Utiliza el patrón de diseño Page Object Model (POM) y PageFactory para organizar las pruebas de manera eficiente. Además, se generan reportes detallados utilizando ExtentReports.

## Estructura del Proyecto

```
my-automation-framework
└───src
    ├───main
    │   ├───java
    │   │   └───com
    │   │       ├───base
    │   │       ├───pages
    │   │       └───reporter
    │   └───resources
    └───test
        ├───java
        │   └───com
        │       └───cases
        └───resources
```
## Dependencias

### Maven

El archivo `pom.xml` incluye las siguientes dependencias:

- **Selenium Java**: Para utilizar Selenium WebDriver con Java.
- **JUnit**: Framework de pruebas unitarias para ejecutar las pruebas.
- **ExtentReports**: Biblioteca para generar reportes visuales de las pruebas.

```xml
<dependencies>
    <!-- Selenium Java dependency -->
    <dependency>
        <groupId>org.seleniumhq.selenium</groupId>
        <artifactId>selenium-java</artifactId>
        <version>4.0.0</version>
    </dependency>
    
    <!-- JUnit dependency -->
    <dependency>
        <groupId>junit</groupId>
        <artifactId>junit</artifactId>
        <version>4.13.2</version>
        <scope>test</scope>
    </dependency>

    <!-- ExtentReports dependency -->
    <dependency>
        <groupId>com.aventstack</groupId>
        <artifactId>extentreports</artifactId>
        <version>5.0.9</version>
    </dependency>
</dependencies>
```

## Configuración

### Drivers

Asegúrate de descargar los drivers necesarios (por ejemplo, `chromedriver`, `geckodriver`) y colócalos en la carpeta `drivers` del proyecto. Puedes descargar los drivers desde los siguientes enlaces:

- [ChromeDriver](https://sites.google.com/a/chromium.org/chromedriver/downloads)
- [GeckoDriver](https://github.com/mozilla/geckodriver/releases)

## Ejecución de las Pruebas

Para ejecutar las pruebas, sigue estos pasos:

1. **Instala Maven**: Asegúrate de tener Maven instalado en tu sistema.
2. **Configura WebDriver**: Descarga los drivers necesarios y colócalos en la carpeta `drivers` del proyecto.
3. **Ejecuta las pruebas**: Desde la línea de comandos, navega al directorio raíz de tu proyecto (donde está el archivo `pom.xml`) y ejecuta:

   ```sh
   mvn test
   ```

Después de ejecutar las pruebas, deberías encontrar un reporte generado por ExtentReports en la carpeta `target` de tu proyecto (`target/ExtentReports.html`).



## Contribuir

Si deseas contribuir a este proyecto, por favor sigue estos pasos:

1. Haz un fork del proyecto.
2. Crea una nueva rama (`git checkout -b feature/nueva-funcionalidad`).
3. Realiza tus cambios y haz commit (`git commit -am 'Añadir nueva funcionalidad'`).
4. Haz push a la rama (`git push origin feature/nueva-funcionalidad`).
5. Abre un Pull Request.

---

Este README te proporciona una guía completa para configurar, ejecutar y contribuir a este proyecto de automatización de pruebas con Selenium.