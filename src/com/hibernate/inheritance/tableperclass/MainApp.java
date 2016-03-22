package com.hibernate.inheritance.tableperclass;

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
		
		
		
		transaction.begin();
		session.close();
		System.out.println("Transaction has been completed successfully!");
		System.exit(0);
	}

}
