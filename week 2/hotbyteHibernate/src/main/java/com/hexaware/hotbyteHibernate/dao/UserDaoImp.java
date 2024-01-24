package com.hexaware.hotbyteHibernate.dao;

import java.io.Serializable;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.query.Query;

import com.hexaware.hotbyteHibernate.HibernateUtil;
import com.hexaware.hotbyteHibernate.entity.Users;

public class UserDaoImp implements IUserDao {

	SessionFactory sessionFactory = HibernateUtil.getSessionFactory();

	Session session = sessionFactory.openSession();
	
	@Override
	public Serializable insertUsers(Users user) {
		Transaction txn=session.beginTransaction();
		session.clear();
        Serializable userId =session.save(user);
        txn.commit();
        session.close();
        return userId;
	}

	@Override
	public boolean updateUsers(Users user) {
		Transaction txn = session.beginTransaction();
	    session.clear();
	    session.update(user);
	    txn.commit();
	    session.close();
		return true;
        
        
	}

	@Override
	public boolean deleteUserByUsername(String username) {
		
		Transaction txn = session.beginTransaction();
	    session.clear();

	    Query query = session.createQuery("DELETE FROM Users WHERE userName = :userName");
	    query.setParameter("userName", username);

	    int result = query.executeUpdate();
	    txn.commit();
	    session.close();

	    return result > 0;
	}

	@Override
	public Users selectUserByUsername(String username) {
		
		Query query = session.createNamedQuery("selectUserByUsername");
		query.setParameter("userName",username);
		Users user = (Users) query.getSingleResult();

		return user;
	}

	@Override
	public List<Users> selectAllUsers() {
		Query query = session.createNamedQuery("getAllUsers");
		List<Users> list = query.getResultList();

		return list;
	}

}
