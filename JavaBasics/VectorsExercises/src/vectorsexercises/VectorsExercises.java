package vectorsexercises;

import java.util.Scanner;

public class VectorsExercises {
    
    public static void main(String[] args) {
        // 1. Save names into an array and show them in console:
        String names[] = new String[8];
        Scanner keyboard = new Scanner(System.in);
        
        for (int i = 0; i < names.length; i++) {
            keyboard = new Scanner(System.in);
            System.out.println("Enter a name:");
            names[i] = keyboard.nextLine();
        }
        
        System.out.println("------------------------");
        
        System.out.println("Names entered:");
        for (int i = 0; i < names.length; i++) {
            System.out.println("Name saved: " + names[i]);
        }
        
        System.out.println("#########################");
        
        // 2. Load 10 numbers in a vector and print the biggest and lowest of them all:
        int numbers[] = new int[10];
        int biggest = Integer.MIN_VALUE;
        int lowest = Integer.MAX_VALUE;
        
        Scanner keyboard2 = new Scanner(System.in);
        
        for (int i = 0; i < numbers.length; i++) {
            keyboard2 = new Scanner(System.in);
            
            System.out.println("Enter a number: ");
            numbers[i] = keyboard2.nextInt();
            
            if (numbers[i] > biggest) {
                biggest = numbers[i];
            }
            
            if (numbers[i] < lowest) {
                lowest = numbers[i];
            }
        }
        
        System.out.println("Biggest number: " + biggest);
        System.out.println("Lowest number: " + lowest);
        
        System.out.println("#########################");
        
        // 3. Load 15 numbers in a vector, count how many times the number 3 was entered:
        int numbers2[] = new int[15];
        int number3Count = 0;
        
        Scanner keyboard3 = new Scanner(System.in);
        
        for (int i = 0; i < numbers2.length; i++) {
            keyboard3 = new Scanner(System.in);
            
            System.out.println("Enter a number:");
            numbers2[i] = keyboard3.nextInt();
            
            if (numbers2[i] == 3) {
                number3Count++;
            }
        }
        
        System.out.println("Okay! You inputted the number 3 a total of " + number3Count + " times!");
        
        System.out.println("#########################");
        
        // 4. Load into an array the salary of 12 months of a dude, then print the total amount and the average:
        double salaryArray[] = new double[12];
        Scanner keyboard4 = new Scanner(System.in);
        
        for (int i = 0; i < salaryArray.length; i++) {
            keyboard4 = new Scanner(System.in);
            
            System.out.println("Enter the salary of the month " + (i + 1) + ": ");
            salaryArray[i] = keyboard4.nextDouble();
        }
        
        double totalAmount = 0;
        
        for (int i = 0; i < salaryArray.length; i++) {
            totalAmount += salaryArray[i];
        }
        
        double average = totalAmount / salaryArray.length;
        
        System.out.println("The total amount of salary after 1 year: " + totalAmount);
        System.out.println("The average per month: " + average);
    }
    
}
