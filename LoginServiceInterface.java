package com.lti.vehicleloan.service;

import com.lti.vehicleloan.entity.UserCredentials;
import com.lti.vehicleloan.exception.DataNotFoundException;

public interface LoginServiceInterface {

	public boolean login(UserCredentials userCredentials) throws DataNotFoundException ;
}
