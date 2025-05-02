package switchexercise;

import java.util.Scanner;

public class SwitchExercise {

    public static void main(String[] args) {
        int edad;

        System.out.println("Ingresa una edad:");
        Scanner teclado = new Scanner(System.in);
        edad = teclado.nextInt();

        if (edad >= 4 && edad <= 6) {
            System.out.println("Kinder");
            System.out.println("Clases los lunes y miercoles de 16:00 a 17:00.");
        } else if (edad >= 7 && edad <= 8) {
            System.out.println("1st year");
            System.out.println("Martes y jueves de 16:30 a 17:30.");
        } else if (edad >= 9 && edad <= 10) {
            System.out.println("2nd year");
            System.out.println("Martes y jyeves de 17:30 a 19:00");
        } else if (edad >= 11 && edad <= 13) {
            System.out.println("3rd year");
            System.out.println("Lunes y miercoles de 17:00 a 18:30");
        } else {
            System.out.println("Has ingresado una edad invalida.");
        }

    }

}
