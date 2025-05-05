package Logic;

public class POO {

    public static void main(String[] args) {
        Student stud1 = new Student();
        Student stud2 = new Student(35, "Joel", "F");
        
        System.out.println("The id of student 2 is: " + stud2.getId());
        System.out.println("The name of student 2 is: " + stud2.getName());
        
        stud1.setId(23);
        stud1.setName("Lain");
        stud1.setLastName("Lain");
        
        System.out.println(stud1.getName());
    }
    
}
