package com.hibernate.association;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class MainApp {

	public static void main(String[] args) {
		
		Address address=new Address();
		address.setStreet("#123");
		address.setCity("CHD");
		address.setState("PB");
		address.setPinCode("546321");
		
		Employee emp=new Employee();
		emp.setName("Saurabh");
		emp.setHomeAddress(address);
		emp.setOfficeAddress(address);
		
		Configuration cfg=new Configuration();
		cfg.configure("hibernate.cfg.xml");
		
		SessionFactory sf=cfg.buildSessionFactory();
		Session session=sf.openSession();
		Transaction tx=session.beginTransaction();
		
		session.save(emp);
		
		tx.commit();
		session.close();
				
		System.out.println(cfg);
	}

}
