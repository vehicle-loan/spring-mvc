package com.lti.vehicleloan.service;

import com.lti.vehicleloan.entity.UserCredentials;
import com.lti.vehicleloan.entity.UserDocuments;
import com.lti.vehicleloan.entity.UserPersonalDetails;

public interface ApplicationFormServiceInterface {

	public void saveUserPersonalDetails(UserPersonalDetails userPersonalDetails);
	public void saveUserCredentials(UserCredentials userCredentials);
	public void saveUserDocuments(UserDocuments userDocuments);
}
