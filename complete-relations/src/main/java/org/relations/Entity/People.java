package org.relations.Entity;

import com.fasterxml.jackson.annotation.JsonManagedReference;

import javax.persistence.*;
import javax.ws.rs.Path;
import java.util.List;

@Entity
public class People {

    @Id
    @GeneratedValue (strategy = GenerationType.AUTO)
    Long id;

    String name;

    String Gender;

    @OneToMany(mappedBy = "people", fetch = FetchType.EAGER, cascade = CascadeType.ALL)
    @JsonManagedReference
    List<Simcard> simcardList;

    public People() {
    }

    public People(Long id, String name, String gender, List<Simcard> simcardList) {
        this.id = id;
        this.name = name;
        Gender = gender;
        this.simcardList = simcardList;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGender() {
        return Gender;
    }

    public void setGender(String gender) {
        Gender = gender;
    }

    public List<Simcard> getSimcardList() {
        return simcardList;
    }

    public void setSimcardList(List<Simcard> simcardList) {
        this.simcardList = simcardList;
    }
}
