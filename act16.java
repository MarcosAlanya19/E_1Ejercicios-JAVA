import java.util.Scanner;

public class act16 {
    //Crea una aplicación que nos pida un día de la semana y que
    //nos diga si es un dia laboral o no. Usa un switch para ello.
    public static void main(String[] args) {
        Scanner ejm16=new Scanner(System.in);
        System.out.println("Introduce un dia de la semana");
        String d = ejm16.nextLine();

        switch (d){
            case"lunes":
            case"martes":
            case"miercoles":
            case"jueves":
            case"viernes":
                System.out.println("Es dia laboral");
                break;
            case"sabado":
            case"domingo":
                System.out.println("No es dia laboral");

            default:
                System.out.println("Introduce un dia de la semana");
        }
    }
}
