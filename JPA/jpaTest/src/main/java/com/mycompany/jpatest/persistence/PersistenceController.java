package com.mycompany.jpatest.persistence;

import com.mycompany.jpatest.logic.Student;
import com.mycompany.jpatest.persistence.exceptions.NonexistentEntityException;
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
}
