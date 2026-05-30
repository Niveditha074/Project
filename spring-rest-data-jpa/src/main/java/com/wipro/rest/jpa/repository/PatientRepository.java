package com.wipro.rest.jpa.repository;

import java.util.List;

import org.springframework.data.jpa.repository.*;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.wipro.rest.jpa.entity.Patient;

@Repository
public interface PatientRepository extends JpaRepository<Patient, Integer> {

    Patient findByPname(String pname);

    List<Patient> findByAgeGreaterThanOrderByPnameAsc(int age);

    List<Patient> findByDisease(String disease);

    @Query("select p from Patient p order by p.age")
    List<Patient> findAllBySorted();

    @Modifying
    @Query("update Patient p set p.disease = :d where p.pid = :id")
    int updateDisease(@Param("d") String disease, @Param("id") int pid);
}