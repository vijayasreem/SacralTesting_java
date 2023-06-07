package com.sacral.SacralTesting.controller;

import java.time.LocalDateTime;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.sacral.SacralTesting.model.TestTestUserStory;
import com.sacral.SacralTesting.service.TestTestUserStoryService;

@RestController
public class TestTestUserStoryController {
    
    @Autowired
    private TestTestUserStoryService userStoryService;
    
    @GetMapping("/userstory/name")
    public List<TestTestUserStory> findByName(@RequestParam String name){
        return userStoryService.findByName(name);
    }
    
    @GetMapping("/userstory/description")
    public List<TestTestUserStory> findByDescription(@RequestParam String description){
        return userStoryService.findByDescription(description);
    }
    
    @GetMapping("/userstory/status")
    public List<TestTestUserStory> findByStatus(@RequestParam String status){
        return userStoryService.findByStatus(status);
    }
    
    @GetMapping("/userstory/priority")
    public List<TestTestUserStory> findByPriority(@RequestParam String priority){
        return userStoryService.findByPriority(priority);
    }
    
    @GetMapping("/userstory/createdby")
    public List<TestTestUserStory> findByCreatedBy(@RequestParam String createdBy){
        return userStoryService.findByCreatedBy(createdBy);
    }
    
    @GetMapping("/userstory/createdon")
    public List<TestTestUserStory> findByCreatedOn(@RequestParam LocalDateTime createdOn){
        return userStoryService.findByCreatedOn(createdOn);
    }
    
    @GetMapping("/userstory/updatedby")
    public List<TestTestUserStory> findByUpdatedBy(@RequestParam String updatedBy){
        return userStoryService.findByUpdatedBy(updatedBy);
    }
    
    @GetMapping("/userstory/updatedon")
    public List<TestTestUserStory> findByUpdatedOn(@RequestParam LocalDateTime updatedOn){
        return userStoryService.findByUpdatedOn(updatedOn);
    }

}