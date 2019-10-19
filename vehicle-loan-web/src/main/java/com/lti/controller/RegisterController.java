package com.lti.controller;


import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.lti.vehicleloan.entity.UserPersonalDetails;
import com.lti.vehicleloan.service.RegisterService;

@Controller
public class RegisterController {

	@Autowired
	private RegisterService registerService;
	
	@RequestMapping(path="/register.lti",method=RequestMethod.POST)
	public String register (UserPersonalDetails userPersonalDetails,Map Model) {
		System.out.println(userPersonalDetails.getName());
		registerService.register(userPersonalDetails);
		return "success.jsp";
	}
	
}
