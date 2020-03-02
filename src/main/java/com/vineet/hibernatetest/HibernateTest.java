package com.vineet.hibernatetest;

import com.vineet.hibernate.UserDetails;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;


public class HibernateTest {

    public static void main(String[] args) {
        UserDetails user = new UserDetails();
            user.setUserName("First User");

        UserDetails user2 = new UserDetails();
            user2.setUserName("Second user");

            // Frist create Session Factory.
        SessionFactory sessionFactory = new Configuration().configure("cfg.xml").buildSessionFactory();

        // get Session
        Session session = sessionFactory.openSession();

        // Begin transaction
        session.beginTransaction();
        session.save(user);
        session.save(user2);
        session.getTransaction().commit();
        session.close();

/*        user = null;

        Session session1= sessionFactory.openSession();
        session1.beginTransaction();
         user = (UserDetails) session1.load(UserDetails.class,1);
        System.out.println("User    Name retrived is  = " + user.getUserName());*/
    }
}
