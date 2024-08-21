package com.tcs1;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class ClientSaveOrUpdate {
	public static void main(String args[])
	{
		Configuration cfg=new Configuration();
		cfg.configure();
		cfg.addAnnotatedClass(Farmer.class);
		SessionFactory factory=cfg.buildSessionFactory();
		//SessionFactory factory=cfg.buildSessionFactory();
		Session session=factory.openSession();
		//Farmer farmer=session.load(Farmer.class,101);
		Farmer farmer=new Farmer("Gan12","123","son");
		session.saveOrUpdate(farmer);
		session.beginTransaction().commit();
		//System.out.println("inserted sucessfuly");//System.out.println(farmer);
	}

}
