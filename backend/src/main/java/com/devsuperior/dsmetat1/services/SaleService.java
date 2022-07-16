package com.devsuperior.dsmetat1.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.devsuperior.dsmetat1.entities.Sale;
import com.devsuperior.dsmetat1.repositories.SaleRepository;

@Service
public class SaleService {
	
	@Autowired
	private SaleRepository repository;
	
	public List<Sale> findSale() {
		return repository.findAll();
		
	}

}
