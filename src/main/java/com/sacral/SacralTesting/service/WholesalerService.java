package com.sacral.SacralTesting.service;

import java.time.LocalDateTime;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sacral.SacralTesting.entity.WholesalerEntity;
import com.sacral.SacralTesting.repository.WholesalerRepository;

@Service
public class WholesalerService {

    @Autowired
    private WholesalerRepository wholesalerRepository;

    public List<WholesalerEntity> editWholesaler(String name, String number, String type, String contactName, String emailAddress, Boolean active, LocalDateTime dateCreated, LocalDateTime lastModified) {
        return wholesalerRepository.findByNameAndNumberAndTypeAndContactNameAndEmailAddressAndActiveAndDateCreatedAndLastModified(name, number, type, contactName, emailAddress, active, dateCreated, lastModified);
    }

    public List<WholesalerEntity> viewWholesaler(String name) {
        return wholesalerRepository.findByName(name);
    }

    public List<WholesalerEntity> downloadWholesaler(String name) {
        return wholesalerRepository.findByName(name);
    }

    public List<WholesalerEntity> findSubFunctionalities() {
        return wholesalerRepository.findAll();
    }

    public List<WholesalerEntity> filterData(String name, String number, String type, String contactName, String emailAddress, Boolean active) {
        return wholesalerRepository.findByNameAndNumberAndTypeAndContactNameAndEmailAddressAndActive(name, number, type, contactName, emailAddress, active);
    }

    public List<WholesalerEntity> addWholesaler(String name, String number, String type, String contactName, String emailAddress, Boolean active) {
        return wholesalerRepository.save(new WholesalerEntity(name, number, type, contactName, emailAddress, active, LocalDateTime.now(), LocalDateTime.now()));
    }

    public List<WholesalerEntity> resetSelections(String name, String number, String type, String contactName, String emailAddress, Boolean active) {
        return wholesalerRepository.findByNameAndNumberAndTypeAndContactNameAndEmailAddressAndActive(name, number, type, contactName, emailAddress, active);
    }

}