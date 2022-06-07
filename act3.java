import java.util.Scanner;

public class act3 {
    //Declara un String que contenga tu nombre, después muestra un mensaje
    //de bienvenida por consola. Por ejemplo: si introduzco “Fernando”, me
    //aparezca “Bienvenido Fernando”.
    public static void main(String[] args) {
        Scanner ejm3 = new Scanner(System.in);

        System.out.println("¿Cual es tu nombre?");
        String name= ejm3.nextLine();

        System.out.println("Bienvenido"+" "+name);

    }
}
