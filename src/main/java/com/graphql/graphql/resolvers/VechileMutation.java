package com.graphql.graphql.resolvers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.graphql.graphql.entity.Vechile;
import com.graphql.graphql.service.VehicleService;

import graphql.kickstart.tools.GraphQLMutationResolver;

@Component
public class VechileMutation implements GraphQLMutationResolver{
	
	@Autowired
	private VehicleService vehicleService;
	
	public Vechile createVechile(String modeltype, String modelcode, String brandname, String launchdate) {
		return this.vehicleService.createVechile(modeltype, modelcode, brandname, launchdate);
	}
}
