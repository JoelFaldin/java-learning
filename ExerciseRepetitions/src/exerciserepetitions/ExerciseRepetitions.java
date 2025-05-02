package exerciserepetitions;

import java.util.Scanner;

public class ExerciseRepetitions {

    public static void main(String[] args) {
        // For multiple users:
        // User enter 2 values:
        // Car license plate
        // parking type
        
        String licensePlate = "";
        int parkingType;
        int hours;
        double total;
        
        // ---- COUNTERS -----
        int perHourCounter = 0;
        int perHalfDayCounter = 0;
        int perFullTimeCounter = 0;
        double totalAmount = 0;
        //--------------------
        
        Scanner keyboard = new Scanner(System.in);
        
        System.out.println("----------------------");
        System.out.println("Welcome to the system!");
        System.out.println("----------------------");
        
        while (!licensePlate.equalsIgnoreCase("end")) {
            System.out.println("Enter yout license plate:");
            keyboard = new Scanner(System.in);
            licensePlate = keyboard.nextLine();
            
            if (licensePlate.equalsIgnoreCase("end")) {
                break;
            }
            
            System.out.println("Enter the parking type:");
            System.out.println("1: Per hour");
            System.out.println("2: Half day (5 hours)");
            System.out.println("3: Full time (10 hours)");
            
            keyboard = new Scanner(System.in);
            
            parkingType = keyboard.nextInt();
            
            if (parkingType > 3 || parkingType < 1) {
                System.out.println("You didnt enter a valid service type!");
            } else {
                /*
                VALUES:
                -3usd per hour
                -Half day: $15usd and 5% off
                -Full time: $30usd and 10% off
                */
                
                switch (parkingType) {
                    case 1:                        
                        keyboard = new Scanner(System.in);
                        System.out.println("How many hours you were parked?");
                        hours = keyboard.nextInt();
                        
                        total = hours * 3;
                        
                        perHourCounter++;
                        totalAmount += total;
                        
                        System.out.println("Total amount to pay: " + total);
                        break;
                    case 2:
                        total = 15 - (15 * 0.05);
                        
                        System.out.println("Total amount to pay for half day (and 5% off): " + total);
                        
                        perHalfDayCounter++;
                        totalAmount += total;
                        
                        break;
                    case 3:
                        total = 30 - (30 * 0.1);
                        
                        System.out.println("Total amount to pay for full time (and 10% off): " + total);
                        
                        perFullTimeCounter++;
                        totalAmount += total;
                        
                        break;
                    default:
                        System.out.println("You didnt enter a valid parking type.");
                        break;    
                }
            }
        }
        
        System.out.println("------------");
        System.out.println("Thanks dude!");
        System.out.println("------------");
        
        System.out.println("Per hour counter: " + perHourCounter);
        System.out.println("Per half time counter: " + perHalfDayCounter);
        System.out.println("Per full time counter: " + perFullTimeCounter);
        System.out.println("Total amount this day: $" + totalAmount + "USD");
    }
    
}
