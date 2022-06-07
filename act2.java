import java.util.Scanner;

public class act2 {
    //Declara 2 variables numéricas (con el valor que desees),
    //he indica cual es mayor de los dos. Si son iguales indicarlo también.
    //Ves cambiando los valores para comprobar que funciona.
    public static void main(String[] args) {
        int n1, n2, max, igual;
        Scanner ejemplo2 = new Scanner(System.in);
        System.out.println("Ingresa primer numero");
        n1 = ejemplo2.nextInt();

        System.out.println("Ingresa segundo numero");
        n2 = ejemplo2.nextInt();

        if(n1>n2){
            System.out.println("El numeros"+n1+"es mayor que el numero"+n2);
        }
        if (n2>n1){
            System.out.println("El numeros"+n2+"es mayor que el numero"+n1);
        }
        else {
            System.out.println("Los numeros "+n1+" y "+n2+" son iguales");
        }
    }
}

