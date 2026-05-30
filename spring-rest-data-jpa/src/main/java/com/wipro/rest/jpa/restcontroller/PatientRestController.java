package com.wipro.rest.jpa.restcontroller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.wipro.rest.jpa.entity.Patient;
import com.wipro.rest.jpa.service.IPatientService;

@RestController
@RequestMapping("/api/patients")
public class PatientRestController {

    @Autowired
    IPatientService service;

    @PostMapping("/add")
    public Patient addPatient(@RequestBody Patient patient) {
        return service.addPatient(patient);
    }

    @PutMapping("/update")
    public Patient updatePatient(@RequestBody Patient patient) {
        return service.updatePatient(patient);
    }

    @GetMapping("/getall")
    public List<Patient> getAllPatients() {
        return service.getAllPatients();
    }

    @GetMapping("/getbypid/{pid}")
    public Patient getByPid(@PathVariable int pid) {
        return service.getByPid(pid);
    }

    @DeleteMapping("/deletebypid/{pid}")
    public String deleteByPid(@PathVariable int pid) {
        service.deleteByPid(pid);
        return "Record Deleted Successfully";
    }

    @GetMapping("/getbypname/{pname}")
    public Patient getByPname(@PathVariable String pname) {
        return service.getByPname(pname);
    }

    @GetMapping("/getbyagegt/{age}")
    public List<Patient> getByAgeGT(@PathVariable int age) {
        return service.getByAgeGT(age);
    }

    @GetMapping("/getbydisease/{disease}")
    public List<Patient> getByDisease(@PathVariable String disease) {
        return service.getByDisease(disease);
    }

    @GetMapping("/getallsorted")
    public List<Patient> getAllPatientsSorted() {
        return service.findAllBySorted();
    }

    @PutMapping("/updatedisease/{disease}/{pid}")
    public String updateDisease(@PathVariable String disease, @PathVariable int pid) {
        int count = service.updateDisease(disease, pid);
        return count + " record updated";
    }
}