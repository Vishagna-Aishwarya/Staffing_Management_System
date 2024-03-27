package com.model;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class UtilityConfig {

	public static Session getSession() {
		
		Configuration configuration = new Configuration().configure("Configuration.xml");
		SessionFactory sessionFactory = configuration.buildSessionFactory();
		Session session=sessionFactory.openSession();
		return session;
	}
}