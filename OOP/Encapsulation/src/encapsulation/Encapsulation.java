package encapsulation;


public class Encapsulation {
    
    public static void main(String[] args) {
        Student stud1 = new Student();
        Student stud2 = new Student(15, "Jowel", "F");
        
        System.out.println("Id: " + stud2.getId());
        System.out.println("Name: " + stud2.getName());
        System.out.println("Lastname: " + stud2.getLastName());

    }
    
}
