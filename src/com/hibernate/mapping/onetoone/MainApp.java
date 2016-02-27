package com.hibernate.mapping.onetoone;

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
		
		Vehicle vehicle=new Vehicle();
		vehicle.setVehicleName("Scooty");
		
		Employee employee=new Employee();
		employee.setName("Swati");
		employee.setVehicle(vehicle);
		
		session.save(employee);
		session.save(vehicle);
		
		transaction.commit();
		session.close();
		System.out.println("Transaction Completed Successfully!");
	}

}
