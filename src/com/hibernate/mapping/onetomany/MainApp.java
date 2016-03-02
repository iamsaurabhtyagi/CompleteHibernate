package com.hibernate.mapping.onetomany;

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
		
		Vehicle vehicle1=new Vehicle();
		vehicle1.setVechicleNo("PB 20 1111");
		vehicle1.setVehicleName("FZS");
		
		Vehicle vehicle2=new Vehicle();
		vehicle2.setVechicleNo("PB 20 2222");
		vehicle2.setVehicleName("FZS");
		
		User user=new User();
		user.setName("Rohit Kumar");
		user.getVehicle().add(vehicle1);
		user.getVehicle().add(vehicle2);
		
		session.save(user);
		session.save(vehicle1);
		session.save(vehicle2);
		
		transaction.commit();
		session.close();
		System.out.println("Transaction has been Completed!");
		System.exit(0);
	}
}
