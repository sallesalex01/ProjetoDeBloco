package org.example.repository;

import org.example.model.Bike;

import java.util.List;

public class BikeRepository {
    private List<Bike> bikes;
    private long lastId = 1;

    //Lista
    public List<Bike> list(){
        return bikes;
    }

    //Criar
    public Bike create(Bike bike){
        bike.setId(lastId++);
        bikes.add(bike);
        return bike;
    }

    //ler

    //Atualizar

    //Excluir
}
