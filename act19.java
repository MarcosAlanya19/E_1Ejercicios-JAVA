import java.util.Locale;
import java.util.Scanner;

public class act19 {
    // Pide un número por teclado e indica si es un número primo o no. Un número primo es aquel
    // solo puede dividirse entre 1 y si mismo. Por ejemplo: 25 no es primo, ya que 25 es
    // divisible entre 5, sin embargo, 17 si es primo.
    //Un buen truco para calcular la raíz cuadrada del numero e ir comprobando que si es
    // divisible desde ese numero hasta 1.
    //NOTA: Si se introduce un numero menor o igual que 1, directamente es no primo.
    public static void main(String[] args) {
        boolean retry = true;
        do {
            act19.esPrimoUser();
            retry = act19.toTryAgain();
        } while (retry);
        System.out.println("FIN DEL PROGRAMA");
    }

    public static boolean esPrimo(int numero) {
        // El 0, 1 y 4 no son primos
        if (numero == 0 || numero == 1 || numero == 4) {
            return false;
        }
        for (int x = 2; x < numero / 2; x++) {
            // Si es divisible por cualquiera de estos números, no
            // es primo
            if (numero % x == 0)
                return false;
        }
        // Si no se pudo dividir por ninguno de los de arriba, sí es primo
        return true;
    }

    public static void esPrimoUser() {
        Scanner ejm19 = new Scanner(System.in);
        System.out.println("Ingresa numero");
        int numPrimo = ejm19.nextInt();
        if (act19.esPrimo(numPrimo)) {
            System.out.println(numPrimo + " es primo");
        } else {
            System.out.println(numPrimo + " no es primo");
        }

    }

    public static boolean toTryAgain() {
        System.out.println("¿Quieres volver a ingresar un número");
        Scanner value = new Scanner(System.in);
        String response = value.next();
        return (response.toUpperCase().equals("SI"));
    }
}
