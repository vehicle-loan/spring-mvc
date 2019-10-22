package com.lti.vehicleloan.entity;

import java.sql.Blob;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.JoinColumn;
import javax.persistence.Lob;
import javax.persistence.OneToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name="USER_DOCUMENTS")
public class UserDocuments {

	@Id
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="SEQUENCE1")
	@SequenceGenerator(name="SEQUENCE1", sequenceName="user_docs_seq", allocationSize=1)
	@Column(name="docs_id")
	private int docsId;
	
	@Column(name="aadhar_card")
	@Lob
	private byte[] aadhaarCard;
	
	@Column(name="pan_card")
	@Lob
	private byte[]   panCard;
	
	@Column(name="salary_slip")
	@Lob
	private byte[]  salarySlip;
	
	@Column(name="bank_details")
	@Lob
	private byte[]    bankDetails;
	
	@OneToOne
	@JoinColumn(name="user_id")
	private UserPersonalDetails userPersonalDetails;

	public int getDocsId() {
		return docsId;
	}

	public void setDocsId(int docsId) {
		this.docsId = docsId;
	}

	public byte[] getAadhaarCard() {
		return aadhaarCard;
	}

	public void setAadhaarCard(byte[] aadhaarCard) {
		this.aadhaarCard = aadhaarCard;
	}

	public byte[] getPanCard() {
		return panCard;
	}

	public void setPanCard(byte[] panCard) {
		this.panCard = panCard;
	}

	public byte[] getSalarySlip() {
		return salarySlip;
	}

	public void setSalarySlip(byte[] salarySlip) {
		this.salarySlip = salarySlip;
	}

	public byte[] getBankDetails() {
		return bankDetails;
	}

	public void setBankDetails(byte[] bankDetails) {
		this.bankDetails = bankDetails;
	}

	public UserPersonalDetails getUserPersonalDetails() {
		return userPersonalDetails;
	}

	public void setUserPersonalDetails(UserPersonalDetails userPersonalDetails) {
		this.userPersonalDetails = userPersonalDetails;
	}


	
}
