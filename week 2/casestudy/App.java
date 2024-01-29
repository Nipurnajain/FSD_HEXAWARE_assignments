package com.hexaware.casestudy;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.hexaware.casestudy.entity.Customers;
import com.hexaware.casestudy.entity.DeliveryAddress;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) {
    System.out.println("main executed");

	SessionFactory sessionFactory = HibernateUtil.getSessionFactory();

	try (Session session = sessionFactory.openSession()) {
		

		Transaction transaction = session.beginTransaction();

		

		transaction.commit();
	}
		}
    }

