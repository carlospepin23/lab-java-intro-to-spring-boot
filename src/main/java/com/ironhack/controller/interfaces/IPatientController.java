package com.ironhack.controller.interfaces;

import com.ironhack.model.Patient;

import java.util.List;

public interface IPatientController {
    public List<Patient> getAllPatients();
    public Patient getPatientById(Integer id);
    public List<Patient> getAllPatientsByDateOfBirthRange(String start_date, String end_date);
    public List<Patient> getAllPatientsByAdmittingDoctorDepartment(String department);
    public List<Patient> getAllPatientsByAdmittingDoctorStatusOff();
}
