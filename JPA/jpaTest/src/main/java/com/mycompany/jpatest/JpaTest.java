package com.mycompany.jpatest;

import com.mycompany.jpatest.logic.Career;
import com.mycompany.jpatest.logic.Controller;
import com.mycompany.jpatest.logic.Student;
import com.mycompany.jpatest.logic.Subject;
import java.util.Date;
import java.util.LinkedList;

public class JpaTest {

    public static void main(String[] args) {
        
        Controller control = new Controller();

        // Create subject list and add them:
        LinkedList<Subject> subjectList = new LinkedList<>();
        
        // Career creation:
        Career career1 = new Career(1, "Software", subjectList);
       
        // Saving career in db:
        control.createCareer(career1);
        
        // Subject creation:
        Subject progra1 = new Subject(58, "Programming I", "Quarterly", career1);
        Subject progra2 = new Subject(59, "Programming II", "Quarterly", career1);
        Subject progra3 = new Subject(60, "Data Structures and Algorithms", "Yearly", career1);
        
        // Saving subjects in db:
        control.createSubject(progra1);
        control.createSubject(progra2);
        control.createSubject(progra3);
        
        // Add to the subject list:
        subjectList.add(progra1);
        subjectList.add(progra2);
        subjectList.add(progra3);
        
        career1.setSubjectList(subjectList);
        control.updateCareer(career1);
        
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
