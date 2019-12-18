package com.hostelrental.dao;

import com.hostelrental.pojos.Users;

public interface IUserDao {
	Users validate(String email, String pass);
}
