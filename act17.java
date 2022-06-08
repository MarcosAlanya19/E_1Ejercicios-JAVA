import java.util.Scanner;

public class act17 {
    // pide por teclado dos número y genera 10 números aleatoriosentre
    // esos números. usa el método math.random paragenerarun número entero
    // aleatorio (recuerda el casting de double a int).
    public static void main(String[] args) {
        Scanner ejm17 = new Scanner(System.in);
        System.out.println("Numero de inicio");
        int n1 = ejm17.nextInt();

        System.out.println("Numero de fin");
        int n2 = ejm17.nextInt();

        for (int i=0;i<10;i++){
            int n3=(int)(Math.random()*(n1-n2)+n2);
            System.out.println(n3);
        }
    }
}
