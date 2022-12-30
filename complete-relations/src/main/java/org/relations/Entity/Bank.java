package org.relations.Entity;

import com.fasterxml.jackson.annotation.JsonBackReference;

import javax.persistence.*;
import java.util.List;

@Entity
public class Bank {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    Long id;

    String Name;

    String Branch;

    @JsonBackReference
    @ManyToMany()
    List<PeopleBank> peopleBank;


    public Bank() {
    }

    public Bank(Long id, String name, String branch, List<PeopleBank> peopleBank) {
        this.id = id;
        Name = name;
        Branch = branch;
        this.peopleBank = peopleBank;
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

    public String getBranch() {
        return Branch;
    }

    public void setBranch(String branch) {
        Branch = branch;
    }

    public List<PeopleBank> getPeopleBank() {
        return peopleBank;
    }

    public void setPeopleBank(List<PeopleBank> peopleBank) {
        this.peopleBank = peopleBank;
    }
}
