package com.bezahive.teu2410quickrestandvue.model;

import jakarta.persistence.*;
@Entity
@Table (name="patient_table")
public class patient {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Long id;

}
