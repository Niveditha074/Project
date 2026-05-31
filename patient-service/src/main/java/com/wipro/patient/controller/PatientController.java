package com.wipro.patient.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.wipro.patient.entity.Patient;
import com.wipro.patient.service.IPatientService;

@RestController
@RequestMapping("/patient")
public class PatientController {

    @Autowired
    private IPatientService service;

    @PostMapping("/add")
    public Patient add(@RequestBody Patient p) {
        return service.addPatient(p);
    }

    @GetMapping("/all")
    public List<Patient> getAll() {
        return service.getAllPatients();
    }

    @GetMapping("/{id}")
    public Patient getById(@PathVariable int id) {
        return service.getById(id);
    }
}
