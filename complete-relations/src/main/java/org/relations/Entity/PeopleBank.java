package org.relations.Entity;

import com.fasterxml.jackson.annotation.JsonManagedReference;

import javax.persistence.*;
import java.util.List;

@Entity
public class PeopleBank {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    Long id;

    String Name;

    String Surname;

    @JsonManagedReference
    @ManyToMany( mappedBy = "peopleBank", fetch = FetchType.EAGER, cascade = CascadeType.ALL)
    List<Bank> bank;

    public PeopleBank() {
    }

    public PeopleBank(Long id, String name, String surname, List<Bank> bank) {
        this.id = id;
        Name = name;
        Surname = surname;
        this.bank = bank;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getSurname() {
        return Surname;
    }

    public void setSurname(String surname) {
        Surname = surname;
    }

    public List<Bank> getBank() {
        return bank;
    }

    public void setBank(List<Bank> bank) {
        this.bank = bank;
    }
}
