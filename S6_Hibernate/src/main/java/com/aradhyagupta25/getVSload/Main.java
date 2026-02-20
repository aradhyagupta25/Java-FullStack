package com.aradhyagupta25.getVSload;

import com.aradhyagupta25.HQL.Laptop;
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

        Laptop l3 = new Laptop();
        l3.setLid(3);
        l3.setBrand("Apple");
        l3.setModel("M4 Pro");
        l3.setRam(32);

        Laptop l4 = new Laptop();
        l4.setLid(4);
        l4.setBrand("Lenovo");
        l4.setModel("YoGa");
        l4.setRam(16);

        SessionFactory sessionFactory = new Configuration()     // import org.hibernate.cfg.Configuration;
                .addAnnotatedClass(Laptop.class)
                .configure()
                .buildSessionFactory();

        Session session = sessionFactory.openSession();
        Transaction transaction = session.beginTransaction();


//        Laptop l5 = session.get(Laptop.class, 3);     // executes and fire the query without asking to print (eager loading).
//        Laptop l5 = session.load(Laptop.class, 3);    // executes only when asked to print (lazy loading).
        Laptop l5 = session.byId(Laptop.class).getReference( 3);
        System.out.println(l5);


        transaction.commit();
        session.close();
        sessionFactory.close();
    }
}
