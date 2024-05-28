package com.medidoc.api.service;


import com.medidoc.api.entity.Patient;


import java.util.List;

public interface PatientService {
    List<Patient> getPatientList();
    Patient savePatient(Patient patient);
    Patient getPatientById(String id);
    Patient updatePatient(String id,Patient patient);
    void deletePatient(String id);
}
