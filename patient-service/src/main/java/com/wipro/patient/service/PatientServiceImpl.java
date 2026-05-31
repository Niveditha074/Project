package com.wipro.patient.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.wipro.patient.entity.Patient;
import com.wipro.patient.repository.PatientRepository;

@Service
public class PatientServiceImpl implements IPatientService {

    @Autowired
    private PatientRepository repo;

    @Override
    public Patient addPatient(Patient patient) {
        return repo.save(patient);
    }

    @Override
    public List<Patient> getAllPatients() {
        return repo.findAll();
    }

    @Override
    public Patient getById(int id) {
        return repo.findById(id).orElse(null);
    }
}