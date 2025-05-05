package inheritance;

public class Inheritance {

    public static void main(String[] args) {
        
        // Polymorphism:
        Person vector[] = new Person[5];
        
        vector[0] = new Person();
        vector[1] = new Employee();
        vector[2] = new Consultant();
        vector[3] = new Boss();
//        vector[4] = "hey";

        Person person1 = new Person();
        Consultant consul = new Consultant();
        
        person1 = consul;
//        consul = person1;
    }
    
}
