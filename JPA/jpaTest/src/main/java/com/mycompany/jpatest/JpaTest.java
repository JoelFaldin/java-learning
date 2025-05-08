package com.mycompany.jpatest;

import com.mycompany.jpatest.logic.Career;
import com.mycompany.jpatest.logic.Controller;
import com.mycompany.jpatest.logic.Student;
import java.util.Date;

public class JpaTest {

    public static void main(String[] args) {
        
        Controller control = new Controller();
        
       // Career creation:
       Career career1 = new Career(1, "Software");
       
       // Saving career in db:
       control.createCareer(career1);
       
       // Student creation:
       Student stud1 = new Student(30, "Jowel", "F", new Date(), career1);
       
       // Save student in db:
       control.createStudent(stud1);
       
       // Result:
        System.out.println("----------------------");
        System.out.println("STUDENT DATA");
        
        Student stud2 = control.getStudent(30);
        System.out.println("Student: " + stud2.getName() + " " + stud2.getLastName());
        System.out.println("Is on the " + stud2.getCareer().getName() + " career!");
    }
}
