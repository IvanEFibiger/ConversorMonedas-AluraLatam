package AluraLatam.Monedas.Conversor.Modelos;

// Uso un record para crear una clase inmutable que guarda los detalles de la conversión.
public record Moneda(String base_code,      // Moneda base
                     String target_code,    // Moneda de destino
                     Double conversion_rate,  // Tasa de conversión
                     Double conversion_result){  // Resultado de la conversión
}
