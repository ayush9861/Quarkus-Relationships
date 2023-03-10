package org.relations.Entity;

import com.fasterxml.jackson.annotation.JsonBackReference;

import javax.persistence.*;

@Entity
public class Aadhar {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    Long id;
    Long aadharNumber;
    String Company;
    @JsonBackReference
    @OneToOne
    Citizen citizen;

    public Aadhar() {
    }

    public Aadhar(Long id, Long aadharNumber, String company, Citizen citizen) {
        this.id = id;
        this.aadharNumber = aadharNumber;
        Company = company;
        this.citizen = citizen;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getAadharNumber() {
        return aadharNumber;
    }

    public void setAadharNumber(Long aadharNumber) {
        this.aadharNumber = aadharNumber;
    }

    public String getCompany() {
        return Company;
    }

    public void setCompany(String company) {
        Company = company;
    }

    public Citizen getCitizen() {
        return citizen;
    }

    public void setCitizen(Citizen citizen) {
        this.citizen = citizen;
    }
}