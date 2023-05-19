package com.sacral.SacralTesting.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.sacral.SacralTesting.model.BandhanBank;
import com.sacral.SacralTesting.service.BandhanBankService;

@RestController
public class BandhanBankController {

    @Autowired
    private BandhanBankService bandhanBankService;

    @GetMapping("/bandhanbank/mobile/{mobileNumber}")
    public BandhanBank findByMobileNumber(@PathVariable String mobileNumber){
        return bandhanBankService.findByMobileNumber(mobileNumber);
    }

    @GetMapping("/bandhanbank/crifscore/{crifScore}")
    public BandhanBank findByCustomerCRIFScore(@PathVariable int crifScore){
        return bandhanBankService.findByCustomerCRIFScore(crifScore);
    }
    
    @GetMapping("/bandhanbank/annualincome/{annualIncome}")
    public BandhanBank findByCustomerAnnualIncome(@PathVariable int annualIncome){
        return bandhanBankService.findByCustomerAnnualIncome(annualIncome);
    }

    @GetMapping("/bandhanbank/dob/{dob}")
    public BandhanBank findByCustomerVerifiedDOB(@PathVariable String dob){
        return bandhanBankService.findByCustomerVerifiedDOB(dob);
    }

    @GetMapping("/bandhanbank/spousedata/{spouseData}")
    public BandhanBank findByCustomerSpouseData(@PathVariable String spouseData){
        return bandhanBankService.findByCustomerSpouseData(spouseData);
    }

    @GetMapping("/bandhanbank/tenure/{tenure}/sumassured/{sumAssured}")
    public BandhanBank findByTenureAndSumAssured(@PathVariable int tenure, @PathVariable int sumAssured){
        return bandhanBankService.findByTenureAndSumAssured(tenure, sumAssured);
    }

    @GetMapping("/bandhanbank/coi/{coi}")
    public BandhanBank findByCOI(@PathVariable String coi){
        return bandhanBankService.findByCOI(coi);
    }

    @GetMapping("/bandhanbank/tableaufeed/{tableauFeed}")
    public BandhanBank findByTableauFeed(@PathVariable String tableauFeed){
        return bandhanBankService.findByTableauFeed(tableauFeed);
    }

    @GetMapping("/bandhanbank/ekycckyc/{ekycCkyc}")
    public BandhanBank findByEkycCkyc(@PathVariable String ekycCkyc){
        return bandhanBankService.findByEkycCkyc(ekycCkyc);
    }

    @GetMapping("/bandhanbank/minsumassured/{minSumAssured}")
    public BandhanBank findByMinimumSumAssured(@PathVariable int minSumAssured){
        return bandhanBankService.findByMinimumSumAssured(minSumAssured);
    }

    @GetMapping("/bandhanbank")
    public List<BandhanBank> findAll(){
        return bandhanBankService.findAll();
    }

    @PostMapping("/bandhanbank")
    public BandhanBank save(@RequestBody BandhanBank bandhanBank){
        return bandhanBankService.save(bandhanBank);
    }

}