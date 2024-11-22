package com.sid.utility;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.sid.entity.Address;
import com.sid.entity.Person;
import com.sid.entity.VotingCard;

public class Utility {

	public static Session sessionObj() {

		Configuration cfg = new Configuration();
		cfg.configure();
		cfg.addAnnotatedClass(Person.class);
		cfg.addAnnotatedClass(VotingCard.class);
		cfg.addAnnotatedClass(Address.class);
		SessionFactory factory = cfg.buildSessionFactory();
		Session session = factory.openSession();
		return session;

	}

}
