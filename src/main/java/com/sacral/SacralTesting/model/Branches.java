package com.sacral.SacralTesting.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "branches")
public class Branches {
    
    @Id
    private Long id;
    
    private String wholesaler;
    private Boolean wholesalerActive;
    private String branch;
    private Boolean branchActive;
    
    public Long getId(){
        return id;
    } 
    
    public void setId(Long id){
        this.id = id;
    }
    
    public String getWholesaler(){
        return wholesaler;
    } 
    
    public void setWholesaler(String wholesaler){
        this.wholesaler = wholesaler;
    }
    
    public Boolean getWholesalerActive(){
        return wholesalerActive;
    } 
    
    public void setWholesalerActive(Boolean wholesalerActive){
        this.wholesalerActive = wholesalerActive;
    }
    
    public String getBranch(){
        return branch;
    } 
    
    public void setBranch(String branch){
        this.branch = branch;
    }
    
    public Boolean getBranchActive(){
        return branchActive;
    } 
    
    public void setBranchActive(Boolean branchActive){
        this.branchActive = branchActive;
    }
    
}