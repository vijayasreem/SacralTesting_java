package com.sacral.SacralTesting.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.sacral.SacralTesting.model.User;
import com.sacral.SacralTesting.service.UpdateUsersController2ManagementService;

@RestController
@RequestMapping("/updateUsersController2")
public class UpdateUsersController2ManagementController {

	@Autowired
	UpdateUsersController2ManagementService updateUsersController2ManagementService;

	@GetMapping("/findById")
	public User findById(@RequestParam long id) {
		return updateUsersController2ManagementService.findById(id);
	}

	@PostMapping("/save")
	public User save(@RequestBody User user) {
		return updateUsersController2ManagementService.save(user);
	}

	@PostMapping("/deleteById")
	public void deleteById(@RequestParam long id) {
		updateUsersController2ManagementService.deleteById(id);
	}

	@GetMapping("/existsById")
	public boolean existsById(@RequestParam long id) {
		return updateUsersController2ManagementService.existsById(id);
	}

	@PostMapping("/updateUserInfo")
	public User updateUserInfo(@RequestBody User user) {
		return updateUsersController2ManagementService.updateUserInfo(user);
	}

	@PostMapping("/checkUserId")
	public boolean checkUserId(@RequestBody User user) {
		return updateUsersController2ManagementService.checkUserId(user);
	}

	@PostMapping("/checkPassword")
	public boolean checkPassword(@RequestBody User user) {
		return updateUsersController2ManagementService.checkPassword(user);
	}

	@PostMapping("/checkUsername")
	public boolean checkUsername(@RequestBody User user) {
		return updateUsersController2ManagementService.checkUsername(user);
	}

	@PostMapping("/checkEmail")
	public boolean checkEmail(@RequestBody User user) {
		return updateUsersController2ManagementService.checkEmail(user);
	}

	@PostMapping("/checkParentType")
	public boolean checkParentType(@RequestBody User user) {
		return updateUsersController2ManagementService.checkParentType(user);
	}

	@PostMapping("/checkLevel")
	public boolean checkLevel(@RequestBody User user) {
		return updateUsersController2ManagementService.checkLevel(user);
	}

	@PostMapping("/clearFields")
	public void clearFields(@RequestBody User user) {
		updateUsersController2ManagementService.clearFields(user);
	}

}