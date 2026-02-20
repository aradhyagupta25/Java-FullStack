package com.aradhyagupta25.Code1;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;



public class Main {
    public static void main(String[] args) {

        Student2 s1 = new Student2();
        s1.setSname("Lallan");
        s1.setRoll(71);
        s1.setAge(29);

        Student2 s2 = null;

//        Configuration cfg = new Configuration();
//        cfg.addAnnotatedClass(Student2.class);
//        cfg.configure("hibernate.cfg.xml");    //loads the xml
//        SessionFactory sessionFactory = cfg.buildSessionFactory();   // a heavyweight, thread-safe object that serves as a factory for Session instances. It is typically created once during application startup and manages the application's entire interaction with the database.

        SessionFactory sessionFactory = new Configuration()      // Second way
                .addAnnotatedClass(Student2.class)
                .configure()
                .buildSessionFactory();

        Session session = sessionFactory.openSession();    //this is just one session. we can create multiple sessions from one SessionFactory.
        Transaction transaction = session.beginTransaction();   // saving data into a table is a transaction -> creating a Transaction.

        //s2 = session.get(Student2.class, 69);   // fetching data from the DB.
        //session.merge(s1);  // updates or create new record.

        s1 = session.get(Student2.class, 45);   // pointing to the object we want to del.
        session.remove(s1); //del the object.

        //session.persist(s1);    //saving the data into the database.


        transaction.commit();   //commiting after completing the Transaction.
        sessionFactory.close(); // closing the session factory to avoid using try-catch.

        System.out.println(s1);
        System.out.println(s2);

    }
}
