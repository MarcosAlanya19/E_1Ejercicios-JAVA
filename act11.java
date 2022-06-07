import java.util.Scanner;

public class act11 {
    //Realiza una aplicación que nos pida un número
    //de ventas a introducir, después nos pedirá tantas
    //ventas por teclado como número de ventas se hayan
    //indicado. Al final mostrara la suma de todas las ventas.
    //Piensa que es lo que se repite y lo que no.
    public static void main(String[] args) {
        Scanner ejm11 = new Scanner(System.in);

        System.out.println("Ingrese el numero de ventas");
        int numv= ejm11.nextInt();
        int sumaV= 0;

        for( int i=0;i<numv;i++){
            System.out.println("Ingrese precio de venta "+(i+1));
            int v= ejm11.nextInt();

            sumaV=sumaV+v;
        }
        System.out.println("La suma de la venta es "+sumaV);
    }
}
