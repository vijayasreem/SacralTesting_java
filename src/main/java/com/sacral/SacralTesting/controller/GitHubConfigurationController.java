package com.sacral.SacralTesting.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sacral.SacralTesting.model.GitHubConfiguration;
import com.sacral.SacralTesting.service.GitHubConfigurationService;

@RestController
@RequestMapping("/api")
public class GitHubConfigurationController {
	
	@Autowired
	private GitHubConfigurationService gitHubConfigurationService;
	
	@PostMapping("/configuration/findByUsernameAndPasswordAndUrlAndRepositoryName/{username}/{password}/{url}/{repositoryName}")
	public GitHubConfiguration findByUsernameAndPasswordAndUrlAndRepositoryName(@PathVariable String username, @PathVariable String password, @PathVariable String url, @PathVariable String repositoryName) {
		return gitHubConfigurationService.findByUsernameAndPasswordAndUrlAndRepositoryName(username, password, url, repositoryName);
	}
	
	@PostMapping("/configuration/findByTitleAndUserNameAndUrl/{title}/{userName}/{url}")
	public GitHubConfiguration findByTitleAndUserNameAndUrl(@PathVariable String title, @PathVariable String userName, @PathVariable String url) {
		return gitHubConfigurationService.findByTitleAndUserNameAndUrl(title, userName, url);
	}
	
	@DeleteMapping("/configuration/deleteByTitleAndUserNameAndUrl/{title}/{userName}/{url}")
	public void deleteByTitleAndUserNameAndUrl(@PathVariable String title, @PathVariable String userName, @PathVariable String url) {
		gitHubConfigurationService.deleteByTitleAndUserNameAndUrl(title, userName, url);
	}
	
	@DeleteMapping("/configuration/deleteByUsernameAndPasswordAndUrlAndRepositoryName/{username}/{password}/{url}/{repositoryName}")
	public void deleteByUsernameAndPasswordAndUrlAndRepositoryName(@PathVariable String username, @PathVariable String password, @PathVariable String url, @PathVariable String repositoryName) {
		gitHubConfigurationService.deleteByUsernameAndPasswordAndUrlAndRepositoryName(username, password, url, repositoryName);
	}
	
}