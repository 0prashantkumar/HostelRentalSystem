package com.hostelrental.dao;

import java.security.acl.Owner;

import org.hibernate.Hibernate;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.hostelrental.pojos.Hostels;
import com.hostelrental.pojos.Owners;

@Repository
@Transactional
public class HostelDao {

	@Autowired
	private SessionFactory sf;
	
	public Hostels getAllHostel(int id) {
		Session session = sf.getCurrentSession();
		Hostels evaluation = session.get(Hostels.class, id);
		Hibernate.initialize(evaluation.getHostelOwnerId());
		return evaluation;
		//return sf.getCurrentSession().createQuery("select h from Hostels h").getResultList();
	}
	
	public Owners getOwner(int id) {
		Session session = sf.getCurrentSession();
		Owners evaluation = session.get(Owners.class, id);
		Hibernate.initialize(evaluation.getHostel());
		return evaluation;
	}
}
