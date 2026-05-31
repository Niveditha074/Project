package com.wipro.patient.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "patients")
public class Patient {

    @Id
    private int pid;
    private String pname;
    private int age;
    private String disease;

    // Default constructor
    public Patient() {}

    // Parameterized constructor
    public Patient(int pid, String pname, int age, String disease) {
        this.pid = pid;
        this.pname = pname;
        this.age = age;
        this.disease = disease;
    }

    public int getPid() {
        return pid;
    }

    public void setPid(int pid) {
        this.pid = pid;
    }

    public String getPname() {
        return pname;
    }

    public void setPname(String pname) {
        this.pname = pname;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getDisease() {
        return disease;
    }

    public void setDisease(String disease) {
        this.disease = disease;
    }
}