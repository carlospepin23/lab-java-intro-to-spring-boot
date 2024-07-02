package com.ironhack.model;

import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@Entity
public class Patient {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer patient_id;
    private String name;
    private String date_of_birth;

    @ManyToOne
    @JoinColumn(name = "admitted_by", referencedColumnName = "employee_id")
    private Employee admittedBy;

    public Patient(String name, String date_of_birth, Employee admittedBy) {
        this.name = name;
        this.date_of_birth = date_of_birth;
        this.admittedBy = admittedBy;
    }

}


