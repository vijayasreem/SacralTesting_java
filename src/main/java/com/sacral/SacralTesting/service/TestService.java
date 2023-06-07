package com.sacral.SacralTesting.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sacral.SacralTesting.model.Test;
import com.sacral.SacralTesting.repository.TestRepository;

@Service
public class TestService {
    
    @Autowired
    private TestRepository testRepository;
    
    public Test getTestById(Long id) {
        return testRepository.findById(id);
    }
    
    public void deleteTest(Long id) {
        testRepository.deleteById(id);
    }
    
    public Test saveTest(Test test) {
        return testRepository.save(test);
    }
    
    public List<Test> getAllTests(){
        return testRepository.findAll();
    }
}