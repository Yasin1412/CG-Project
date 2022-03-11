package com.app.daoimpl;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;

import com.app.dao.BankInfoDao;
import com.app.model.BankInfo;
import com.app.model.Pets;
import com.app.utility.HibernateUtil;

public class BankInfoImple implements  BankInfoDao {

	public int insertBankData(BankInfo b) {
		// TODO Auto-generated method stub
		SessionFactory factory=new Configuration().configure("hibernate.cfg.xml").buildSessionFactory();
		Session session = factory.openSession();
		Transaction tx  = session.beginTransaction();
		try {
			
			session.persist(b);
			//session.save(b);
			tx.commit();
			 session.close();
			return 1;
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
			tx.rollback();
			return 0;
		}
	}
		
		public List<BankInfo> listBankInfo() {
			// TODO Auto-generated method stub
			Session session = HibernateUtil.getSession();
			Transaction tx = null;
			String hql = "From BankInfo";
			Query<BankInfo> query = session.createQuery(hql);
			List<BankInfo> list = query.list();
			// HibernateUtil.closeSession();
			return list;

		}
	
}
