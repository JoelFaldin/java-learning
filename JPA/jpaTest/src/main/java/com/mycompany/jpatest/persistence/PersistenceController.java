package com.mycompany.jpatest.persistence;

import com.mycompany.jpatest.logic.Student;

public class PersistenceController {
    
    StudentJpaController studentJpa = new StudentJpaController();

    public void createStudent(Student stud) {
        studentJpa.create(stud);
    }
    
}
