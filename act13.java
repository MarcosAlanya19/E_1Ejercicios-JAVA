import java.util.Scanner;

public class act13 {
    //Realiza una aplicación que nos calcule una ecuación de
    //segundo grado. Debes pedir las variables a, b y c por teclado
    //y comprobar antes que el discriminante (operación en la
    //raíz cuadrada). Para la raíz cuadrada usa el método sqlrt de Math.
    //Te recomiendo que uses mensajes de traza.
    public static void main(String[] args) {
        Scanner ejm13=new Scanner(System.in);
        System.out.println("Ingresa variable a");
        double a= ejm13.nextDouble();
        System.out.println("Ingresa variable b");
        double b= ejm13.nextDouble();
        System.out.println("Ingresa variable c");
        double c= ejm13.nextDouble();

        double raizCuadrada = Math.sqrt(Math.pow(b,2)-4*(a*c));

        double positivo= -b+raizCuadrada;
        double negativo= -b-raizCuadrada;

        System.out.println("El resultado de x1 es "+ (positivo/2*a));
        System.out.println("El resultado de x2 es "+ (negativo/2*a));
    }
}
