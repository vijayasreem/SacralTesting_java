package com.sacral.SacralTesting.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.sacral.SacralTesting.model.Branches;
import com.sacral.SacralTesting.service.BranchesService;

@RestController
@RequestMapping("/branches")
public class BranchesController {

    @Autowired
    private BranchesService branchesService;

    @GetMapping("/findByWholesalerAndWholesalerActiveAndBranchAndBranchActive")
    public Branches findByWholesalerAndWholesalerActiveAndBranchAndBranchActive(@RequestParam("wholesaler") String wholesaler,
            @RequestParam("wholesalerActive") Boolean wholesalerActive, @RequestParam("branch") String branch,
            @RequestParam("branchActive") Boolean branchActive) {
        return branchesService.findByWholesalerAndWholesalerActiveAndBranchAndBranchActive(wholesaler, wholesalerActive, branch,
                branchActive);
    }

    @GetMapping("/findByWholesalerActiveAndBranchActiveOrderByWholesalerAsc")
    public List<Branches> findByWholesalerActiveAndBranchActiveOrderByWholesalerAsc(
            @RequestParam("wholesalerActive") Boolean wholesalerActive, @RequestParam("branchActive") Boolean branchActive) {
        return branchesService.findByWholesalerActiveAndBranchActiveOrderByWholesalerAsc(wholesalerActive, branchActive);
    }

    @GetMapping("/findByWholesalerActiveOrderByWholesalerAsc")
    public List<Branches> findByWholesalerActiveOrderByWholesalerAsc(
            @RequestParam("wholesalerActive") Boolean wholesalerActive) {
        return branchesService.findByWholesalerActiveOrderByWholesalerAsc(wholesalerActive);
    }

    @GetMapping("/deleteByWholesalerAndWholesalerActiveAndBranchAndBranchActive")
    public void deleteByWholesalerAndWholesalerActiveAndBranchAndBranchActive(
            @RequestParam("wholesaler") String wholesaler, @RequestParam("wholesalerActive") Boolean wholesalerActive,
            @RequestParam("branch") String branch, @RequestParam("branchActive") Boolean branchActive) {
        branchesService.deleteByWholesalerAndWholesalerActiveAndBranchAndBranchActive(wholesaler, wholesalerActive, branch,
                branchActive);
    }

}