package com.sacral.SacralTesting.controller;

import com.sacral.SacralTesting.model.Wholesalers;
import com.sacral.SacralTesting.service.WholesalersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/wholesalers")
public class WholesalersController {

    @Autowired
    private WholesalersService wholesalersService;

    @GetMapping
    public ResponseEntity<List<Wholesalers>> getAllWholesalers() {
        return new ResponseEntity<>(wholesalersService.getAllWholesalers(), HttpStatus.OK);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Wholesalers> getWholesalerById(@PathVariable Long id) {
        return new ResponseEntity<>(wholesalersService.getWholesalerById(id), HttpStatus.OK);
    }

    @GetMapping("/name/{name}")
    public ResponseEntity<Wholesalers> getWholesalerByName(@PathVariable String name) {
        return new ResponseEntity<>(wholesalersService.getWholesalerByName(name), HttpStatus.OK);
    }

    @GetMapping("/number/{number}")
    public ResponseEntity<Wholesalers> getWholesalerByNumber(@PathVariable String number) {
        return new ResponseEntity<>(wholesalersService.getWholesalerByNumber(number), HttpStatus.OK);
    }

    @GetMapping("/type/{type}")
    public ResponseEntity<Wholesalers> getWholesalerByType(@PathVariable String type) {
        return new ResponseEntity<>(wholesalersService.getWholesalerByType(type), HttpStatus.OK);
    }

    @GetMapping("/contactName/{contactName}")
    public ResponseEntity<Wholesalers> getWholesalerByContactName(@PathVariable String contactName) {
        return new ResponseEntity<>(wholesalersService.getWholesalerByContactName(contactName), HttpStatus.OK);
    }

    @GetMapping("/emailAddress/{emailAddress}")
    public ResponseEntity<Wholesalers> getWholesalerByEmailAddress(@PathVariable String emailAddress) {
        return new ResponseEntity<>(wholesalersService.getWholesalerByEmailAddress(emailAddress), HttpStatus.OK);
    }

    @GetMapping("/active/{active}")
    public ResponseEntity<Wholesalers> getWholesalerByActive(@PathVariable boolean active) {
        return new ResponseEntity<>(wholesalersService.getWholesalerByActive(active), HttpStatus.OK);
    }

    @GetMapping("/dateCreated/{dateCreated}")
    public ResponseEntity<Wholesalers> getWholesalerByDateCreated(@PathVariable String dateCreated) {
        return new ResponseEntity<>(wholesalersService.getWholesalerByDateCreated(dateCreated), HttpStatus.OK);
    }

    @GetMapping("/lastModified/{lastModified}")
    public ResponseEntity<Wholesalers> getWholesalerByLastModified(@PathVariable String lastModified) {
        return new ResponseEntity<>(wholesalersService.getWholesalerByLastModified(lastModified), HttpStatus.OK);
    }

    @PostMapping
    public ResponseEntity<Wholesalers> saveWholesaler(@RequestBody Wholesalers wholesalers) {
        wholesalersService.saveWholesaler(wholesalers);
        return new ResponseEntity<>(wholesalers, HttpStatus.CREATED);
    }

    @PutMapping
    public ResponseEntity<Wholesalers> editWholesaler(@RequestBody Wholesalers wholesalers) {
        wholesalersService.editWholesaler(wholesalers);
        return new ResponseEntity<>(wholesalers,