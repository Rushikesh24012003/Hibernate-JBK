package com.jbk;

import java.io.Serializable;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class ArtistDao {
	
	private Session session;
	
	Session getSession() {
		Configuration cfg = new Configuration().configure();
		cfg.addAnnotatedClass(Artist.class);
		SessionFactory factory = cfg.buildSessionFactory();
		session= factory.openSession();
		return session;
	}
	
	public void insertArtist(Artist artist) {
		session =getSession();
		session.saveOrUpdate(artist);
		session.beginTransaction().commit();
		System.out.println("Artist data inserted successfully!!");
	}
}
