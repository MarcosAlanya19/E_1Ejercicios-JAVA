import java.util.Scanner;

public class act6 {
    //Lee un número por teclado y muestra por consola,
    //el carácter al que pertenece en la tabla ASCII.
    //Por ejemplo: si introduzco un 97, me muestre una a.
    public static void main(String[] args) {
        Scanner ejm6 = new Scanner(System.in);

        System.out.println("Introduce un codigo ASCII");
        int num = ejm6.nextInt();

        char com = (char)num;

        System.out.println("El codigo ASCCI "+num+" da igul al simbolo "+'"'+" "+com+" "+'"' );
    }
}
