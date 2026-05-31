package com.wipro.doctor.entity;

public class Doctor {

    private int did;
    private String dname;
    private String specialization;

    public Doctor() {}

    public Doctor(int did, String dname, String specialization) {
        this.did = did;
        this.dname = dname;
        this.specialization = specialization;
    }

    public int getDid() { return did; }
    public void setDid(int did) { this.did = did; }

    public String getDname() { return dname; }
    public void setDname(String dname) { this.dname = dname; }

    public String getSpecialization() { return specialization; }
    public void setSpecialization(String specialization) { this.specialization = specialization; }
}