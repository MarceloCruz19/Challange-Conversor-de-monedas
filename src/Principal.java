import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner lectura = new Scanner(System.in);
        ConsultaMoneda consulta = new ConsultaMoneda();

        int opcion = 0;
        while (opcion !=8) {
            System.out.println("****************\n"+
                    "Bienvenidos al conversor de monedas\n\n"+
                    "1. Dolar a Peso Mexicano\n"+
                    "2. Peso Mexicano a Dolar\n"+
                    "3. Dolar a Real Brasileño\n"+
                    "4. Real Brasileño a Dolar\n"+
                    "5. Dolar a Euro\n"+
                    "6. Euro a dolar\n"+
                    "7. Convertir otra moneda\n"+
                    "8. Salir\n"+
                    "Ingresa el número de la conversión que desea realizar: ");

            opcion = lectura.nextInt();
            lectura.nextLine();

            switch (opcion) {
                case 1:
                    ConversorMoneda.conversor("USD", "MXN", consulta, lectura);
                    break;
                case 2:
                    ConversorMoneda.conversor("MXN", "USD", consulta, lectura);
                    break;
                case 3:
                    ConversorMoneda.conversor("USD","BRL", consulta, lectura);
                    break;
                case 4:
                    ConversorMoneda.conversor("BRL","USD", consulta, lectura);
                    break;
                case 5:
                    ConversorMoneda.conversor("USD","EUR", consulta, lectura);
                    break;
                case 6:
                    ConversorMoneda.conversor("EUR","USD", consulta, lectura);
                    break;
                case 7:
                    ConversorMoneda.conversorDeOtraMoneda(consulta, lectura);
                    break;
                case 8:
                    System.out.println("Programa terminado.");
                    break;
                default:
                    System.out.println("Opción no válida.");
                    break;
            }
        }
    }
}