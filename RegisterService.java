package com.lti.vehicleloan.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lti.vehicleloan.dao.GenericDao;
import com.lti.vehicleloan.entity.UserPersonalDetails;

@Service
public class RegisterService implements RegisterServiceInterface{

	@Autowired
	private GenericDao genericDao;
	
	public void register(UserPersonalDetails userPersonalDetails) {
		genericDao.upsert(userPersonalDetails);
	}
	
}
