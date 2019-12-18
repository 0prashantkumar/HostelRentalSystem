package com.hostelrental.dao;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.hostelrental.pojos.Users;

@Repository
@Transactional
public class UserDaoImpl implements IUserDao {

	@Autowired
	private SessionFactory sf;
	
	@Override
	public Users validate(String email, String pass) {
		String jpql = "select u from Users u where email = :em and password = :pas";
		return sf.getCurrentSession().createQuery(jpql, Users.class)
				.setParameter("em", email).setParameter("pas", pass).getSingleResult();
	}

}
