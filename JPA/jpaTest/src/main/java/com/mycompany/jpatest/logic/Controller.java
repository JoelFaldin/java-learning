package com.mycompany.jpatest.logic;

import com.mycompany.jpatest.persistence.PersistenceController;
import java.util.ArrayList;

public class Controller {
    
    PersistenceController persisController = new PersistenceController();
    
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
}
