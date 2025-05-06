package trycatch;

public class TryCatch {

    public static void main(String[] args) {
        // This throws an exception:
//        int result = 3 / 0;

        try {
            int result = 3 / 0;
            System.out.println(result);
        } catch (Exception e) {
            System.out.println("You cant divide by 0!");
        }

        int ages[] = {15, 23, 20, 28};
        
        try {
            System.out.println("Age in position 4 is: " + ages[4]);    
        } catch (Exception e) {
            System.out.println("You tried accesing an unexisting index!");
        }
        



    }
    
}
