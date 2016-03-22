package com.hibernate.inheritance.singletable;

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
		
		Cow cow=new Cow();
		cow.setLags("4");
		cow.setColor("Brown");
		cow.setTail("1");
		cow.setDeepNack("DEEP NACK");
		
		Buffalo buffalo=new Buffalo();
		buffalo.setColor("BLACK");
		buffalo.setLags("4");
		buffalo.setTail("1");
		buffalo.setRoundNack("ROUND NACK");
		
		session.save(cow);
		session.save(buffalo);
				
		transaction.commit();
		session.close();
		
		System.out.println("Transaction has been Completed!");
		System.exit(0);
	}

}
