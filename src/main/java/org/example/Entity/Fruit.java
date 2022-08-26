package org.example.Entity;

import javax.persistence.*;

@Entity
@Table
public class Fruit {
    @Id
    @Column
   // @GeneratedValue
    String name;
    @Column
    String type;
    @Column
    String taste;

    public Fruit() {
    }

    public Fruit(String name, String type, String taste) {
        this.name = name;
        this.type = type;
        this.taste = taste;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getTaste() {
        return taste;
    }

    public void setTaste(String taste) {
        this.taste = taste;
    }
}
