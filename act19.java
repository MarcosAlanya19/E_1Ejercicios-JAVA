import java.util.Scanner;

public class act19 {
    // Pide un número por teclado e indica si es un número primo o no. Un número primo es aquel
    // solo puede dividirse entre 1 y si mismo. Por ejemplo: 25 no es primo, ya que 25 es
    // divisible entre 5, sin embargo, 17 si es primo.
    //Un buen truco para calcular la raíz cuadrada del numero e ir comprobando que si es
    // divisible desde ese numero hasta 1.
    //NOTA: Si se introduce un numero menor o igual que 1, directamente es no primo.
    public static void main(String[] args) {
        Scanner ejm19=new Scanner(System.in);

        System.out.println("Ingresa numero");
        int numPrimo= ejm19.nextInt();

        if(numPrimo<=1||numPrimo%2==0||numPrimo%3==0||numPrimo%7==0||numPrimo%11==0||numPrimo%13==0){
            System.out.println(numPrimo+" no es un numero primo");
        }
        else {
            System.out.println((numPrimo)+" si es un numero primo");
        }
    }
}
