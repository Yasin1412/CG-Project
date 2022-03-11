package com.app.dao;
import org.hibernate.Session;
import org.hibernate.Transaction;

import com.app.model.User;
import com.app.utility.HibernateUtil;

public class UserRegisterDao {


	public int userregister(User user) {
		try {
			Session session = HibernateUtil.getSession();
			Transaction tx = session.beginTransaction();
			session.save(user);

			tx.commit();
			return 1;
		} catch (Exception e) {
			e.printStackTrace();
			return 0;
		}
	}
}


