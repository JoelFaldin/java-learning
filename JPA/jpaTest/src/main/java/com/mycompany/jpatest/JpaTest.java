package com.mycompany.jpatest;

import com.mycompany.jpatest.logic.Controller;
import com.mycompany.jpatest.logic.Student;
import java.util.Date;

public class JpaTest {

    public static void main(String[] args) {
        
        Controller control = new Controller();
        
        Student stud1 = new Student("Jowel", "F", new Date());
        
        control.createStudent(stud1);
        
        control.deleteStudent(101);
        
    }
}
