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
@Table(name="loan_details")

public class LoanDetails {
	
	@Id
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="SEQUENCE1")
	@SequenceGenerator(name="SEQUENCE1", sequenceName="loan_seq", allocationSize=1)
	@Column(name="LOAN_ID")
	 private int loanId;
	
	@Column(name="RATE_OF_INTEREST")
	private float rateOfInterest;
	
	@Column(name="LOAN_TENURE")
	private int loanTenure;
	
	@Column(name="LOAN_AMOUT")
	private double loanAmount;
	
	@OneToOne
	@JoinColumn(name="USER_ID")
	private UserPersonalDetails userPersonalDetails;

	public int getLoanId() {
		return loanId;
	}

	public void setLoanId(int loanId) {
		this.loanId = loanId;
	}

	public float getRateOfInterest() {
		return rateOfInterest;
	}

	public void setRateOfInterest(float rateOfInterest) {
		this.rateOfInterest = rateOfInterest;
	}

	public int getLoanTenure() {
		return loanTenure;
	}

	public void setLoanTenure(int loanTenure) {
		this.loanTenure = loanTenure;
	}

	public double getLoanAmount() {
		return loanAmount;
	}

	public void setLoanAmount(double loanAmount) {
		this.loanAmount = loanAmount;
	}

	public UserPersonalDetails getUserPersonalDetails() {
		return userPersonalDetails;
	}

	public void setUserPersonalDetails(UserPersonalDetails userPersonalDetails) {
		this.userPersonalDetails = userPersonalDetails;
	}
	
	
	
	

}
