package com.sacral.SacralTesting.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.sacral.SacralTesting.model.GitHubConfiguration;

public interface GitHubConfigurationRepository extends JpaRepository<GitHubConfiguration, Long> {
	
	GitHubConfiguration findByUsernameAndPasswordAndUrlAndRepositoryName(String username, String password, String url, String repositoryName);
	
	GitHubConfiguration findByTitleAndUserNameAndUrl(String title, String userName, String url);
	
	void deleteByTitleAndUserNameAndUrl(String title, String userName, String url);
	
	void deleteByUsernameAndPasswordAndUrlAndRepositoryName(String username, String password, String url, String repositoryName);
	
}