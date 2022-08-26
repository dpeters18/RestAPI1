package org.example.Controller;

import org.example.Service.FruitService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.example.Entity.Fruit;
import java.util.List;

@RestController
public class MyController {
    @Autowired
    private FruitService fruitService;

    @GetMapping("/")
    public String home(){
        return "<HTML><H1>Fruit Service</H1></HTML>";
    }
    @GetMapping("/fruitService")
    public List<Fruit> getFruits(){
        return this.fruitService.getAllFruits();
    }
    @GetMapping("/fruits/{fruits}")
    public Fruit getFruitByName(@PathVariable String fruits){
        return this.fruitService.getFruitByName(fruits);
    }
    @PostMapping("/fruitService")
    public Fruit addFruit(@RequestBody Fruit fruit){
        return this.fruitService.addFruit(fruit);
    }
    @PutMapping("/fruitService")
    public Fruit setFruit(@RequestBody Fruit fruit){
        return this.fruitService.setFruit(fruit);
    }
    @DeleteMapping("/fruitService/{name}")
    public String deleteFruit(@PathVariable String name){
         return this.fruitService.deleteFruit(name);
    }
}
