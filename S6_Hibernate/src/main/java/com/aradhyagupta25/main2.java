package com.aradhyagupta25;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
//import java.lang.module.Configuration;

public class main2 {
    public static void main(String[] args) {

        Laptop l1 = new Laptop();
        l1.setBrand("ASUS");
        l1.setModel("TUF F15");
        l1.setRam(16);

        Alien a1  = new Alien();
        a1.setAid(101);
        a1.setAname("Thor");
        a1.setTech("Asguardian");
        a1.setLaptop(l1);

        SessionFactory sessionFactory  = new Configuration()
                .addAnnotatedClass(Alien.class)
                .configure()
                .buildSessionFactory();

        Session session = sessionFactory.openSession();
        Transaction tx = session.beginTransaction();

        session.persist(a1);
        tx.commit();

        Alien a2 = session.get(Alien.class, 101);
        System.out.println(a2);

        session.close();
        sessionFactory.close();

        //System.out.println(a1);


    }
}
