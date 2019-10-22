package com.lti.vehicleloan.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="USER_CREDENTIALS")
public class UserCredentials {
	
	@OneToOne
	@JoinColumn(name="USER_ID")
	private UserPersonalDetails userPersonalDetails;
	
	@Id
	@Column(name="EMAIL")
	private String email;
	
	@Column(name="PASSWORD")
	private String password;


	

	public UserPersonalDetails getUserPersonalDetails() {
		return userPersonalDetails;
	}

	public void setUserPersonalDetails(UserPersonalDetails userPersonalDetails) {
		this.userPersonalDetails = userPersonalDetails;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
	
	
}
