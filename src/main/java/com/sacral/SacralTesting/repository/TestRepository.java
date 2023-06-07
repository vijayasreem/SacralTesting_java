package com.sacral.SacralTesting.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.sacral.SacralTesting.model.Test;

@Repository
public interface TestRepository extends JpaRepository<Test, Long> {

  //This will generate a method to find a Test by its id 
  Test findById(Long id); 

  //This will generate a method to delete a Test by its id
  void deleteById(Long id);

  //This will generate a method to save a Test 
  Test save(Test test);

}