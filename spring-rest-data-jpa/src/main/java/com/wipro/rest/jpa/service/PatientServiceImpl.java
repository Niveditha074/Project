package com.wipro.rest.jpa.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.wipro.rest.jpa.entity.Patient;
import com.wipro.rest.jpa.repository.PatientRepository;

import jakarta.transaction.Transactional;

@Transactional
@Service
public class PatientServiceImpl implements IPatientService {

    @Autowired
    private PatientRepository repo;

    @Override
    public Patient addPatient(Patient patient) {
        return repo.save(patient);
    }

    @Override
    public Patient updatePatient(Patient patient) {
        return repo.save(patient);
    }

    @Override
    public Patient getByPid(int pid) {
        return repo.findById(pid).orElse(null);
    }

    @Override
    public void deleteByPid(int pid) {
        repo.deleteById(pid);
    }

    @Override
    public List<Patient> getAllPatients() {
        return repo.findAll();
    }

    @Override
    public Patient getByPname(String pname) {
        return repo.findByPname(pname);
    }

    @Override
    public List<Patient> getByAgeGT(int age) {
        return repo.findByAgeGreaterThanOrderByPnameAsc(age);
    }

    @Override
    public List<Patient> getByDisease(String disease) {
        return repo.findByDisease(disease);
    }

    @Override
    public List<Patient> findAllBySorted() {
        return repo.findAllBySorted();
    }

    @Override
    public int updateDisease(String disease, int pid) {
        return repo.updateDisease(disease, pid);
    }
}