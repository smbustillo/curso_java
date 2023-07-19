import java.math.RoundingMode;
import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.util.Locale;
import java.util.Scanner;

public class CalculoCambio {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        System.out.println("Ingrese el precio del producto..");
        Scanner teclado = new Scanner(System.in);
        double precio = teclado.nextDouble();

        System.out.println("Ingrese cantidad pagada...");
        double pago = teclado.nextDouble();

        double cambio = pago - precio;

        System.out.println("Hay que devolver..." + cambio);
    }
}
