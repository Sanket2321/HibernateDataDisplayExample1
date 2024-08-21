package com.tcs1;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class ClientSelect {
	public static void main(String args[])
	{
		Configuration cfg=new Configuration();
		cfg.configure();
		cfg.addAnnotatedClass(Farmer.class);
		SessionFactory factory=cfg.buildSessionFactory();
		//SessionFactory factory=cfg.buildSessionFactory();
		Session session=factory.openSession();
		//Farmer farmer=session.load(Farmer.class,101);
		Farmer farmer=new Farmer(107,"Ganu","34342423","pinu");
System.out.println(farmer);
//System.out.println(farmer);
	}

}
