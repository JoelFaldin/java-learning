package ternarios;

import java.util.Scanner;

public class Ternarios {

    public static void main(String[] args) {
        double avg;
        String condicion;
        
        Scanner teclado = new Scanner(System.in);
        
        System.out.println("Ingrese el promedio del alumno:");
        avg = teclado.nextDouble();
        
        condicion = avg >= 6.0 ? "Aprobado" : "Desaprobado";
        
        System.out.println("La condicion final del alumno es: " + condicion);
    }
    
}
