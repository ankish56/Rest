package com.cg.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.cg.daos.CountryDAO;
import com.cg.entities.Country;


@Service
@Transactional
public class CountryService {

    @Autowired private CountryDAO dao;
    
   /* public List<Country> byContinent(String continent){
        return dao.findByContinent(continent);
    }
    */
    @Transactional(readOnly=true)
    public Country byCode(String code) {
    	Optional<Country> country = dao.findById(code);
    	if(country.isPresent()) {
            return country.get();
        }
        else
            throw new RuntimeException("Product not found!");
    }
    /*
    public void create(Country country) {
        Country temp = dao.findByCode(country.getCode());
        if(temp==null)
        {
            dao.save(country);
        }else
            System.out.println("Country already exists!");
    }
    */
    public void update(Country c) {
    	dao.save(c);
                 
    }
    
    
    public void create(Country country) {
    	dao.save(country);
    }
    
    public void deleteByCode(Country c) {
    	dao.delete(c);
    }
    
}