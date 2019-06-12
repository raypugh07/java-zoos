package com.lambdaschool.zoo.model;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name="zoo")

public class Zoo {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long zooid;

    private String zooname;

    @OneToMany(mappedBy = "zoo")
    private List<Telephone> telephone=new ArrayList<>();

    @ManyToMany(mappedBy = "zoo")
    private List<Animal> animal=new ArrayList<>();

    public Zoo() {
    }

    public Zoo(String zooname, List<Telephone> telephone, List<Animal> animal) {
        this.zooname = zooname;
        this.telephone = telephone;
        this.animal = animal;
    }

    public long getZooid() {
        return zooid;
    }

    public void setZooid(long zooid) {
        this.zooid = zooid;
    }

    public String getZooname() {
        return zooname;
    }

    public void setZooname(String zooname) {
        this.zooname = zooname;
    }

    public List<Telephone> getTelephone() {
        return telephone;
    }

    public void setTelephone(List<Telephone> telephone) {
        this.telephone = telephone;
    }

    public List<Animal> getAnimal() {
        return animal;
    }

    public void setAnimal(List<Animal> animal) {
        this.animal = animal;
    }
}
