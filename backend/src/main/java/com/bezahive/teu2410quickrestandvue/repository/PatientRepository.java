package com.bezahive.teu2410quickrestandvue.repository;

import com.bezahive.teu2410quickrestandvue.model.Patient;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PatientRepository extends CrudRepository<Patient,Long> {

     public Patient findPatientByEmail (String email);

}
