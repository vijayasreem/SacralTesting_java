package com.sacral.SacralTesting.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface GitHubRepository extends JpaRepository<GitHub, Long> {

    @Query("SELECT g FROM GitHub g WHERE g.username=:username")
    GitHub findByUsername(String username);

    @Query("SELECT g FROM GitHub g WHERE g.url=:url")
    GitHub findByURL(String url);

    @Query("SELECT g FROM GitHub g WHERE g.repositoryName=:repositoryName")
    GitHub findByRepositoryName(String repositoryName);

    @Query("SELECT g FROM GitHub g WHERE g.title=:title")
    GitHub findByTitle(String title);

    @Query("SELECT g FROM GitHub g WHERE g.action=:action")
    GitHub findByAction(String action);

}