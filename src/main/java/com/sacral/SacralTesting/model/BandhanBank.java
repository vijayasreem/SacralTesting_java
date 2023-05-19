package com.sacral.SacralTesting.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class BandhanBank {
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    
    private String mobileNumber;
    
    private int crifScore;
    
    private int annualIncome;
    
    private String dob;
    
    private String spouseData;
    
    private int tenure;
    
    private int sumAssured;
    
    private String coi;
    
    private String tableauFeed;
    
    private String ekycCkyc;
    
    private int minSumAssured;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getMobileNumber() {
        return mobileNumber;
    }

    public void setMobileNumber(String mobileNumber) {
        this.mobileNumber = mobileNumber;
    }

    public int getCrifScore() {
        return crifScore;
    }

    public void setCrifScore(int crifScore) {
        this.crifScore = crifScore;
    }

    public int getAnnualIncome() {
        return annualIncome;
    }

    public void setAnnualIncome(int annualIncome) {
        this.annualIncome = annualIncome;
    }

    public String getDob() {
        return dob;
    }

    public void setDob(String dob) {
        this.dob = dob;
    }

    public String getSpouseData() {
        return spouseData;
    }

    public void setSpouseData(String spouseData) {
        this.spouseData = spouseData;
    }

    public int getTenure() {
        return tenure;
    }

    public void setTenure(int tenure) {
        this.tenure = tenure;
    }

    public int getSumAssured() {
        return sumAssured;
    }

    public void setSumAssured(int sumAssured) {
        this.sumAssured = sumAssured;
    }

    public String getCoi() {
        return coi;
    }

    public void setCoi(String coi) {
        this.coi = coi;
    }

    public String getTableauFeed() {
        return tableauFeed;
    }

    public void setTableauFeed(String tableauFeed) {
        this.tableauFeed = tableauFeed;
    }

    public String getEkycCkyc() {
        return ekycCkyc;
    }

    public void setEkycCkyc(String ekycCkyc) {
        this.ekycCkyc = ekycCkyc;
    }

    public int getMinSumAssured() {
        return minSumAssured;
    }

    public void setMinSumAssured(int minSumAssured) {
        this.minSumAssured = minSumAssured;
    }

}