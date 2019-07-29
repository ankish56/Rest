package com.cg.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cg.entities.Country;
import com.cg.services.CountryService;

@RestController
@RequestMapping("/countries")
public class CountryController {

    @Autowired CountryService service;
    
    @GetMapping(value="/code/{code}")	
    public Country findbycode(@PathVariable String code) {
        return service.byCode(code);
    }

    
    @PostMapping(value="/new",consumes= {"application/json"})
    public String save(@RequestBody Country country) {
        service.create(country);
        return "country added!";
    }
    
    @PutMapping(value="/update/{code}",consumes= {"application/json"})
    public String update(@PathVariable String code) {
    	Country country=service.byCode(code);
        service.update(country);
        return "country updated";
    }  
    
    @DeleteMapping(value="/delete/{code}", consumes= {"application/json"})
    public String delete(@PathVariable String code) {
    	Country country=service.byCode(code);
    	service.deleteByCode(country);
    	
    	return "country deleted";
    	
    }
    
    
    
}