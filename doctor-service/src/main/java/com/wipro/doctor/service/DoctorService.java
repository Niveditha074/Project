package com.wipro.doctor.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class DoctorService {

    @Autowired
    private RestTemplate restTemplate;

    public String getPatient(int pid) {

        String url = "http://localhost:8081/patient/" + pid;

        return restTemplate.getForObject(url, String.class);
    }
}