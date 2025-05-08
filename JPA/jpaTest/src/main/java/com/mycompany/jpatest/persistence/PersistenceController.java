package com.mycompany.jpatest.persistence;

import com.mycompany.jpatest.logic.Student;
import com.mycompany.jpatest.persistence.exceptions.NonexistentEntityException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

public class PersistenceController {
    
    StudentJpaController studentJpa = new StudentJpaController();

    public void createStudent(Student stud) {
        studentJpa.create(stud);
    }
    
    public void deleteStudent(int id) {
        try {
            studentJpa.destroy(id);
        } catch (NonexistentEntityException ex) {
            Logger.getLogger(PersistenceController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }    

    public void updateStudent(Student stud) {
        try {
            studentJpa.edit(stud);
        } catch (Exception ex) {
            Logger.getLogger(PersistenceController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public Student getStudent(int id) {
        return studentJpa.findStudent(id);
    }

    public ArrayList<Student> getStudentList() {
        List<Student> list = studentJpa.findStudentEntities();
        ArrayList<Student> studentList = new ArrayList<>(list);
        
        return studentList;
    }
}
