package com.graphql.graphql.service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collector;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.graphql.graphql.entity.Vechile;
import com.graphql.graphql.repository.VechileRepository;

@Service
public class VehicleService {
	
	@Autowired 
	private VechileRepository vechileRepository;
	
	public List<Vechile> getVechiles(int count){
		return this.vechileRepository.findAll().stream().limit(count).collect(Collectors.toList()); 
	}
	
	public Optional<Vechile> getVechileById(String id){
		return this.vechileRepository.findById(id);
	}
	
	public Vechile createVechile(String modeltype, String modelcode, String brandname, String launchdate) {
		Vechile newVechile = new Vechile();
		newVechile.setModeltype(modeltype);
		newVechile.setModelcode(modelcode);
		newVechile.setBrandname(brandname);
		newVechile.setLaunchdate(launchdate);
		return this.vechileRepository.save(newVechile);
		
	}
}
