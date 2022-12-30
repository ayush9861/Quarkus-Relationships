package org.relations.Entity;

import com.fasterxml.jackson.annotation.JsonBackReference;

import javax.persistence.*;

@Entity
public class Simcard {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    Long id;
    String Name;

    String Provider;

    @ManyToOne()
    @JsonBackReference
    People people;

    public Simcard() {
    }

    public Simcard(Long id, String name, String provider, People people) {
        this.id = id;
        Name = name;
        Provider = provider;
        this.people = people;
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

    public String getProvider() {
        return Provider;
    }

    public void setProvider(String provider) {
        Provider = provider;
    }

    public People getPeople() {
        return people;
    }

    public void setPeople(People people) {
        this.people = people;
    }
}
