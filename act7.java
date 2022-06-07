import java.util.Scanner;

public class act7 {
    //Modifica el ejercicio anterior, para que en lugar de
    //pedir un número, pida un carácter (char) y muestre su
    //código en la tabla ASCII.
    public static void main(String[] args) {
        Scanner ejm6 = new Scanner(System.in);

        System.out.println("Introduce un codigo ASCII");
        int num = ejm6.next().charAt(0);

        char com = (char)num;

        System.out.println("El caracter "+com+" da igul al codigo ASCII "+'"'+" "+num+" "+'"' );
    }
}
