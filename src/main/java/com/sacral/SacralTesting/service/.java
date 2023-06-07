package com.sacral.SacralTesting.service;

import com.sacral.SacralTesting.model.TestTestUserStory;

import java.time.LocalDateTime;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TestTestUserStoryService {

    List<TestTestUserStory> findByName(String name);
    List<TestTestUserStory> findByDescription(String description);
    List<TestTestUserStory> findByStatus(String status);
    List<TestTestUserStory> findByPriority(String priority);
    List<TestTestUserStory> findByCreatedBy(String createdBy);
    List<TestTestUserStory> findByCreatedOn(LocalDateTime createdOn);
    List<TestTestUserStory> findByUpdatedBy(String updatedBy);
    List<TestTestUserStory> findByUpdatedOn(LocalDateTime updatedOn);

}