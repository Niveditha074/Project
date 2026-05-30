package com.wipro.rest.jpa.service;

import java.util.List;
import com.wipro.rest.jpa.entity.Patient;

public interface IPatientService {

    Patient addPatient(Patient patient);

    Patient updatePatient(Patient patient);

    Patient getByPid(int pid);

    void deleteByPid(int pid);

    List<Patient> getAllPatients();

    Patient getByPname(String pname);

    List<Patient> getByAgeGT(int age);

    List<Patient> getByDisease(String disease);

    List<Patient> findAllBySorted();

    int updateDisease(String disease, int pid);
}