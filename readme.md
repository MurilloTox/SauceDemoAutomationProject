# POM Practice - Selenium Testing

Este proyecto automatiza la aplicación web [Sauce Demo](https://www.saucedemo.com/) utilizando Selenium con Java y TestNG. El objetivo es implementar pruebas automatizadas para los siguientes escenarios:

## Escenarios de Prueba

1. **Compra de un Producto**
   - Realiza el flujo completo de compra en la página.
   - Selecciona un producto aleatorio, agrégalo al carrito.
   - Completa los datos personales y verifica que llegas a la página de "Thank you for your purchase".

2. **Eliminación de Elementos del Carrito de Compras**
   - Agrega 3 elementos diferentes al carrito de compras.
   - Entra a la página del carrito, elimina los elementos y verifica que el carrito esté vacío.

3. **Cerrar Sesión**
   - Intenta cerrar sesión y verifica que eres redirigido correctamente a la página de inicio de sesión.

## Reglas de Implementación

- Implementar correctamente el **Page Object Model (POM)**, reutilizando elementos y definiendo páginas base para métodos y elementos comunes.
- Uso de **Page Factory** es requerido.
- Utilizar anotaciones `@Before` para manejar precondiciones. Implementar otras anotaciones según sea necesario.

## Configuración del Proyecto

1. **Requisitos Previos**
   - Java Development Kit (JDK)
   - Apache Maven
   - Selenium WebDriver
   - TestNG

2. **Configuración Inicial**
   - Clona este repositorio.
   - Configura el proyecto en tu entorno de desarrollo preferido.
   - Asegúrate de tener las dependencias necesarias en tu archivo `pom.xml`.

3. **Ejecución de Pruebas**
   - Ejecuta las pruebas utilizando TestNG.
   - Verifica los resultados en el reporte generado.
   - Cuando termina la rpueba esta cierra la página automáticamente.

     
