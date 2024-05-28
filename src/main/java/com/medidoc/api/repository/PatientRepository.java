package com.medidoc.api.repository;

import com.medidoc.api.entity.Patient;
import org.socialsignin.spring.data.dynamodb.repository.EnableScan;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
@EnableScan
public interface PatientRepository extends CrudRepository<Patient,String> {
}
