package com.app.daoimpl;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.query.Query;

import com.app.dao.PetsDao;
import com.app.model.Pets;
import com.app.utility.HibernateUtil;

public class PetsDaoImpl implements PetsDao {

	public int insertData(Pets pt) {
		// TODO Auto-generated method stub
		Session session = HibernateUtil.getSession();
		Transaction tx = null;
		try {
			tx = session.beginTransaction();
			session.persist(pt);
			tx.commit();
			// HibernateUtil.closeSession();
			return 1;
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
			tx.rollback();
			return 0;
		}

	}

	public int updateData(Pets pt) {
		// TODO Auto-generated method stub
		Session session = HibernateUtil.getSession();
		Transaction tx = null;
		try {
			tx = session.beginTransaction();
			Query<Pets> query = session
					.createQuery("update Pets set petName='" + pt.getPetName() + "' where petId=" + pt.getPetId());
			session.update(pt);
			tx.commit();
			// HibernateUtil.closeSession();
			return 1;

		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
			tx.rollback();
			return 0;
		}

	}

	public int deleteData(int id) {
		// TODO Auto-generated method stub
		Session session = HibernateUtil.getSession();
		Transaction tx = null;
		try {
			tx = session.beginTransaction();
			String hql = "delete from Pets where petId =" + id;
			Query<Pets> query = session.createQuery(hql);

			int row = query.executeUpdate();
			tx.commit();
			// HibernateUtil.closeSession();
			return row;
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
			tx.rollback();
			return 0;
		}
	}

	public List<Pets> listPets() {
		// TODO Auto-generated method stub
		Session session = HibernateUtil.getSession();
		Transaction tx = null;
		String hql = "From Pets";
		Query<Pets> query = session.createQuery(hql);
		List<Pets> list = query.list();
		// HibernateUtil.closeSession();
		return list;

	}

	public List<Pets> getPets(int id) {
		// TODO Auto-generated method stub
		// TODO Auto-generated method stub
		Session session = HibernateUtil.getSession();
		Transaction tx = null;
		String hql = "From Pets Where petId =" + id;
		Query<Pets> query = session.createQuery(hql);
		// query.setParameter(1, id);
		List<Pets> list = query.list();
		HibernateUtil.closeSession();
		return list;

	}

}
