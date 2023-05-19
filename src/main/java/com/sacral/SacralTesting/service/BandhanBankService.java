package com.sacral.SacralTesting.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sacral.SacralTesting.model.BandhanBank;
import com.sacral.SacralTesting.repository.BandhanBankRepository;

@Service
public class BandhanBankService {

    @Autowired
    private BandhanBankRepository bandhanBankRepository;

    public BandhanBank findByMobileNumber(String mobileNumber){
        return bandhanBankRepository.findByMobileNumber(mobileNumber);
    }

    public BandhanBank findByCustomerCRIFScore(int crifScore){
        return bandhanBankRepository.findByCustomerCRIFScore(crifScore);
    }
    
    public BandhanBank findByCustomerAnnualIncome(int annualIncome){
        return bandhanBankRepository.findByCustomerAnnualIncome(annualIncome);
    }

    public BandhanBank findByCustomerVerifiedDOB(String dob){
        return bandhanBankRepository.findByCustomerVerifiedDOB(dob);
    }

    public BandhanBank findByCustomerSpouseData(String spouseData){
        return bandhanBankRepository.findByCustomerSpouseData(spouseData);
    }

    public BandhanBank findByTenureAndSumAssured(int tenure, int sumAssured){
        return bandhanBankRepository.findByTenureAndSumAssured(tenure, sumAssured);
    }

    public BandhanBank findByCOI(String coi){
        return bandhanBankRepository.findByCOI(coi);
    }

    public BandhanBank findByTableauFeed(String tableauFeed){
        return bandhanBankRepository.findByTableauFeed(tableauFeed);
    }

    public BandhanBank findByEkycCkyc(String ekycCkyc){
        return bandhanBankRepository.findByEkycCkyc(ekycCkyc);
    }

    public BandhanBank findByMinimumSumAssured(int minSumAssured){
        return bandhanBankRepository.findByMinimumSumAssured(minSumAssured);
    }

    public List<BandhanBank> findAll(){
        return bandhanBankRepository.findAll();
    }

    public BandhanBank save(BandhanBank bandhanBank){
        return bandhanBankRepository.save(bandhanBank);
    }
}