package com.sacral.SacralTesting.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sacral.SacralTesting.model.Test;
import com.sacral.SacralTesting.service.TestService;

@RestController
@RequestMapping("/tests")
public class TestController {
    
    @Autowired
    private TestService testService;
    
    @GetMapping("/{id}")
    public Test getTestById(@PathVariable Long id) {
        return testService.getTestById(id);
    }
    
    @DeleteMapping("/{id}")
    public void deleteTest(@PathVariable Long id) {
        testService.deleteTest(id);
    }
    
    @PostMapping
    public Test saveTest(@RequestBody Test test) {
        return testService.saveTest(test);
    }
    
    @GetMapping
    public List<Test> getAllTests(){
        return testService.getAllTests();
    }
}