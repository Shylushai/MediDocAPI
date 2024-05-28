package com.medidoc.api.controller;

import com.medidoc.api.entity.Patient;
import com.medidoc.api.service.PatientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class PatientController {
    @Autowired
    PatientService patientService;

    @PostMapping("/patient")
    public ResponseEntity<Patient> savePatient(@RequestBody Patient patient){
        return ResponseEntity.ok(patientService.savePatient(patient));
    }

    @GetMapping("/patient/{id}")
    public ResponseEntity<Patient> getPatientById(@PathVariable String patientid){
        return ResponseEntity.ok(patientService.getPatientById(patientid));
    }

    @GetMapping("/patients")
    public ResponseEntity<List<Patient>> getPatientList(){
        return ResponseEntity.ok(patientService.getPatientList());
    }

    @PutMapping("/patient/{id}")
    public ResponseEntity<Patient> updatePatient(@PathVariable String patientid, @RequestBody Patient patient) {
        return ResponseEntity.ok(patientService.updatePatient(patientid, patient));
    }

    @DeleteMapping("/product/{id}")
    public void deletePatientById(@PathVariable String id){
        patientService.deletePatient(id);
    }


}
