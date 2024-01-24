package com.hexaware.hibernate;

import java.util.List;

import org.hibernate.SQLQuery;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.NativeQuery;

import com.hexaware.hibernate.entity.Employee;

public class HibernateSelect {

	public static void main(String[] args) {

		SessionFactory sessionFactory = HibernateUtil.getSessionFactory();

		Session session = sessionFactory.openSession();

		// hql or jpql

//		String selectQuery="select e from Employee e";
//		Query<Employee> query=session.createQuery(selectQuery);
//        List<Employee> list=query.getResultList();
//        
//        for ( Employee employee : list) {
//        	System.out.println(employee);
//		}

		
		
//		String selectQuery = "select e from Employee e where e.salary>?1";
//		Query<Employee> query = session.createQuery(selectQuery);
//		query.setParameter(1, 50000.0);
//
//		List<Employee> list = query.getResultList();
//
//		for (Employee employee : list) {
//			System.out.println(employee);
//		}

//		String selectQuery2= "select e from Employee e where e.ename LIKE '%i%'";
//
//		Query<Employee> query2=session.createQuery(selectQuery2);
//	
//	    System.out.println(query2.getResultList());


		
		//query with named parameter
//		String selectQuery2 = "select e from Employee e where e.eid=:empid";
//
//		Query<Employee> query2 = session.createQuery(selectQuery2);
//
//		query2.setParameter("empid", 101);
//		System.out.println(query2.getResultList());

		
		//to use sql query instead of hql
		String nativeQuery= "select * from Employee_Details ";
		NativeQuery<Employee> query= session.createNativeQuery(nativeQuery,Employee.class);
		List<Employee> list1=query.list();
		System.out.println("native query");
		System.out.println(list1);
		
		
		//old and deprecated
//		SQLQuery<Employee> query4=session.createSQLQuery(nativeQuery);  //NativeQuery is interface
//		query4.addEntity(Employee.class)
//		System.out.println(query4);
//		
//		List<Employee> list4=query4.list();
//		System.out.println("create result list query");
//		System.out.println(list4); 
//		
		
		session.close();
		
		
		
		
	}
}
