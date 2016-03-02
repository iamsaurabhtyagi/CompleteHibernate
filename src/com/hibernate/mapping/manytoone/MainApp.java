package com.hibernate.mapping.manytoone;

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
		
		UserDetail userDetail=new UserDetail();
		userDetail.setName("Sudhir Kumar");
		
		VehicleDetail vehicleDetail1=new VehicleDetail();
		vehicleDetail1.setVehicleName("YAHAMAHA FZS");
		vehicleDetail1.setVechicleNo("DL 03 MA 1244");
		vehicleDetail1.setUserDetail(userDetail);
		
		VehicleDetail vehicleDetail2=new VehicleDetail();
		vehicleDetail2.setVehicleName("HERO SPLENDER");
		vehicleDetail2.setVechicleNo("DL 03 MA 1141");
		vehicleDetail2.setUserDetail(userDetail);
		
		session.save(vehicleDetail1);
		session.save(vehicleDetail2);
		
		session.save(userDetail);
		
		transaction.commit();
		session.close();
		System.out.println("Transaction has been completed Successfully !");
		System.exit(0);
	}

}
