package com.bezahive.teu2410quickrestandvue.model;

import jakarta.persistence.*;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.format.annotation.NumberFormat;

import java.text.DateFormat;

@Entity
@Table (name="patient_table")
public class Patient {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private long  id;

    private String name;
    private String email;
    @NumberFormat
    private String pNo;
    private String gender;
    @DateTimeFormat
    @CreatedDate
    private DateFormat createdDate;
    @DateTimeFormat
    @LastModifiedDate
    private DateFormat accessedDate;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getpNo() {
        return pNo;
    }

    public void setpNo(String pNo) {
        this.pNo = pNo;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public DateFormat getCreatedDate() {
        return createdDate;
    }

    public void setCreatedDate(DateFormat createdDate) {
        this.createdDate = createdDate;
    }

    public DateFormat getAccessedDate() {
        return accessedDate;
    }

    public void setAccessedDate(DateFormat accessedDate) {
        this.accessedDate = accessedDate;
    }
}
