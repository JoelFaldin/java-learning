package conditionals;

import java.util.Scanner;

public class Conditionals {

    public static void main(String[] args) {
        int edad;
        Scanner teclado = new Scanner(System.in);
        
        System.out.println("Ingresa tu edad bro:");
        edad = teclado.nextInt();
        
        if (edad > 18) {
            System.out.println("Sos mayor de edad pibe");
        }
        else if (edad == 18) {
            System.out.println("Tenes 18");
        }
        else {
            System.out.println("Sos menor de edad pibito");
        }
        
        System.out.println("the end");
    }
    
}
