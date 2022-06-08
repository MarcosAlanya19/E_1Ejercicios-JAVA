import java.text.DecimalFormat;
import java.util.Scanner;

public class act18 {
    //Pide por teclado un número entero positivo (debemos controlarlo) y
    // muestra  el número decifras que tiene. Por
    // ejemplo: si introducimos 1250, nos muestre que tiene 4 cifras. Tendremos
    // que controlar siuna o mascifras, al mostrar el mensaje.
    public static void main(String[] args) {
        Scanner ejm18 =new Scanner(System.in);

        System.out.println("Ingresa numero");
        int n1= ejm18.nextInt();

        if (n1>0){
            DecimalFormat df=new DecimalFormat("###");
            System.out.println("El numero "+n1+" tiene "+(df.format(Math.floor(Math.log10(n1) + 1)))+" cifras");
        }
        else {
            System.out.println("El numero no es positivo");
        }
    }
}
