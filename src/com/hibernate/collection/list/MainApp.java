package com.hibernate.collection.list;

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
		
		Employee employee=new Employee();
		employee.setName("Saurabh Kumar");
		
		Address address1=new Address();
		address1.setStreet("1019");
		address1.setCity("Mohali");
		address1.setState("PB");
		address1.setPinCode("160105");
		
		Address address2=new Address();
		address2.setStreet("1245");
		address2.setCity("Panchkula");
		address2.setState("HR");
		address2.setPinCode("160101");
		
		employee.getsAddresses().add(address1);
		employee.getsAddresses().add(address2);
		
		session.save(employee);
		
		transaction.commit();
		session.close();
		
		System.out.println("Record Submitted Successfully.");
	}
}
