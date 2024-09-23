package AluraLatam.Monedas.Conversor.Modelos;

import com.google.gson.Gson;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

// Esta clase maneja las consultas a la API externa de tipo de cambio.
public class ConsultaDivisa {

    // Llave de la API para autenticar la solicitud.
    String ApiKey = "94d0ba2ffa4720582a7a77b1";

    // Este método realiza la conversión de moneda tomando como parámetros el código de la moneda base,
    // el código de la moneda de destino y el monto a convertir.
    public Moneda buscaMoneda(String baseCode, String targetCode, double monto) {

        // Construyo la URI que va a hacer la consulta a la API con los parámetros baseCode, targetCode y monto.
        URI direccion = URI.create("https://v6.exchangerate-api.com/v6/" + ApiKey + "/pair/" + baseCode + "/" + targetCode + "/" + monto);

        // Configuro el cliente HTTP que se encargará de enviar la solicitud a la API.
        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder()
                .uri(direccion)
                .build();

        try {
            // Envío la solicitud y guardo la respuesta.
            HttpResponse<String> response = client
                    .send(request, HttpResponse.BodyHandlers.ofString());

            // Si la respuesta no es exitosa, lanzo una excepción.
            if (response.statusCode() != 200) {
                throw new RuntimeException("Error en la solicitud: " + response.statusCode());
            }

            // Devuelvo el objeto Moneda después de convertir la respuesta JSON a una instancia de Moneda.
            return new Gson().fromJson(response.body(), Moneda.class);

        } catch (Exception e) {
            // Si algo falla durante la solicitud, lanzo una excepción indicando el error.
            throw new RuntimeException("Error al buscar la moneda: " + e.getMessage());
        }
    }
}
