package com.sacral.SacralTesting.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sacral.SacralTesting.model.GitHubConfiguration;
import com.sacral.SacralTesting.repository.GitHubConfigurationRepository;

@Service
public class GitHubConfigurationService {
	
	@Autowired
	private GitHubConfigurationRepository gitHubConfigurationRepository;
	
	public GitHubConfiguration findByUsernameAndPasswordAndUrlAndRepositoryName(String username, String password, String url, String repositoryName) {
		return gitHubConfigurationRepository.findByUsernameAndPasswordAndUrlAndRepositoryName(username, password, url, repositoryName);
	}
	
	public GitHubConfiguration findByTitleAndUserNameAndUrl(String title, String userName, String url) {
		return gitHubConfigurationRepository.findByTitleAndUserNameAndUrl(title, userName, url);
	}
	
	public void deleteByTitleAndUserNameAndUrl(String title, String userName, String url) {
		gitHubConfigurationRepository.deleteByTitleAndUserNameAndUrl(title, userName, url);
	}
	
	public void deleteByUsernameAndPasswordAndUrlAndRepositoryName(String username, String password, String url, String repositoryName) {
		gitHubConfigurationRepository.deleteByUsernameAndPasswordAndUrlAndRepositoryName(username, password, url, repositoryName);
	}
	
}