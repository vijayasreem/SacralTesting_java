package com.sacral.SacralTesting.service;

import com.sacral.SacralTesting.model.Wholesalers;
import com.sacral.SacralTesting.repository.WholesalersRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class WholesalersService {

    @Autowired
    private WholesalersRepository wholesalersRepository;

    public List<Wholesalers> getAllWholesalers(){
        return wholesalersRepository.findAll();
    }

    public Wholesalers getWholesalerById(Long id){
        return wholesalersRepository.findById(id);
    }

    public Wholesalers getWholesalerByName(String name){
        return wholesalersRepository.findByName(name);
    }

    public Wholesalers getWholesalerByNumber(String number){
        return wholesalersRepository.findByNumber(number);
    }

    public Wholesalers getWholesalerByType(String type){
        return wholesalersRepository.findByType(type);
    }

    public Wholesalers getWholesalerByContactName(String contactName){
        return wholesalersRepository.findByContactName(contactName);
    }

    public Wholesalers getWholesalerByEmailAddress(String emailAddress){
        return wholesalersRepository.findByEmailAddress(emailAddress);
    }

    public Wholesalers getWholesalerByActive(boolean active){
        return wholesalersRepository.findByActive(active);
    }

    public Wholesalers getWholesalerByDateCreated(String dateCreated){
        return wholesalersRepository.findByDateCreated(dateCreated);
    }

    public Wholesalers getWholesalerByLastModified(String lastModified){
        return wholesalersRepository.findByLastModified(lastModified);
    }

    public void saveWholesaler(Wholesalers wholesalers){
        wholesalersRepository.save(wholesalers);
    }

    public void editWholesaler(Wholesalers wholesalers){
        wholesalersRepository.save(wholesalers);
    }

    public void deleteWholesaler(Long id){
        wholesalersRepository.deleteById(id);
    }

    public void downloadBranchesAsCSVFile(){
        // code to download branches as csv file
    }

    public boolean checkIfUserHasAccess(){
        // code to check if user has access
    }

    public void filterDataUsingDropDownMenu(){
        // code to filter data using drop down menu
    }

}