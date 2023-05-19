package com.sacral.SacralTesting.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sacral.SacralTesting.repository.GitHubRepository;
import com.sacral.SacralTesting.model.GitHub;

@Service
public class GitHubService {

    @Autowired
    private GitHubRepository gitHubRepository;

    public List<GitHub> getAllGitHubData() {
        return gitHubRepository.findAll();
    }

    public Optional<GitHub> getGitHubByUsername(String username) {
        return gitHubRepository.findByUsername(username);
    }

    public Optional<GitHub> getGitHubByURL(String url) {
        return gitHubRepository.findByURL(url);
    }

    public Optional<GitHub> getGitHubByRepositoryName(String repositoryName) {
        return gitHubRepository.findByRepositoryName(repositoryName);
    }

    public Optional<GitHub> getGitHubByTitle(String title) {
        return gitHubRepository.findByTitle(title);
    }

    public Optional<GitHub> getGitHubByAction(String action) {
        return gitHubRepository.findByAction(action);
    }

    public GitHub addGitHubData(GitHub gitHub) {
        return gitHubRepository.save(gitHub);
    }

    public void deleteGitHubData(Long id) {
        gitHubRepository.deleteById(id);
    }

}