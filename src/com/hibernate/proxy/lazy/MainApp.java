package com.hibernate.proxy.lazy;

import java.util.Collection;

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
		
		Employee employee=(Employee) session.get(Employee.class, 14);
		System.out.println("----------------------------------------");
		System.out.println(employee.getEmpId()+"  "+employee.getName()+"  "+employee.getsAddresses());
		
		transaction.commit();
		session.close();
		Collection<Address> collection=(Collection)employee.getsAddresses();
		System.out.println(collection);
		System.out.println("Transaction Completed Successfully!");
		System.exit(0);
	}

}
