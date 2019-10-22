package com.lti.vehicleloan.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name="admin_details")
public class AdminDetails {

	@Id
	@GeneratedValue(strategy=GenerationType.SEQUENCE,
	generator = "ADMIN_ID")
	@SequenceGenerator(sequenceName= "ADMIN_ID",allocationSize=1,name="ADMIN_ID")	

	@Column(name="admin_id")
	private int adminId;

	@Column(name="admin_email")
	private String adminEmail;

	@Column(name="admin_password")
	private String adminPassword;

	@OneToOne
	@JoinColumn(name="user_id")
	private UserPersonalDetails userPersonalDetails;

	public int getAdminId() {
		return adminId;
	}

	public void setAdminId(int adminId) {
		this.adminId = adminId;
	}

	public String getAdminEmail() {
		return adminEmail;
	}

	public void setAdminEmail(String adminEmail) {
		this.adminEmail = adminEmail;
	}

	public String getAdminPassword() {
		return adminPassword;
	}

	public void setAdminPassword(String adminPassword) {
		this.adminPassword = adminPassword;
	}

	public UserPersonalDetails getUserPersonalDetails() {
		return userPersonalDetails;
	}

	public void setUserPersonalDetails(UserPersonalDetails userPersonalDetails) {
		this.userPersonalDetails = userPersonalDetails;
	}


}
