import java.util.Scanner;

public class act15 {
    //Escribe una aplicación con un String que contenga una contraseña cualquiera.
    //Después se te pedirá que introduzcas la contraseña, con 3 intentos. Cuando
    //aciertes ya no pedirá mas la contraseña y mostrara un mensaje diciendo
    //“Enhorabuena”. Piensa bien en la condición de salida (3 intentos y si
    //acierta sale, aunque le queden intentos).
    public static void main(String[] args) {
        Scanner ejm15=new Scanner(System.in);

        boolean acierto=false;
        for( int i=0;i<3&&!acierto;i++){
            System.out.println("Intento "+(i+1));
            String password= ejm15.nextLine();

            if (password.equals("admin")){
                System.out.println("Enhorabuena, acertaste");
                acierto=true;
            }
        }
    }
}

