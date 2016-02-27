package com.hibernate.collection.set;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class MainApp {

	public static void main(String[] args) {
		
		Configuration configuration=new Configuration();
		configuration.configure("hibernate.cfg.xml");
		SessionFactory sessionFactory=configuration.buildSessionFactory();
		Session session=sessionFactory.openSession();
		Transaction transaction=session.beginTransaction();
		
		EmployeeAddress address1=new EmployeeAddress();
		address1.setStreet("5");
		address1.setCity("CHD");
		address1.setState("PB");
		address1.setPinCode("201160");
		
		EmployeeAddress address2=new EmployeeAddress();
		address2.setStreet("20");
		address2.setCity("PKL");
		address2.setState("HR");
		address2.setPinCode("111560");
		
		EmployeeDetail employee=new EmployeeDetail();
		employee.setName("SUMIT");
		employee.getsAddresses().add(address1);
		employee.getsAddresses().add(address2);
		
		session.save(employee);
		
		transaction.commit();
		session.close();
		System.out.println("Data inserted Successfully");
		System.exit(0);
	}

}
