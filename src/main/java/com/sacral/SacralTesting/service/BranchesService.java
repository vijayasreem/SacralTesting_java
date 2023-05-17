package com.sacral.SacralTesting.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sacral.SacralTesting.model.Branches;
import com.sacral.SacralTesting.repository.BranchesRepository;

@Service
public class BranchesService {
    
    @Autowired
    private BranchesRepository branchesRepository;
    
    public Branches findByWholesalerAndWholesalerActiveAndBranchAndBranchActive(String wholesaler, Boolean wholesalerActive, String branch, Boolean branchActive) {
        return branchesRepository.findByWholesalerAndWholesalerActiveAndBranchAndBranchActive(wholesaler, wholesalerActive, branch, branchActive);
    }
    
    public List<Branches> findByWholesalerActiveAndBranchActiveOrderByWholesalerAsc(Boolean wholesalerActive, Boolean branchActive) {
        return branchesRepository.findByWholesalerActiveAndBranchActiveOrderByWholesalerAsc(wholesalerActive, branchActive);
    }
    
    public List<Branches> findByWholesalerActiveOrderByWholesalerAsc(Boolean wholesalerActive) {
        return branchesRepository.findByWholesalerActiveOrderByWholesalerAsc(wholesalerActive);
    }
    
    public void deleteByWholesalerAndWholesalerActiveAndBranchAndBranchActive(String wholesaler, Boolean wholesalerActive, String branch, Boolean branchActive) {
        branchesRepository.deleteByWholesalerAndWholesalerActiveAndBranchAndBranchActive(wholesaler, wholesalerActive, branch, branchActive);
    }
}