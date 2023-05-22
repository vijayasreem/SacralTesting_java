package com.sacral.SacralTesting.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sacral.SacralTesting.model.Registration;
import com.sacral.SacralTesting.repository.RegistrationRepository;

@Service
public class RegistrationService {
	
	@Autowired
	private RegistrationRepository registrationRepository;
	
	public Registration getUserByUserName(String userName) {
		return registrationRepository.findByUserName(userName);
	}
	
	public Registration getUserByEmail(String email) {
		return registrationRepository.findByEmail(email);
	}
	
	public List<Registration> getUsersByFirstNameAndLastName(String firstName, String lastName) {
		return registrationRepository.findByFirstNameAndLastName(firstName, lastName);
	}
	
	public List<Registration> getUsersByCompanyAndUKPostalCode(String company, String ukPostalCode) {
		return registrationRepository.findByCompanyAndUKPostalCode(company, ukPostalCode);
	}
	
	public List<Registration> getUsersByTelephoneNo(String telephoneNo) {
		return registrationRepository.findByTelephoneNo(telephoneNo);
	}

}