package exampleswitch;

import java.util.Scanner;

public class ExampleSwitch {

    public static void main(String[] args) {
        int dia;
        String dayName;
        
        System.out.println("Ingresa un dia del 1 al 7:");
        Scanner teclado = new Scanner(System.in);
        dia = teclado.nextInt();
        
        switch(dia) {
            case 1:
                dayName = "Lunes";
                break;
            case 2:
                dayName = "Martes";
                break;
            case 3:
                dayName = "Miercoles";
                break;
            case 4:
                dayName = "Jueves";
                break;
            case 5:
                dayName = "Viernes";
                break;
            case 6:
                dayName = "Sabado";
                break;
            case 7:
                dayName = "Domingo";
                break;
           default:
               System.out.println("No has ingresado un numero valido.");
               dayName = "";
               break;
        }
        
        System.out.println(dayName);
    }
    
}
