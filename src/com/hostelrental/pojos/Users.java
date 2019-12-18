package com.hostelrental.pojos;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "users")
public class Users {

	private Integer userId;
	private String firstName;
	private String lastName;
	private String email;
	private String password;
	private int mobileNumber;
	private List<Bookings> booking = new ArrayList<Bookings>();
	private List<Visits> visit = new ArrayList<Visits>();
	
	public Users() {
		System.out.println("In User Default Constructor");
	}

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "user_id")
	public Integer getUserId() {
		return userId;
	}

	public void setUserId(Integer userId) {
		this.userId = userId;
	}

	@Column(name = "first_name", length = 20)
	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	@Column(name = "last_name", length = 20)
	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	@Column(length = 30, unique = true)
	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	@Column(name = "password", length = 20)
	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	@Column(name = "mobile_number", length = 10)
	public int getMobileNumber() {
		return mobileNumber;
	}

	public void setMobileNumber(int mobileNumber) {
		this.mobileNumber = mobileNumber;
	}
	
	@OneToMany(mappedBy = "user")
	public List<Bookings> getBooking() {
		return booking;
	}

	public void setBooking(List<Bookings> booking) {
		this.booking = booking;
	}
	
	@OneToMany(mappedBy = "user")
	public List<Visits> getVisit() {
		return visit;
	}

	public void setVisit(List<Visits> visit) {
		this.visit = visit;
	}

	@Override
	public String toString() {
		return "Users [userId=" + userId + ", firstName=" + firstName + ", lastName=" + lastName + ", email=" + email
				+ ", password=" + password + ", mobileNumber=" + mobileNumber + "]";
	}
	
	
}
