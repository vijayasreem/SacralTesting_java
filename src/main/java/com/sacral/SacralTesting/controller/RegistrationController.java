package com.sacral.SacralTesting.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sacral.SacralTesting.model.Registration;
import com.sacral.SacralTesting.service.RegistrationService;

@RestController
@RequestMapping("/registration")
public class RegistrationController {
	
	@Autowired
	private RegistrationService registrationService;
	
	@GetMapping("/userName/{userName}")
	public Registration getUserByUserName(@PathVariable String userName) {
		return registrationService.getUserByUserName(userName);
	}
	
	@GetMapping("/email/{email}")
	public Registration getUserByEmail(@PathVariable String email) {
		return registrationService.getUserByEmail(email);
	}
	
	@GetMapping("/firstName/{firstName}/lastName/{lastName}")
	public List<Registration> getUsersByFirstNameAndLastName(@PathVariable String firstName, @PathVariable String lastName) {
		return registrationService.getUsersByFirstNameAndLastName(firstName, lastName);
	}
	
	@GetMapping("/company/{company}/ukPostalCode/{ukPostalCode}")
	public List<Registration> getUsersByCompanyAndUKPostalCode(@PathVariable String company, @PathVariable String ukPostalCode) {
		return registrationService.getUsersByCompanyAndUKPostalCode(company, ukPostalCode);
	}
	
	@GetMapping("/telephoneNo/{telephoneNo}")
	public List<Registration> getUsersByTelephoneNo(@PathVariable String telephoneNo) {
		return registrationService.getUsersByTelephoneNo(telephoneNo);
	}

}