package com.hostelrental.pojos;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name = "booking")
public class Bookings {

	private Integer bookingId;
	private Users user;
	private Hostels hostel;
	private Date bookingDate;
	private Date joiningDate;
	private String paymentStatus;
	private String bookingStatus;
	
	public Bookings() {
		System.out.println("In Booking Default Constructor");
	}

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "booking_id")
	public Integer getBookingId() {
		return bookingId;
	}

	public void setBookingId(Integer bookingId) {
		this.bookingId = bookingId;
	}

	@ManyToOne
	@JoinColumn(name = "user_id")
	public Users getUser() {
		return user;
	}

	public void setUser(Users user) {
		this.user = user;
	}

	@ManyToOne
	@JoinColumn(name = "hostel_id")
	public Hostels getHostel() {
		return hostel;
	}

	public void setHostel(Hostels hostel) {
		this.hostel = hostel;
	}

	@Temporal(TemporalType.DATE)
	@Column(name = "booking_date")
	public Date getBookingDate() {
		return bookingDate;
	}

	public void setBookingDate(Date bookingDate) {
		this.bookingDate = bookingDate;
	}

	@Temporal(TemporalType.DATE)
	@Column(name = "joining_date")
	public Date getJoiningDate() {
		return joiningDate;
	}

	public void setJoiningDate(Date joiningDate) {
		this.joiningDate = joiningDate;
	}

	@Column(name = "payment_status", length = 20)
	public String getPayment_status() {
		return paymentStatus;
	}

	public void setPayment_status(String payment_status) {
		this.paymentStatus = payment_status;
	}

	@Column(name = "booking_status")
	public String getBookingStatus() {
		return bookingStatus;
	}

	public void setBookingStatus(String bookingStatus) {
		this.bookingStatus = bookingStatus;
	}

	@Override
	public String toString() {
		return "Bookings [bookingId=" + bookingId + ", user_id=" + user + ", hostel_id=" + hostel
				+ ", booking_date=" + bookingDate + ", joining_date=" + joiningDate + ", payment_status="
				+ paymentStatus + ", booking_status=" + bookingStatus + "]";
	}
	
	
}
