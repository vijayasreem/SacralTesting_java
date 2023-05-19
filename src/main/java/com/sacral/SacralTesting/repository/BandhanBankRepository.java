package com.sacral.SacralTesting.repository;

import org.springframework.data.jpa.repository.JpaRepository;

public interface BandhanBankRepository extends JpaRepository<BandhanBank, Long>{
    
    public BandhanBank findByMobileNumber(String mobileNumber);
    
    public BandhanBank findByCustomerCRIFScore(int crifScore);
    
    public BandhanBank findByCustomerAnnualIncome(int annualIncome); 
    
    public BandhanBank findByCustomerVerifiedDOB(String dob);
    
    public BandhanBank findByCustomerSpouseData(String spouseData);
    
    public BandhanBank findByTenureAndSumAssured(int tenure, int sumAssured);
    
    public BandhanBank findByCOI(String coi);
    
    public BandhanBank findByTableauFeed(String tableauFeed);
    
    public BandhanBank findByEkycCkyc(String ekycCkyc);
    
    public BandhanBank findByMinimumSumAssured(int minSumAssured);

}