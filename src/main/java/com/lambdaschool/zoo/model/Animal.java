package com.lambdaschool.zoo.model;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "animal")

public class Animal {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long animalid;
    private String animaltype;

    @ManyToMany
    @JoinTable(name = "zooanimals",
            joinColumns = {@JoinColumn(name = "animalid")},
            inverseJoinColumns = {@JoinColumn(name = "zooid")})
            private List<Zoo> zoo = new ArrayList<>();

    public Animal() {
    }

    public Animal(String animaltype, List<Zoo> zoo) {
        this.animaltype = animaltype;
        this.zoo = zoo;
    }

    public Animal(String animaltype) {
        this.animaltype = animaltype;
    }

    public long getAnimalid() {
        return animalid;
    }

    public void setAnimalid(long animalid) {
        this.animalid = animalid;
    }

    public String getAnimaltype() {
        return animaltype;
    }

    public void setAnimaltype(String animaltype) {
        this.animaltype = animaltype;
    }

    public List<Zoo> getZoo() {
        return zoo;
    }

    public void setZoo(List<Zoo> zoo) {
        this.zoo = zoo;
    }
}
