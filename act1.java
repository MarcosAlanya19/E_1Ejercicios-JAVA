import java.util.Scanner;

public class act1 {
    //Declara dos variables numéricas
    // (con el valor que desees), muestra por consola
    // la suma, resta, multiplicación, división y módulo
    public static void main(String[] args) {
        double n1,n2,s,r,d,m,rs;
        Scanner Ejemplo1 = new Scanner(System.in);

        System.out.println("Ingrese primer valor");
        n1 = Ejemplo1.nextInt();

        System.out.println("Ingrese segundo valor");
        n2 = Ejemplo1.nextInt();

        s=n1+n2;
        r=n1-n2;
        d=n1/n2;
        m=n1*n2;
        rs=n1%n2;

        System.out.println("El resultado de la suma es " + s);
        System.out.println("El resultado de la resta es " + r);
        System.out.println("El resultado de la division es " + d);
        System.out.println("El resultado de la multiplicacion es " + m);
        System.out.println("El resultado del resto es " + rs);
    }
}
