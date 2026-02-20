package com.aradhyagupta25.Code2;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import java.util.Arrays;
//import java.lang.module.Configuration;

public class main2 {
    public static void main(String[] args) {

        Laptop l1 = new Laptop();
        l1.setLid(1);
        l1.setBrand("ASUS");
        l1.setModel("TUF F15");
        l1.setRam(16);

        Laptop l2 = new Laptop();
        l2.setLid(2);
        l2.setBrand("Apple");
        l2.setModel("M3 Air");
        l2.setRam(16);

        Laptop l3 = new Laptop();
        l3.setLid(3);
        l3.setBrand("Lenovo");
        l3.setModel("YoGa");
        l3.setRam(32);

        Alien a1  = new Alien();
        a1.setAid(101);
        a1.setAname("Thor");
        a1.setTech("Asguardian");
        a1.setLaptop(Arrays.asList(l1, l2));

        Alien a2 = new Alien();
        a2.setAid(102);
        a2.setAname("Venom");
        a2.setTech("Klyntar");
        a2.setLaptop(Arrays.asList(l3, l2));

        Alien a3 = new Alien();
        a3.setAid(103);
        a3.setAname("Valkyrie");
        a3.setTech("Sakaar");
        a3.setLaptop(Arrays.asList(l1));

        l1.setAlien(Arrays.asList(a1, a3));
        l2.setAlien(Arrays.asList(a1, a2));
        l3.setAlien(Arrays.asList(a3));

        SessionFactory sessionFactory  = new Configuration()
                .addAnnotatedClass(Alien.class)
                .addAnnotatedClass(Laptop.class)
                .configure()
                .buildSessionFactory();

        Session session = sessionFactory.openSession();
        Transaction tx = session.beginTransaction();

        session.persist(l1);
        session.persist(l2);
        session.persist(l3);

        session.persist(a1);
        session.persist(a2);
        session.persist(a3);

        tx.commit();

        Alien a4 = session.get(Alien.class, 103);
        System.out.println(a4);

         session.close();
        sessionFactory.close();



    }
}
