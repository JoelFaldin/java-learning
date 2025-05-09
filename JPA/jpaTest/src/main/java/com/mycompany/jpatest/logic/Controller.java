package com.mycompany.jpatest.logic;

import com.mycompany.jpatest.persistence.PersistenceController;
import java.util.ArrayList;

public class Controller {
    
    PersistenceController persisController = new PersistenceController();
    
    // Students
    public void createStudent(Student stud) {
        persisController.createStudent(stud);
    }
    
    public void deleteStudent(int id) {
        persisController.deleteStudent(id);
    }
    
    public void updateStudent(Student stud) {
        persisController.updateStudent(stud);
    }
    
    public Student getStudent(int id) {
        return persisController.getStudent(id);
    }
    
    public ArrayList<Student> getStudentList() {
        return persisController.getStudentList();
    }
    
    // Careers
    public void createCareer(Career career) {
        persisController.createCareer(career);
    }
    
    public void deleteCareer(int id) {
        persisController.deleteCareer(id);
    }
    
    public void updateCareer(Career career) {
        persisController.updateCareer(career);
    }
    
    public Career getCareer(int id) {
        return persisController.getCareer(id);
    }
    
    public ArrayList<Career> getCareerList() {
        return persisController.getCareerList();
    }
    
    // Subjects
    public void createSubject(Subject subject) {
        persisController.createSubject(subject);
    }
    
    public void deleteSubject(int id) {
        persisController.deleteSubject(id);
    }
    
    public void updateSubject(Subject subject) {
        persisController.updateSubject(subject);
    }
    
    public Subject getSubject(int id) {
        return persisController.getSubject(id);
    }
    
    public ArrayList<Subject> getSubjectList() {
        return persisController.getSubjectList();
    }
}
