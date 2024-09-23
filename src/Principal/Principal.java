package Principal;

import AluraLatam.Monedas.Conversor.Modelos.ConsultaDivisa;
import AluraLatam.Monedas.Conversor.Modelos.Historial;
import AluraLatam.Monedas.Conversor.Modelos.Moneda;
import AluraLatam.Monedas.Conversor.Modelos.CurrencyCodes;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

// Esta es la clase principal que ejecuta el programa de conversión de monedas.
public class Principal {
    public static void main(String[] args) {
        // Instancio el Scanner para leer la entrada del usuario.
        Scanner scan = new Scanner(System.in);

        // Instancio ConsultaDivisa que se encargará de realizar las solicitudes a la API.
        ConsultaDivisa consulta = new ConsultaDivisa();

        // Lista donde se guardarán todas las conversiones realizadas.
        List<Historial> historialList = new ArrayList<>();

        Moneda moneda = null;  // Inicializo la variable moneda donde se guardarán los resultados.
        int opcion = 0;        // Variable para guardar la opción del menú que elija el usuario.
        Double monto = 0.0;    // Variable para guardar el monto que el usuario desea convertir.

        // Bucle principal que muestra el menú hasta que el usuario elija la opción de salir (9).
        while (opcion != 9) {
            System.out.println("*************************************************");
            System.out.println("Bienvenidxs al conversor de monedas");
            System.out.println("""
                    1. Dolar a Pesos argentinos.
                    2. Pesos argentinos a Dolar.
                    3. Dolar a Real.
                    4. Real a Dolar.
                    5. Dolar a Franco suizo.
                    6. Franco suizo a Dolar.
                    7. Dolar a Euro.
                    8. Euro a Dolar.
                    9. SALIR.""");

            System.out.println("*************************************************");
            System.out.println("Ingrese una opción:");

            try {
                // Leo la opción elegida por el usuario.
                opcion = Integer.parseInt(scan.nextLine());

                // Si la opción es válida (1 a 8), le pido al usuario que ingrese el monto a convertir.
                if (opcion >= 1 && opcion <= 8) {
                    System.out.println("Ingrese el monto a convertir:");
                    monto = Double.parseDouble(scan.nextLine());
                }

                // Según la opción elegida, llamo al método buscaMoneda con los códigos de monedas correspondientes.
                switch (opcion) {
                    case 1:
                        moneda = consulta.buscaMoneda(CurrencyCodes.USD, CurrencyCodes.ARS, monto);
                        historialList.add(new Historial(CurrencyCodes.USD, CurrencyCodes.ARS, monto, moneda.conversion_result()));
                        System.out.println("El monto es: " + moneda.conversion_result() + " pesos argentinos");
                        break;
                    case 2:
                        moneda = consulta.buscaMoneda(CurrencyCodes.ARS, CurrencyCodes.USD, monto);
                        historialList.add(new Historial(CurrencyCodes.ARS, CurrencyCodes.USD, monto, moneda.conversion_result()));
                        System.out.println("El monto es: " + moneda.conversion_result() + " dólares");
                        break;
                    case 3:
                        moneda = consulta.buscaMoneda(CurrencyCodes.USD, CurrencyCodes.BRL, monto);
                        historialList.add(new Historial(CurrencyCodes.USD, CurrencyCodes.BRL, monto, moneda.conversion_result()));
                        System.out.println("El monto es: " + moneda.conversion_result() + " reales");
                        break;
                    case 4:
                        moneda = consulta.buscaMoneda(CurrencyCodes.BRL, CurrencyCodes.USD, monto);
                        historialList.add(new Historial(CurrencyCodes.BRL, CurrencyCodes.USD, monto, moneda.conversion_result()));
                        System.out.println("El monto es: " + moneda.conversion_result() + " dólares");
                        break;
                    case 5:
                        moneda = consulta.buscaMoneda(CurrencyCodes.USD, CurrencyCodes.CHF, monto);
                        historialList.add(new Historial(CurrencyCodes.USD, CurrencyCodes.CHF, monto, moneda.conversion_result()));
                        System.out.println("El monto es: " + moneda.conversion_result() + " francos suizos");
                        break;
                    case 6:
                        moneda = consulta.buscaMoneda(CurrencyCodes.CHF, CurrencyCodes.USD, monto);
                        historialList.add(new Historial(CurrencyCodes.CHF, CurrencyCodes.USD, monto, moneda.conversion_result()));
                        System.out.println("El monto es: " + moneda.conversion_result() + " dólares");
                        break;
                    case 7:
                        moneda = consulta.buscaMoneda(CurrencyCodes.USD, CurrencyCodes.EUR, monto);
                        historialList.add(new Historial(CurrencyCodes.USD, CurrencyCodes.EUR, monto, moneda.conversion_result()));
                        System.out.println("El monto es: " + moneda.conversion_result() + " euros");
                        break;
                    case 8:
                        moneda = consulta.buscaMoneda(CurrencyCodes.EUR, CurrencyCodes.USD, monto);
                        historialList.add(new Historial(CurrencyCodes.EUR, CurrencyCodes.USD, monto, moneda.conversion_result()));
                        System.out.println("El monto es: " + moneda.conversion_result() + " dólares");
                        break;
                    case 9:
                        // Si el usuario elige salir (opción 9), muestro el historial de conversiones realizadas.
                        System.out.println("Historial de conversiones:");
                        for (Historial h : historialList) {
                            System.out.println(h);
                        }
                        break;
                    default:
                        // Si elige una opción no válida, muestro un mensaje de error.
                        System.out.println("Opción no válida, por favor elija una opción entre 1 y 9.");
                        break;
                }
            } catch (NumberFormatException e) {
                // Si ocurre una excepción porque el usuario ingresó algo no numérico, muestro un mensaje de error.
                System.out.println("Error: debe ingresar un número válido.");
            }
        }
    }
}
