package com.lti.vehicleloan.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lti.vehicleloan.dao.GenericDao;
import com.lti.vehicleloan.entity.UserCredentials;
import com.lti.vehicleloan.exception.DataNotFoundException;


@Service
public class LoginService  implements LoginServiceInterface{

	@Autowired
	private GenericDao genericDao;

	public boolean login(UserCredentials userCredentials) throws DataNotFoundException {

		UserCredentials registeresUser =(UserCredentials) genericDao.fetchById(UserCredentials.class, userCredentials.getEmail());
		try {
			if(registeresUser.getPassword().equals(userCredentials.getPassword())) {			
				return true;
			}
			else
				return false;
		}
		catch(Exception dataNotFoundException) {
			throw new DataNotFoundException("Invalid User");
		}
	}

}

