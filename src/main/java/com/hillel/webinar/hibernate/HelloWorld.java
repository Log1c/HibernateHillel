package com.hillel.webinar.hibernate;

import com.hillel.webinar.hibernate.entity.User;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class HelloWorld {
    public static void main(String[] args) {
        SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();

        Session session = sessionFactory.openSession();
        Transaction transaction = session.beginTransaction();

        User user = new User();
        user.setFirstName("Vlad");
        user.setLastName("Obshencev");
        session.save(user);

        transaction.commit();

        session.close();
        sessionFactory.close();
    }
}
