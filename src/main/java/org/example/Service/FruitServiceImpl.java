package org.example.Service;

import org.example.Dao.FruitDao;
import org.example.Entity.Fruit;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class FruitServiceImpl implements FruitService {
    
    @Autowired
    private FruitDao fruitDao;
    public FruitServiceImpl() {
    }

    @Override
    public List<Fruit> getAllFruits() {
        return this.fruitDao.findAll();
    }

    @Override
    public Fruit getFruitByName(String name) {
      return this.fruitDao.getReferenceById(name);
    }

    @Override
    public Fruit addFruit(Fruit fruit) {
         return this.fruitDao.save(fruit);
    }

    @Override
    public Fruit setFruit(Fruit fruit) {
        return this.fruitDao.save(fruit);
    }

    @Override
    public String deleteFruit(String name) {
        this.fruitDao.deleteById(name);
        return "Successfully deleted fruit "+name;
    }
}