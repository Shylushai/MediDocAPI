package com.medidoc.api.service;

import com.amazonaws.services.dynamodbv2.model.ResourceNotFoundException;
import com.medidoc.api.entity.Patient;
import com.medidoc.api.repository.PatientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PacientServicempl implements PatientService {
    @Autowired
    PatientRepository productRepository;

    @Override
    public List<Patient> getPatientList() {
        return (List<Patient>) productRepository.findAll();
    }

    @Override
    public Patient savePatient(Patient product) {
        return productRepository.save(product);
    }

    @Override
    public Patient getPatientById(String id) {
        return productRepository.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("Patient Not Found :" + id));
    }

    @Override
    public Patient updatePatient(String id, Patient product) {
        productRepository.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("Patient Not Found"+id));
        return productRepository.save(product);
    }

    @Override
    public void deletePatient(String id) {
        productRepository.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("Patient Not Found :"+id));
        productRepository.deleteById(id);
    }
}
