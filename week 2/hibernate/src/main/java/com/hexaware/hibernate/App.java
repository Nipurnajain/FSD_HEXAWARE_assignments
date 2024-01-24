package com.hexaware.hibernate;

import java.io.Serializable;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.hexaware.hibernate.entity.Employee;

/**
 * Hello world!
 *
 */
public class App {
	public static void main(String[] args) {

		SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
		System.out.println(sessionFactory);
		Session session = sessionFactory.openSession();
		System.out.println(session);
		//transaction for dml only
		Transaction txn=session.beginTransaction();
		
		//Employee emp1=new Employee(101,"king khan",60000);
		
		
		//session.delete(emp1);
		
        //Serializable ser=     session.save(emp1);     //insert or update
       // System.out.println(ser.toString());
//		Employee emp2=new Employee(102,"smith",80000);
//		Employee emp3=new Employee(103,"adam",20000);
//		Employee emp4=new Employee(104,"ford",90000);
//		
//		session.save(emp2);
//		session.save(emp3);
//		session.save(emp4);
        
//		Employee emp1=session.get(Employee.class, 101);       //fetching object that already persists or is stored in memory
//		
//		System.out.println(emp1);
//		emp1.setEname(" Mr.king khan");
//		emp1.setSalary(50500);
//		Serializable ser= session.save(emp1);
//		System.out.println("updated record "+ ser.toString());
//		Employee updatedEmp= session.get(Employee.class,101);
//		System.out.println(updatedEmp);
		
		Employee e=new Employee(103,"adam",35000);           //update
		session.saveOrUpdate(e);
		
		//session.persist(e);                //used for insert and update was introduced in jpa
		
        txn.commit();
	}
}
