package com.tcs1;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.Query;
public class CriteriaExQuery {
	public static void main(String args[])
	{
	Configuration cfg=new Configuration();
	cfg.configure();
	cfg.addAnnotatedClass(Farmer.class);
	SessionFactory factory=cfg.buildSessionFactory();
	//SessionFactory factory=cfg.buildSessionFactory();
	Session session=factory.openSession();
	
	Query query=session.createQuery("from Farmer");
	List<Farmer>listoffarmer1=query.list();
	for (Farmer f : listoffarmer1) {
		System.out.println(f);
}   
	}
}

