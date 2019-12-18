package com.hostelrental.pojos;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "hostel_details")
public class Hostels {
	
	private Integer hostelId;
	private Owners hostelOwnerId;
	private String name;
	private String area;
	private String landmark;
	private String city;
	private int pincode;
	private String status;
	private String caretakerName;
	private int caretakerContact;
	private boolean food;
	private boolean laundary;
	private boolean wifi;
	private boolean parking;
	private boolean fullyFurnished;
	private boolean studyRoom;
	private boolean hotWater;
	private int oneSharing;
	private int twoSharing;
	private int threeSharing;
	private int fourSharing;
	private List<Bookings> booking = new ArrayList<Bookings>();
	private List<Visits> visit = new ArrayList<Visits>();
	
	public Hostels() {
		System.out.println("In Hostel Default Constructor");
	}

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "hostel_id")
	public Integer getHostelId() {
		return hostelId;
	}

	public void setHostelId(Integer hostelId) {
		this.hostelId = hostelId;
	}

	@ManyToOne
	@JoinColumn(name = "hostel_owner_id")
	public Owners getHostelOwnerId() {
		return hostelOwnerId;
	}

	public void setHostelOwnerId(Owners hostelOwnerId) {
		this.hostelOwnerId = hostelOwnerId;
	}

	@Column(name = "name", length = 30)
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Column(name = "area", length = 20)
	public String getArea() {
		return area;
	}

	public void setArea(String area) {
		this.area = area;
	}

	@Column(name = "landmark", length = 20)
	public String getLandmark() {
		return landmark;
	}

	public void setLandmark(String landmark) {
		this.landmark = landmark;
	}

	@Column(name = "city", length = 20)
	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	@Column(name = "pin_code")
	public int getPincode() {
		return pincode;
	}

	public void setPincode(int pincode) {
		this.pincode = pincode;
	}

	@Column(name = "status", length = 20)
	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	@Column(name = "caretaker_name", length = 20)
	public String getCaretakerName() {
		return caretakerName;
	}

	public void setCaretakerName(String caretakerName) {
		this.caretakerName = caretakerName;
	}

	@Column(name = "caretaker_contact")
	public int getCaretakerContact() {
		return caretakerContact;
	}

	public void setCaretakerContact(int caretakerContact) {
		this.caretakerContact = caretakerContact;
	}

	@Column(name = "food")
	public boolean isFood() {
		return food;
	}

	public void setFood(boolean food) {
		this.food = food;
	}

	@Column(name = "laundary")
	public boolean isLaundary() {
		return laundary;
	}

	public void setLaundary(boolean laundary) {
		this.laundary = laundary;
	}

	@Column(name = "wifi")
	public boolean isWifi() {
		return wifi;
	}

	public void setWifi(boolean wifi) {
		this.wifi = wifi;
	}

	@Column(name = "parking")
	public boolean isParking() {
		return parking;
	}

	public void setParking(boolean parking) {
		this.parking = parking;
	}

	@Column(name = "fully_furnished")
	public boolean isFullyFurnished() {
		return fullyFurnished;
	}

	public void setFullyFurnished(boolean fullyFurnished) {
		this.fullyFurnished = fullyFurnished;
	}

	@Column(name = "study_room")
	public boolean isStudyRoom() {
		return studyRoom;
	}

	public void setStudyRoom(boolean studyRoom) {
		this.studyRoom = studyRoom;
	}

	@Column(name = "hot_water")
	public boolean isHotWater() {
		return hotWater;
	}

	public void setHotWater(boolean hotWater) {
		this.hotWater = hotWater;
	}

	@Column(name = "one_sharing", nullable = true)
	public int getOneSharing() {
		return oneSharing;
	}

	public void setOneSharing(int oneSharing) {
		this.oneSharing = oneSharing;
	}

	@Column(name = "two_sharing", nullable = true)
	public int getTwoSharing() {
		return twoSharing;
	}

	public void setTwoSharing(int twoSharing) {
		this.twoSharing = twoSharing;
	}

	@Column(name = "three_sharing", nullable = true)
	public int getThreeSharing() {
		return threeSharing;
	}

	public void setThreeSharing(int threeSharing) {
		this.threeSharing = threeSharing;
	}

	@Column(name = "four_sharing", nullable = true)
	public int getFourSharing() {
		return fourSharing;
	}

	public void setFourSharing(int fourSharing) {
		this.fourSharing = fourSharing;
	}

	@OneToMany(mappedBy = "hostel")
	public List<Bookings> getBooking() {
		return booking;
	}

	public void setBooking(List<Bookings> booking) {
		this.booking = booking;
	}
	
	@OneToMany(mappedBy = "hostel")
	public List<Visits> getVisit() {
		return visit;
	}

	public void setVisit(List<Visits> visit) {
		this.visit = visit;
	}

	@Override
	public String toString() {
		return "Hostels [hostelId=" + hostelId + ", hostelOwnerId=" + hostelOwnerId + ", name=" + name + ", area="
				+ area + ", landmark=" + landmark + ", city=" + city + ", pincode=" + pincode + ", status=" + status
				+ ", caretakerName=" + caretakerName + ", caretakerContact=" + caretakerContact + ", food=" + food
				+ ", laundary=" + laundary + ", wifi=" + wifi + ", parking=" + parking + ", fullyFurnished="
				+ fullyFurnished + ", studyRoom=" + studyRoom + ", hotWater=" + hotWater + ", oneSharing=" + oneSharing
				+ ", twoSharing=" + twoSharing + ", threeSharing=" + threeSharing + ", fourSharing=" + fourSharing
				+ "]";
	}
	
	
}
