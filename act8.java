import java.text.DecimalFormat;
import java.util.Scanner;

public class act8 {
    //Lee un número por teclado que pida el precio de un
    //producto (puede tener decimales) y calcule el precio
    //final con IVA. El IVA sera una constante que sera del 21%.
    public static void main(String[] args) {
        Scanner ejm8 = new Scanner(System.in);

        System.out.println("Cual es el precio sin IVA ?");
        double n1= ejm8.nextDouble();

        DecimalFormat df=new DecimalFormat("###.##");
        System.out.println("El IVA del precio es "+df.format(n1*0.21)+" y el precio final es "+df.format(n1+(n1*0.21)));
    }
}