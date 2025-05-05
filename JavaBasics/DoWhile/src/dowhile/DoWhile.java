package dowhile;

public class DoWhile {

    public static void main(String[] args) {
        int count = 0;
        
        do {
            System.out.println(count + 1);
            
            count += 1;
        } while (count < 10);
    }
    
}
