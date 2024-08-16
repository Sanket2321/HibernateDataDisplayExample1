package com.tcs1;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Main {
	public static void main(String args[])
	{
		Configuration cfg=new Configuration();
		cfg.configure();
		cfg.addAnnotatedClass(Farmer.class);
		SessionFactory factory=cfg.buildSessionFactory();
		//SessionFactory factory=cfg.buildSessionFactory();
		Session session=factory.openSession();
		Farmer farmer=session.load(Farmer.class,101);
		System.out.println(farmer);
	}

}
