package com.util;


import org.hibernate.HibernateException;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.entity.EProduct;

public class HibernateUtil {

	public static SessionFactory buildSessionFactory() throws HibernateException {
		
		
		Configuration cfg = new Configuration();
		cfg.configure("hibernate.cfg.xml");
		cfg.addAnnotatedClass(EProduct.class);
		
		
		
		SessionFactory sf = cfg.buildSessionFactory();

		return sf;
	}

}
