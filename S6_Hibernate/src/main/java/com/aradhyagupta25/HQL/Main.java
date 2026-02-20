package com.aradhyagupta25.HQL;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import org.hibernate.query.Query;
import java.util.List;


public class Main {
    public static void main(String[] args) {

        Laptop l1 = new Laptop();
        l1.setLid(1);
        l1.setBrand("Apple");
        l1.setModel("M3 Air");
        l1.setRam(16);

        Laptop l2 = new Laptop();
        l2.setLid(2);
        l2.setBrand("ASUS");
        l2.setModel("TUF F15");
        l2.setRam(8);

        SessionFactory sessionFactory = new Configuration()     // import org.hibernate.cfg.Configuration;
                .addAnnotatedClass(Laptop.class)
                .configure()
                .buildSessionFactory();

        Session session = sessionFactory.openSession();
        Transaction transaction = session.beginTransaction();

//        session.persist(l1);
//        session.persist(l2);


        // select * from laptop where ram = 8 -> sql
        // from laptop where ram = 16 -> HQL

        String brand = "Apple";

//        Query query = session.createQuery("from Laptop where brand like 'Apple'");
//        Query query = session.createQuery("from Laptop");
        Query query = session.createQuery("from Laptop where brand like ?1 ");
        query.setParameter(1, brand );

        List<Laptop> laptops = query.getResultList();
        System.out.println(laptops);



        transaction.commit();
        session.close();
        sessionFactory.close();

    }
}
