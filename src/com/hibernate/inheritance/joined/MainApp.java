package com.hibernate.inheritance.joined;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class MainApp {

	public static void main(String[] args) {
		
		Configuration configuration=new Configuration();
		configuration.configure();
		SessionFactory sessionFactory=configuration.buildSessionFactory();
		
		Session session=sessionFactory.openSession();
		Transaction transaction=session.beginTransaction();
		
		
		
		transaction.commit();
		session.close();
		System.out.println("Transaction has been completed Successfully !");
		System.exit(0);
		
	}

}
