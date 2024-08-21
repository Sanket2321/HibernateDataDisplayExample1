


package com.tcs1;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class ClientInsert {
	public static void main(String args[])
	{
		Configuration cfg=new Configuration();
		cfg.configure();
		cfg.addAnnotatedClass(Farmer.class);
		SessionFactory factory=cfg.buildSessionFactory();
		//SessionFactory factory=cfg.buildSessionFactory();
		Session session=factory.openSession();
		//Farmer farmer=session.load(Farmer.class,101);
		Farmer farmer=new Farmer(110,"pintu1","1343424235","wepinu7");
		session.save(farmer);
		session.beginTransaction().commit();//auto increment for insert
		
		System.out.println("inserted sucessfuly");//System.out.println(farmer);
	}

}
