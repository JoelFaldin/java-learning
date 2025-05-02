package vectors;

import java.util.Scanner;

public class Vectors {

    public static void main(String[] args) {
        
//        Unidimensional arrays:
        int numbers[] = new int[8];
        
        Scanner keyboard = new Scanner(System.in);
        
//        numbers[0] = 23;
//        numbers[1] = 48;
//        numbers[2] = 33;
        
        for (int i = 0; i < numbers.length; i++) {
            System.out.println("Enter a number:");
            keyboard = new Scanner(System.in);
            
            numbers[i] = keyboard.nextInt();
        }
        
        System.out.println("Full array: ");
        
        for (int i = 0; i < numbers.length; i++) {
            System.out.println(numbers[i]);
        }
        
        
        System.out.println("-----------------------");
        int numbers2[] = {23, 45, 90, 3, 94, 5};
        
        for (int i = 0; i < numbers2.length; i++) {
            System.out.println(numbers2[i]);
        }
        
//        Bi-dimensional arrays:
        int newArray[][] = new int[3][3];
        Scanner keyboard2 = new Scanner(System.in);
        
        for (int i = 0; i < newArray.length; i++) {
            for (int k = 0; k < newArray[0].length; k++) {
                System.out.println("Enter a value for the 2-dimensional array:");
                
                keyboard2 = new Scanner(System.in);
                newArray[i][k] = keyboard2.nextInt();
            }
        }
        
//        Printing the values:
        for (int i = 0; i < newArray.length; i++) {
            for (int k = 0; k < newArray[0].length; k++) {
                System.out.println("Row " + i + ", column " + k + ": " + newArray[i][k]);
            }
        }
    }
}
