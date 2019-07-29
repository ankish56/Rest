package com.cg.daos;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cg.entities.Country;


public interface CountryDAO extends JpaRepository<Country, String>{
	
}
