package org.example.Dao;

import org.example.Entity.Fruit;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FruitDao extends JpaRepository<Fruit,String> {

}
