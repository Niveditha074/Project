package com.wipro.patient.service;

import java.util.List;
import com.wipro.patient.entity.Patient;

public interface IPatientService {

    Patient addPatient(Patient patient);

    List<Patient> getAllPatients();

    Patient getById(int id);
}
