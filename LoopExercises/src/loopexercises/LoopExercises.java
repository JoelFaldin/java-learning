package loopexercises;

import java.util.Scanner;

public class LoopExercises {
    
    public static void main(String[] args) {
        // 1. Show numbers from 1 to 35:
        
        for (int firstCounter = 1; firstCounter <= 35; firstCounter++) {
            System.out.println(firstCounter);
        }
        
        System.out.println("-----------------------------------------");
        
        // 2. Given a numeric input, show all numbers until that limit:

        int secondCounter = 0;
        boolean condition = true;
        Scanner keyboard = new Scanner(System.in);
        
        while (condition) {
            System.out.println("Ingresa un limite:");
            secondCounter = keyboard.nextInt();

            if (secondCounter <= 0) {
                System.out.println("Debes ingresar un numero valido!");
                return;
            }
            
            for (int thirdCounter = 0; thirdCounter <= secondCounter; thirdCounter++) {
                System.out.println(thirdCounter + 1);
            }
            
            condition = false;
        }

        System.out.println("-----------------------------------------");

        // 3. Print all numbers from 200 to 250 incresing by 2;
        
        for (int fourthCounter = 200; fourthCounter <= 250; fourthCounter += 2) {
            System.out.println(fourthCounter);
        }
        
        System.out.println("-----------------------------------------");
        
        // 4. Make a counter for new years!
        
        System.out.println("FALTA PARA AÑO NUEVO:");
        for (int newYearCounter = 10; newYearCounter >= 1; newYearCounter -= 1) {
            System.out.println(newYearCounter);
        }
        System.out.println("FELIZ AÑO NUEVO!");
        
        System.out.println("-----------------------------------------");
        
        // 5. Show words inputted by keyboard until user types 'salir':
        
        String word = "";
        Scanner secondKeyboard = new Scanner(System.in);
        
        System.out.println("JUEGO DE PALABRAS - ESCRIBE 'salir' PARA SALIR");
        
        while (!word.equalsIgnoreCase("salir")) {
            System.out.println("Ingresa una palabra:");
            word = secondKeyboard.next();
            
            System.out.println(word);            
        }
    }
    
}
