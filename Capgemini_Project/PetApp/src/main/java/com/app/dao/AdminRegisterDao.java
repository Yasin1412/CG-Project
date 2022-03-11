package com.app.dao;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.app.model.Admin;
import com.app.utility.HibernateUtil;

public class AdminRegisterDao {

	public int register(Admin admin) {
		try {
			Session session = HibernateUtil.getSession();
			Transaction tx = session.beginTransaction();
			session.save(admin);

			tx.commit();
			return 1;
		} catch (Exception e) {
			e.printStackTrace();
			return 0;
		}
	}
}