package com.tcs1;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.criterion.Projections;
import org.hibernate.criterion.Projection;

import org.hibernate.criterion.Restrictions;

import com.mysql.cj.Query;

;

public class CriteroaExAllRows {
	public static void main(String args[])
	{
	Configuration cfg=new Configuration();
	cfg.configure();
	cfg.addAnnotatedClass(Farmer.class);
	SessionFactory factory=cfg.buildSessionFactory();
	//SessionFactory factory=cfg.buildSessionFactory();
	Session session=factory.openSession();
	//so basically hibernate critera api provide object oriented apporacb for querying the database  and getting the result 
	
	//below query is same as select * from table 
	
// suppose we want to used where claus then used below statement
	
	
	//Criteria criteria=session.createCriteria(Farmer.class);
	// suppose we want to used where claus then used below statement
	//where farmername is ganu
	//where farmermob is 34424
	//criteria.add(Restrictions.eq("FarmerMob", "34424"));//farmermob from entity class 
	//value of prorty
	
	 /*Projection projection=Projections.property("FarmerId");
	 criteria.setProjection(projection);
	//criteria.add(Restrictions.gt("FarmerName", "ganu"));//greater than
	criteria.add(Restrictions.eq("FarmerId", 101));
	List<Integer>listoffarmer=criteria.list();
	for (Integer f : listoffarmer) {
		System.out.println(f);
		
	}*/
	 /*Projection projection1=Projections.property("FarmerName");//using projection we selected column
	 criteria.setProjection(projection1);
	 criteria.add(Restrictions.eq("FarmerName", "ganu"));
	 List<String>listoffarmer1=criteria.list();
		for (String f : listoffarmer1) {
			System.out.println(f);
			
		}*/
	Query query=session.createQuery("from Farmer");
	List<Farmer>listoffarmer1=query.list();
	for (Farmer f : listoffarmer1) {
		System.out.println(f);
		
	}

}
}