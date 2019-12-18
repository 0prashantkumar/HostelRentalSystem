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
@Table(name = "hostel_owner")
public class Owners {

	private Integer ownerId;
	private String firstName;
	private String lastName;
	private String email;
	private String password;
	private String address;
	private int contactNumber;
	private List<Hostels> hostel = new ArrayList<Hostels>();
	
	public Owners() {
		System.out.println("In Owner Default Constructor");
	}

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "owner_id")
	public Integer getOwnerId() {
		return ownerId;
	}

	public void setOwnerId(Integer ownerId) {
		this.ownerId = ownerId;
	}

	@Column(name = "first_name", length = 15)
	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	@Column(name = "last_name", length = 15)
	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	@Column(name = "email", length = 30, unique = true)
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

	@Column(name = "address", length = 100)
	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	@Column(name = "contact_no", length = 10)
	public int getContactNumber() {
		return contactNumber;
	}

	public void setContactNumber(int contactNumber) {
		this.contactNumber = contactNumber;
	}

	@OneToMany(mappedBy = "hostelOwnerId")
	public List<Hostels> getHostel() {
		return hostel;
	}

	public void setHostel(List<Hostels> hostel) {
		this.hostel = hostel;
	}

	@Override
	public String toString() {
		return "Owners [ownerId=" + ownerId + ", firstName=" + firstName + ", lastName=" + lastName + ", email=" + email
				+ ", password=" + password + ", address=" + address + ", contactNumber=" + contactNumber + ", hostel="
				+ hostel + "]";
	}
	
	
}
