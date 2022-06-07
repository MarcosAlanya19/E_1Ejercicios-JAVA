import java.text.DecimalFormat;
import java.util.Scanner;

public class act4 {
    //Haz una aplicación que calcule el área de un círculo(pi*R2).
    //El radio se pedirá por teclado (recuerda pasar de String a
    //double con Double.parseDouble). Usa la constante PI y el
    //método pow de Math.
    public static void main(String[] args) {
        Scanner ejm4 = new Scanner(System.in);

        System.out.println("¿Cuanto es el radio del circulo?");
        double R2 = ejm4.nextInt();

        DecimalFormat df = new DecimalFormat("###.##");
        System.out.println("El area del circulo es " + df.format(Math.PI*Math.pow(R2,2)));
    }
}
