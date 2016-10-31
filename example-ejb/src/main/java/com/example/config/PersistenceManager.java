package com.example.config;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 * Created by jhenaoz on 10/30/16.
 */
public class PersistenceManager {
    private static PersistenceManager ourInstance = new PersistenceManager();

    public static PersistenceManager getInstance() {
        return ourInstance;
    }

    private EntityManagerFactory emFactory;

    public EntityManager getEntityManager(){
        return emFactory.createEntityManager();
    }

    public void close(){
        emFactory.close();
    }
    private PersistenceManager() {
        emFactory = Persistence.createEntityManagerFactory("testdb");
    }

}
