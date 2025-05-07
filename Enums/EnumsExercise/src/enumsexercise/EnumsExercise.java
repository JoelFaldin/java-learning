package enumsexercise;

import enums.Color;

public class EnumsExercise {
    
    public static void main(String[] args) {
        
        for (Color color: Color.values()) {
            System.out.println("Color is: " + color);
        }
        
        System.out.println("----------------------");
        
        Color col = Color.BLUE;
        
        System.out.println(col.name());
        System.out.println(col.ordinal());
        
        System.out.println("----------------------");
        
        col = Color.valueOf("BLUE");
        
        System.out.println(col);
        
        try {
            col = Color.valueOf("TEST");
            System.out.println(col);
        } catch (IllegalArgumentException e) {
            System.out.println("Value not found D:");
        }
        
        
    }
    
}
