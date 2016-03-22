package com.hibernate.inheritance.demo;

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
		
		TwoWheeler twoWheeler=new TwoWheeler();
		twoWheeler.setVehicleName("BIKE FZS");
		twoWheeler.setVechicleNo("UP 20 FR 1452");
		twoWheeler.setSteeringHandle("strate");
		
		FourWheeler fourWheeler=new FourWheeler();
		fourWheeler.setVehicleName("CAR Honda CITY");
		fourWheeler.setVechicleNo("UP 20 AC 1542");
		fourWheeler.setSteeringWheel("Round with grip");
		
		session.save(twoWheeler);
		session.save(fourWheeler);
		
		transaction.commit();
		session.close();
		System.out.println("Transaction has been completed successfully");
		System.exit(0);
		
	}

}
