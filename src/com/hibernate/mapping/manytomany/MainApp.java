package com.hibernate.mapping.manytomany;

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
		vehicle1.setVehicleName("FZS 250");
		vehicle1.setVechicleNo("UP 20 XZ 2156");
		
		Vehicle vehicle2=new Vehicle();
		vehicle2.setVehicleName("HERO");
		vehicle2.setVechicleNo("UP 20 ZZ 1258");
		
		Teacher teacher=new Teacher();
		teacher.setTeacherName("Saurabh Tyagi");
		
		teacher.getVehicles().add(vehicle1);
		teacher.getVehicles().add(vehicle2);
		
		/*vehicle1.getTeachers().add(teacher);
		vehicle2.getTeachers().add(teacher);*/
		
		session.save(teacher);
		session.save(vehicle1);
		session.save(vehicle2);
		
		transaction.commit();
		session.close();
		System.out.println("Your Transaction has been completed Sucessfully !");
		System.exit(0);
	}

}
