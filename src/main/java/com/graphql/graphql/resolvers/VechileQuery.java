package com.graphql.graphql.resolvers;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.graphql.graphql.entity.Vechile;
import com.graphql.graphql.service.VehicleService;

import graphql.kickstart.tools.GraphQLQueryResolver;

@Component
public class VechileQuery implements GraphQLQueryResolver{
	
	@Autowired
	private VehicleService vehicleService;
	
	public List<Vechile> getVechiles(int count){
		return vehicleService.getVechiles(count);
	}
	
	public Optional<Vechile> getVechileById(String id){
		return vehicleService.getVechileById(id);
	}
}
