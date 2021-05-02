package com.example.persistence;

import org.hibernate.Session;

public class DatabaseConnetor {

    protected static DatabaseConnetor instance = null;

    public static DatabaseConnetor getInstance() {
        if (instance == null) {
            instance = new DatabaseConnetor();
        }
        return instance;
    }

    private Session session;

    private DatabaseConnetor() {
        session = HibernateUtil.getSessionFactory().openSession();
    }

    public void teardown() {
        session.close();
        HibernateUtil.shutdown();
        instance = null;
    }

    public Session getSession() {
        return session;
    }

}