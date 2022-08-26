package org.example.Service;

import org.example.Entity.Fruit;

import java.util.List;

public interface FruitService {
    List<Fruit> getAllFruits();

    Fruit getFruitByName(String name);
    Fruit addFruit(Fruit fruit);
    Fruit setFruit(Fruit fruit);
    String deleteFruit(String fruit);
}
