package com.wipro.patient.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.wipro.patient.entity.Patient;

@Repository
public interface PatientRepository extends JpaRepository<Patient, Integer> {
}
