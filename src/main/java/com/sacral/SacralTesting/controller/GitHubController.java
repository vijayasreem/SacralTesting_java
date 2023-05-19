package com.sacral.SacralTesting.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sacral.SacralTesting.model.GitHub;
import com.sacral.SacralTesting.service.GitHubService;

@RestController
@RequestMapping("/github")
public class GitHubController {

    @Autowired
    private GitHubService gitHubService;

    @GetMapping("/")
    public List<GitHub> getAllGitHubData() {
        return gitHubService.getAllGitHubData();
    }

    @GetMapping("/username/{username}")
    public Optional<GitHub> getGitHubByUsername(@PathVariable String username) {
        return gitHubService.getGitHubByUsername(username);
    }

    @GetMapping("/url/{url}")
    public Optional<GitHub> getGitHubByURL(@PathVariable String url) {
        return gitHubService.getGitHubByURL(url);
    }

    @GetMapping("/repositoryname/{repositoryName}")
    public Optional<GitHub> getGitHubByRepositoryName(@PathVariable String repositoryName) {
        return gitHubService.getGitHubByRepositoryName(repositoryName);
    }

    @GetMapping("/title/{title}")
    public Optional<GitHub> getGitHubByTitle(@PathVariable String title) {
        return gitHubService.getGitHubByTitle(title);
    }

    @GetMapping("/action/{action}")
    public Optional<GitHub> getGitHubByAction(@PathVariable String action) {
        return gitHubService.getGitHubByAction(action);
    }

    @PostMapping("/")
    public GitHub addGitHubData(@RequestBody GitHub gitHub) {
        return gitHubService.addGitHubData(gitHub);
    }

    @DeleteMapping("/{id}")
    public void deleteGitHubData(@PathVariable Long id) {
        gitHubService.deleteGitHubData(id);
    }

}