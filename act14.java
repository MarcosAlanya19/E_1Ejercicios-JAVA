import java.util.Scanner;

public class act14 {
    //Lee un número por teclado y comprueba que este numero
    //es mayor o igual que cero, si no lo es lo volverá a
    //pedir (do while), después muestra ese número por consola.
    public static void main(String[] args) {
        Scanner ejm14 = new Scanner(System.in);
        int num;
        do
        {
            System.out.println("ingresa un numero");
            num = ejm14.nextInt();
        }while(num<0);
    }
}
