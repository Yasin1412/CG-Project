package com.app.utility;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class HibernateUtil {
	private static SessionFactory factory = null;
	static {
		try {
			factory = new Configuration().configure("hibernate.cfg.xml").buildSessionFactory();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}// static

	static ThreadLocal<Session> tl = new ThreadLocal<Session>();
	static Session ses = null;

	public static Session getSession() {
		try {
			if (tl.get() == null) { // get from ThreadLocal
				ses = factory.openSession();
				tl.set(ses); // set into ThreadLocal
				return ses;
			} else {
				return tl.get(); // get from ThreadLocal
			}
		} // try
		catch (Exception e) {
			return null;
		}
	}// method

	public static void closeSession() {
		try {
			ses.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	} // closeSession()
}// class
