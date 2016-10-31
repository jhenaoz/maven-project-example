package com.example.entities;

import javax.annotation.Generated;
import javax.persistence.*;

@Table(name = "table")
@Entity
public class Program {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY )
    private int id;

    @Column
    private String name;


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Program(String name){
        this.name = name;
    }

    public Program(){}
}
