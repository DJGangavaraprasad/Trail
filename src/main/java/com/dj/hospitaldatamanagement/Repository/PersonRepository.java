package com.dj.hospitaldatamanagement.Repository;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.dj.hospitaldatamanagement.Util.SessionFactoryUtil;
import com.dj.hospitaldatamanagement.entity.PersonEntity;

public class PersonRepository {

	public void SavePerson(PersonEntity entity) {
		SessionFactory factory = SessionFactoryUtil.getSessionFactory();
		Session session = factory.openSession();
		Transaction transaction = session.beginTransaction();
		session.merge(entity);
		transaction.commit();
	}
	public void deletePerson(PersonEntity entity) {
		SessionFactory factory = SessionFactoryUtil.getSessionFactory();
		Session session = factory.openSession();
		Transaction transaction = session.beginTransaction();
		session.delete(entity);
		transaction.commit();
	}
	public PersonEntity FindPersonById(Integer id) {
		SessionFactory factory = SessionFactoryUtil.getSessionFactory();
		Session session = factory.openSession();
		return session.find(PersonEntity.class, id);
	}
}
