import java.util.Scanner;

public class act5 {
    //Lee un número por teclado e indica si es
    //divisible entre 2 (resto = 0). Si no lo es,
    //también debemos indicarlo.
    public static void main(String[] args) {

        Scanner ejm5=new Scanner(System.in);
        System.out.println("Ingrese numero");
        int n1= ejm5.nextInt();

        if((n1%2)==0 ){
            System.out.println(n1 +" si es divisible entre 2");
        }
        else{
            System.out.println("No es divisible entre 2");
        }
    }
}
