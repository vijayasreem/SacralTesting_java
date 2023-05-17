package com.sacral.SacralTesting.controller;

import java.time.LocalDateTime;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.sacral.SacralTesting.entity.WholesalerEntity;
import com.sacral.SacralTesting.service.WholesalerService;

@RestController
@RequestMapping("/wholesaler")
public class WholesalerController {

    @Autowired
    private WholesalerService wholesalerService;

    @PostMapping("/edit")
    public List<WholesalerEntity> editWholesaler(@RequestParam String name, @RequestParam String number, @RequestParam String type, @RequestParam String contactName, @RequestParam String emailAddress, @RequestParam Boolean active, @RequestParam LocalDateTime dateCreated, @RequestParam LocalDateTime lastModified) {
        return wholesalerService.editWholesaler(name, number, type, contactName, emailAddress, active, dateCreated, lastModified);
    }

    @GetMapping("/view")
    public List<WholesalerEntity> viewWholesaler(@RequestParam String name) {
        return wholesalerService.viewWholesaler(name);
    }

    @GetMapping("/download")
    public List<WholesalerEntity> downloadWholesaler(@RequestParam String name) {
        return wholesalerService.downloadWholesaler(name);
    }

    @GetMapping("/findSubFunctionalities")
    public List<WholesalerEntity> findSubFunctionalities() {
        return wholesalerService.findSubFunctionalities();
    }

    @PostMapping("/filterData")
    public List<WholesalerEntity> filterData(@RequestParam String name, @RequestParam String number, @RequestParam String type, @RequestParam String contactName, @RequestParam String emailAddress, @RequestParam Boolean active) {
        return wholesalerService.filterData(name, number, type, contactName, emailAddress, active);
    }

    @PostMapping("/add")
    public List<WholesalerEntity> addWholesaler(@RequestParam String name, @RequestParam String number, @RequestParam String type, @RequestParam String contactName, @RequestParam String emailAddress, @RequestParam Boolean active) {
        return wholesalerService.addWholesaler(name, number, type, contactName, emailAddress, active);
    }

    @PostMapping("/resetSelections")
    public List<WholesalerEntity> resetSelections(@RequestParam String name, @RequestParam String number, @RequestParam String type, @RequestParam String contactName, @RequestParam String emailAddress, @RequestParam Boolean active) {
        return wholesalerService.resetSelections(name, number, type, contactName, emailAddress, active);
    }

}