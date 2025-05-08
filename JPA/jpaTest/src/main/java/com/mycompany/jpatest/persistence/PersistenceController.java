package com.mycompany.jpatest.persistence;

import com.mycompany.jpatest.logic.Career;
import com.mycompany.jpatest.logic.Student;
import com.mycompany.jpatest.persistence.exceptions.NonexistentEntityException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

public class PersistenceController {
    
    StudentJpaController studentJpa = new StudentJpaController();
    CareerJpaController careerJpa = new CareerJpaController();

    // Students
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

    // Career
    public void createCareer(Career career) {
        careerJpa.create(career);
    }

    public void deleteCareer(int id) {
        try {
            careerJpa.destroy(id);
        } catch (NonexistentEntityException ex) {
            Logger.getLogger(PersistenceController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void updateCareer(Career career) {
        try {
            careerJpa.edit(career);
        } catch (Exception ex) {
            Logger.getLogger(PersistenceController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public Career getCareer(int id) {
        return careerJpa.findCareer(id);
    }

    public ArrayList<Career> getCareerList() {
        List<Career> list = careerJpa.findCareerEntities();
        ArrayList<Career> careerList = new ArrayList<>(list);
        
        return careerList;
    }
}
