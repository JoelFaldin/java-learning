package pkgwhile;

public class Loops {

    public static void main(String[] args) {
        int counter = 0;
        
        while (counter < 10) {
            System.out.println(counter + 1);
            
            counter += 1;
        }
        
        boolean flag = false;
        
        while (!flag) {
            System.out.println("Flag value: " + flag);
            
            if (counter == 0) {
                flag = true;
            }
            
            counter -= 1;
        }
        
        int sum = 0;
        
        System.out.println("-----------------------------------");
        
        for (int newCounter = 0; newCounter < 10; newCounter++) {
            System.out.println("Posicion: " + newCounter);
            
            sum = 5 + newCounter;
            
            if (sum >= 7) {
                newCounter = 11;
            }
        }
        
//        INFINITE LOOP:
//        int thirdCounter = 0;
//        while (thirdCounter <= 10) {
//            System.out.println("LETS GO");
//        }
    }
    
}
