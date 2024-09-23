# 🏦 Conversor de Monedas - Alura Latam

¡Bienvenidos a mi proyecto de conversor de monedas! Este programa permite realizar conversiones entre diferentes divisas utilizando una API externa para obtener los tipos de cambio en tiempo real. Desarrollado en **Java**, el objetivo es ofrecer una solución rápida y eficiente para realizar conversiones entre múltiples monedas de forma precisa.

## 🚀 Funcionalidades

- Conversión en tiempo real de **USD** a **ARS**, **BRL**, **CHF**, **EUR** y viceversa.
- Registro de cada conversión realizada, incluyendo:
    - Monedas involucradas.
    - Monto original y convertido.
    - **Marca de tiempo** de la transacción.
- Manejo de errores para entradas inválidas y fallos en la consulta a la API.
- Historial de conversiones mostradas al usuario.

## 🛠️ Tecnologías Utilizadas

- **Lenguaje**: Java 17
- **Librerías**:
    - [Java HttpClient](https://docs.oracle.com/en/java/javase/11/docs/api/java.net.http/java/net/http/HttpClient.html): Para realizar solicitudes a la API.
    - [Gson](https://github.com/google/gson): Para deserializar la respuesta JSON.
    - [java.time](https://docs.oracle.com/javase/8/docs/api/java/time/package-summary.html): Para gestionar fechas y horas.
- **API**: [ExchangeRate-API](https://www.exchangerate-api.com/) - Para obtener los tipos de cambio.

## ⚙️ Requisitos del Sistema

- Java 17 o superior
- Conexión a internet para acceder a la API de Exchange Rate

## 📦 Instalación y Ejecución

1. **Clona este repositorio**:
   ```bash
   git clone https://github.com/tu-usuario/conversor-de-monedas.git
2. **Navega al directorio del proyecto:**
   ```bash
    cd conversor-de-monedas
3. **Compila y ejecuta el programa:**
   ```bash
    javac Principal.java
    java Principal
   
## 📜 Uso del Programa

Al ejecutar el programa, se mostrará un menú interactivo en la terminal donde podrás elegir la conversión de monedas:

1. Selecciona una de las opciones del menú (por ejemplo, convertir de USD a ARS).
2. Ingresa el monto que deseas convertir.
3. El programa consultará la API y te mostrará el monto convertido.
4. Al finalizar, puedes ver un historial de las conversiones realizadas.

### Ejemplo de salida:
    
    *************************************************
    Bienvenidxs al conversor de monedas
    1. Dolar a Pesos argentinos.
    2. Pesos argentinos a Dolar.
    3. Dolar a Real.
          ...
    9. SALIR.
    *************************************************
    Ingrese una opción: 1
    Ingrese el monto a convertir: 100
    El monto es: 96575.0 pesos argentinos

## 📖 Historial de Conversiones
El programa mantiene un historial de conversiones realizadas que se muestra al salir del programa. Este historial incluye:

* Monedas convertidas.
* Montos originales y convertidos.
* Fecha y hora de la transacción.
### Ejemplo

    Historial de conversiones:
    Has convertido 100 USD a 96575.0 ARS el 2024-09-22 14:35:50
    Has convertido 200 EUR a 223.22 USD el 2024-09-22 14:36:10


## 📈 Mejoras Futuras
Añadir soporte para más monedas y regiones.
Implementar una interfaz gráfica para mayor accesibilidad.
Guardar el historial de conversiones en un archivo de texto o base de datos.


## 💼 Sobre el Desarrollador
Mi nombre es Ivan Fibiger, y soy parte del programa ONE. Mi especialidad es el desarrollo backend en Java y Python, y me apasiona crear soluciones tecnológicas innovadoras. Si deseas conocer más sobre este u otros proyectos, no dudes en contactarme o visitar mi [GitHub](https://github.com/IvanEFibiger) y [LinkedIn](https://www.linkedin.com/in/ivan-fibiger/).