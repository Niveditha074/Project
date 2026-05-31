package com.wipro.doctor.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.wipro.doctor.service.DoctorService;

@RestController
@RequestMapping("/doctor")
public class DoctorController {

    @Autowired
    private DoctorService service;

    @GetMapping("/patient/{pid}")
    public String getPatientDetails(@PathVariable int pid) {
        return service.getPatient(pid);
    }
}