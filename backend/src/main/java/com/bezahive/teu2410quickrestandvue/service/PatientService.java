package com.bezahive.teu2410quickrestandvue.service;


import com.bezahive.teu2410quickrestandvue.model.Patient;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface PatientService {
    // add entity
    public Patient addPatient (Patient patient);
    // get entity
    public Patient getPatientById(long id);
    // List<Entity> get Entity
    public List<Patient> getPatients();
    // delete entity (void)
    public void deletePatient(long id);

    // non repo class methods
    public Patient getPatientByEmail (String email);

}
