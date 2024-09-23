package AluraLatam.Monedas.Conversor.Modelos;

import java.time.LocalDateTime;

// Esta clase guarda los detalles de cada conversión realizada, incluyendo la marca de tiempo.
public class Historial {
    private String baseCode;     // Código de la moneda de origen.
    private String targetCode;   // Código de la moneda de destino.
    private double monto;        // Monto convertido.
    private double resultado;    // Resultado de la conversión.
    private LocalDateTime timestamp; // Marca de tiempo de cuando se realizó la conversión.

    // Constructor que recibe los detalles de la conversión y automáticamente añade la fecha/hora actual.
    public Historial(String baseCode, String targetCode, double monto, double resultado) {
        this.baseCode = baseCode;
        this.targetCode = targetCode;
        this.monto = monto;
        this.resultado = resultado;
        this.timestamp = LocalDateTime.now();  // Guardo la marca de tiempo actual.
    }

    // Método que devuelve una representación en texto de la conversión realizada.
    @Override
    public String toString() {
        return "Conversión realizada el " + timestamp + ": " + monto + " " + baseCode + " a " + resultado + " " + targetCode;
    }
}
