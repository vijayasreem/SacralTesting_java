package com.sacral.SacralTesting.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.sacral.SacralTesting.model.Branches;

public interface BranchesRepository extends JpaRepository<Branches, Long> {
    
    Branches findByWholesalerAndWholesalerActiveAndBranchAndBranchActive(String wholesaler, Boolean wholesalerActive, String branch, Boolean branchActive);

    List<Branches> findByWholesalerActiveAndBranchActiveOrderByWholesalerAsc(Boolean wholesalerActive, Boolean branchActive);

    List<Branches> findByWholesalerActiveOrderByWholesalerAsc(Boolean wholesalerActive);

    void deleteByWholesalerAndWholesalerActiveAndBranchAndBranchActive(String wholesaler, Boolean wholesalerActive, String branch, Boolean branchActive);
}