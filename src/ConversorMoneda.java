import java.util.Scanner;

public class ConversorMoneda {

    public static void conversor(String monedaBase, String monedaTarget, ConsultaMoneda consulta, Scanner lectura) {
        double cantidad;
        double cantidadConvertida;

        Monedas monedas = consulta.buscaMoneda(monedaBase, monedaTarget);
        System.out.println("La tasa de conversión de hoy"+monedaBase+" = "+monedas.conversion_rate()+" "+monedaTarget);
        System.out.println("Ingresa la cantidad de "+monedaBase);
        cantidad = Double.parseDouble(lectura.nextLine());
        cantidadConvertida = cantidad * monedas.conversion_rate();
        System.out.println(cantidad+" "+monedaBase+" = "+cantidadConvertida+" "+monedas.target_code());
    }
    public static void conversorDeOtraMoneda(ConsultaMoneda consulta, Scanner lectura) {
        System.out.println("Ingresa el código de la moneda base: ");
        String monedaBase = lectura.nextLine().toUpperCase();
        System.out.println("Ingresa el código de la moneda objetivo: ");
        String monedaObjetivo = lectura.nextLine().toUpperCase();
        conversor(monedaBase, monedaObjetivo, consulta, lectura);
    }
}
