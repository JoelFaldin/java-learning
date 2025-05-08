package com.mycompany.jpatest;

import com.mycompany.jpatest.logic.Controller;
import com.mycompany.jpatest.logic.Student;
import java.util.ArrayList;
import java.util.Date;

public class JpaTest {

    public static void main(String[] args) {
        
        Controller control = new Controller();
        
//        Student stud1 = new Student(30, "Jowel", "F", new Date());
        
//        control.createStudent(stud1);
        
//        control.deleteStudent(101);

//        stud1.setLastName("Java dev");
//        
//        control.updateStudent(stud1);
        
        System.out.println("------------- Individual search -----------------");
        Student stud1 = control.getStudent(1);
        System.out.println("The student is: " + stud1.toString());
        
        System.out.println("------------- Multiple search --------------------");
        ArrayList<Student> studentList = control.getStudentList();
        
        for (Student stud: studentList) {
            System.out.println("Student is: " + stud.toString());
        }
    }
}
