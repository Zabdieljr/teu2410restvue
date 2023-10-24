package com.bezahive.teu2410quickrestandvue.service;

import com.bezahive.teu2410quickrestandvue.model.Patient;
import com.bezahive.teu2410quickrestandvue.repository.PatientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PatientServiceImpl implements PatientService {
    @Autowired
    private PatientRepository patientRepository;
    @Override
    public Patient addPatient(Patient patient) {
        return patientRepository.save(patient);
    }

    @Override
    public Patient getPatientById(long id) {
        return patientRepository.findById(id).get();
    }

    @Override
    public List<Patient> getPatients() {
        return (List<Patient>) patientRepository.findAll();
    }

    @Override
    public void deletePatient(long id) {

        patientRepository.deleteById(id);

    }

    @Override
    public Patient getPatientByEmail(String email) {
        return patientRepository.findPatientByEmail(email);
    }
}
