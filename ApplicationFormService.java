package com.lti.vehicleloan.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lti.vehicleloan.dao.GenericDao;
import com.lti.vehicleloan.entity.UserCredentials;
import com.lti.vehicleloan.entity.UserDocuments;
import com.lti.vehicleloan.entity.UserPersonalDetails;


@Service
public class ApplicationFormService implements ApplicationFormServiceInterface {
	
	@Autowired
	private GenericDao genericDao;
	
	public void saveUserPersonalDetails(UserPersonalDetails userPersonalDetails) {
		genericDao.upsert(userPersonalDetails);
		
	}
	
	public void saveUserCredentials(UserCredentials userCredentials) {
		genericDao.upsert(userCredentials);
		
	}

	public void saveUserDocuments(UserDocuments userDocuments) {
		genericDao.upsert(userDocuments);
		
	}
}
