package com.lambdaschool.zoo.services;

import com.lambdaschool.zoo.model.Animal;
import com.lambdaschool.zoo.views.CountAnimalsInZoos;

import java.util.ArrayList;

public interface AnimalService {

    ArrayList<Animal> findAll();

    void delete(long id);

    ArrayList<CountAnimalsInZoos> getCountAnimalsInZoos();
}
