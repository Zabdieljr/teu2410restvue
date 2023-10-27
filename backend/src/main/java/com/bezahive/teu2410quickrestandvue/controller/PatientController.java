package com.bezahive.teu2410quickrestandvue.controller;

import com.bezahive.teu2410quickrestandvue.model.Patient;
import com.bezahive.teu2410quickrestandvue.repository.PatientRepository;
import com.bezahive.teu2410quickrestandvue.service.PatientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin(origins = "http://localhost:5173")
public class PatientController {
    private final PatientRepository patientRepository;


    @Autowired
    private PatientService patientService;

    @Autowired

    public PatientController(PatientRepository patientRepository) {
        this.patientRepository = patientRepository;
    }

    @RequestMapping("/")
    public String Welcome(){
        return "Teusday Oct/24/2023 Patient CRUD REST API";
    }

    @PostMapping("/add")
    public String addPatient(@RequestBody Patient patient){

        patientService.addPatient(patient);
               return "Patient Added Sucessfully....";
    }

    //get patients by id
    @RequestMapping ("/patient/{id}")
    public Patient getPatientById(@PathVariable("id") long id){
        return patientService.getPatientById(id);

    }

    //get patients
    @RequestMapping ("/patients")
    public List<Patient> getPatients(){
        return patientService.getPatients();
    }

    // update patient

    @PutMapping("/patient")
    public Patient updatePatient(@RequestBody Patient patient){
        return patientService.updatePatient(patient);
    }

    // delete Patient

    @DeleteMapping("/patient/{id}")
    public String deletePatient(@PathVariable ("id")long id){
        patientService.deletePatient(id);
        return "Patient Deleted";
    }

    @GetMapping("/byEmail/{email}")
    public Patient getPatientByEmail(@PathVariable String email) {
        return patientRepository.findByEmail(email);
    }


}
