package com.wipro.rest.jpa.entity;

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
    private String doctorName;

    public Patient() {}

    public Patient(int pid, String pname, int age, String disease, String doctorName) {
        this.pid = pid;
        this.pname = pname;
        this.age = age;
        this.disease = disease;
        this.doctorName = doctorName;
    }

    public int getPid() { return pid; }
    public void setPid(int pid) { this.pid = pid; }

    public String getPname() { return pname; }
    public void setPname(String pname) { this.pname = pname; }

    public int getAge() { return age; }
    public void setAge(int age) { this.age = age; }

    public String getDisease() { return disease; }
    public void setDisease(String disease) { this.disease = disease; }

    public String getDoctorName() { return doctorName; }
    public void setDoctorName(String doctorName) { this.doctorName = doctorName; }
}