package com.bezahive.teu2410quickrestandvue.model;

import jakarta.persistence.*;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;
import org.springframework.format.annotation.NumberFormat;

import java.text.DateFormat;
import java.util.Date;

@Entity
@EntityListeners(AuditingEntityListener.class)
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
    @Temporal(TemporalType.TIMESTAMP)
    @CreatedDate
    private Date createdDate;
    @LastModifiedDate
    private Date accessedDate;

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

    public Date getCreatedDate() {
        return createdDate;
    }

    public void setCreatedDate(Date createdDate) {
        this.createdDate = createdDate;
    }

    public Date getAccessedDate() {
        return accessedDate;
    }

    public void setAccessedDate(Date accessedDate) {
        this.accessedDate = accessedDate;
    }
}
