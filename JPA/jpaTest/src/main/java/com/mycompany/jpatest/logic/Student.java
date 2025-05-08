package com.mycompany.jpatest.logic;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
public class Student implements Serializable {
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    
    @Basic
    private String name;
    private String lastName;
    
    @Temporal(TemporalType.DATE)
    private Date birthDate;

    public Student() {
    }

    public Student(int id, String name, String lastName, Date birthDate) {
        this.id = id;
        this.name = name;
        this.lastName = lastName;
        this.birthDate = birthDate;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Date getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(Date birthDate) {
        this.birthDate = birthDate;
    }

    @Override
    public String toString() {
        return "Student{" + "id=" + id + ", name=" + name + ", lastName=" + lastName + ", birthDate=" + birthDate + '}';
    }
}
