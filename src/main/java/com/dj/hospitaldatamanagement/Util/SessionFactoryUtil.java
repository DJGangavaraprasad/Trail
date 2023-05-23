package com.dj.hospitaldatamanagement.Util;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.dj.hospitaldatamanagement.entity.DoctorEntity;
import com.dj.hospitaldatamanagement.entity.History;
import com.dj.hospitaldatamanagement.entity.PersonEntity;
import com.dj.hospitaldatamanagement.entity.Reviews;

public class SessionFactoryUtil {

	private static SessionFactory sessionfactory = null;

	static {
		Configuration configuration = new Configuration();
		configuration.setProperties(MysqlConnectionPropertiesutil.getConnectionProperties());
		configuration.addAnnotatedClass(PersonEntity.class);
		configuration.addAnnotatedClass(DoctorEntity.class);
		configuration.addAnnotatedClass(History.class);
		configuration.addAnnotatedClass(Reviews.class);
		sessionfactory = configuration.buildSessionFactory();
	}

	public static SessionFactory getSessionFactory() {
		return sessionfactory;
	}

}
