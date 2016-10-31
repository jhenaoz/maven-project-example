package com.example.dao;

import com.example.config.PersistenceManager;
import com.example.entities.Program;

import javax.persistence.EntityManager;

/**
 * Created by jhenaoz on 10/30/16.
 */
public class ProgramDao {

    public Program createProgram(Program program){
        EntityManager entityManager = PersistenceManager.getInstance().getEntityManager();
        entityManager.getTransaction().begin();
        entityManager.persist(program);
        entityManager.getTransaction().commit();
        entityManager.close();
        return program;
    }
}
