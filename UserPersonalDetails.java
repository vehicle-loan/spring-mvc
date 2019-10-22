package com.lti.vehicleloan.entity;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name="USER_PERSONAL_DETAILS")
public class UserPersonalDetails {

	@Id
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="SEQUENCE1")
	@SequenceGenerator(name="SEQUENCE1", sequenceName="user_seq", allocationSize=1)
	@Column(name="USER_ID")
	private int userId;

	@Column(name="NAME")
	private String name;

	@Column(name="GENDER")
	//	@Enumerated(EnumType.STRING)
	private String gender;

	@Column(name="AGE")
	private int age;

	@Column(name="TYPE_OF_EMPLOYMENT")
	//@Enumerated(EnumType.STRING)
	private String typeOfEmployement;

	@Column(name="YEARLY_SALARY")
	private double yearlySalary; 

	@Column(name="EXISTING_EMI")
	private double existingEmi;
	
	@Column(name="Mobile_Number")
	private String mobileNumber;

	@OneToOne(cascade = CascadeType.ALL,mappedBy="userPersonalDetails")
	private UserCredentials userCredentials;

	@OneToOne(mappedBy="userPersonalDetails",cascade= CascadeType.ALL)
	private UserDocuments userDocuments;
	
	public String getMobileNumber() {
		return mobileNumber;
	}

	public void setMobileNumber(String mobileNumber) {
		this.mobileNumber = mobileNumber;
	}

	public UserDocuments getUserDocuments() {
		return userDocuments;
	}

	public void setUserDocuments(UserDocuments userDocuments) {
		this.userDocuments = userDocuments;
	}

	
	public int getUserId() {
		return userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getTypeOfEmployement() {
		return typeOfEmployement;
	}

	public void setTypeOfEmployement(String typeOfEmployement) {
		this.typeOfEmployement = typeOfEmployement;
	}

	public double getYearlySalary() {
		return yearlySalary;
	}

	public void setYearlySalary(double yearlySalary) {
		this.yearlySalary = yearlySalary;
	}

	public double getExistingEmi() {
		return existingEmi;
	}

	public void setExistingEmi(double existingEmi) {
		this.existingEmi = existingEmi;
	}


	public UserCredentials getUserCredentials() {
		return userCredentials;
	}

	public void setUserCredentials(UserCredentials userCredentials) {
		this.userCredentials = userCredentials;
	}
	 
}
