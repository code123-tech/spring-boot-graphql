package com.graphql.graphql.entity;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Document(collection = "vechiles")
public class Vechile {
	
	@Id
	private String id;
	private String modeltype;
	private String modelcode;
	private String brandname;
	private String launchdate;
	
	public String getModeltype() {
		return modeltype;
	}

	public void setModeltype(String modeltype) {
		this.modeltype = modeltype;
	}

	public String getModelcode() {
		return modelcode;
	}

	public void setModelcode(String modelcode) {
		this.modelcode = modelcode;
	}

	public String getBrandname() {
		return brandname;
	}

	public void setBrandname(String brandname) {
		this.brandname = brandname;
	}

	public String getLaunchdate() {
		return launchdate;
	}

	public void setLaunchdate(String launchdate) {
		this.launchdate = launchdate;
	}
	
	@Override
	public String toString() {
		return "Vechile [id=" + id + ", modeltype=" + modeltype + ", modelcode=" + modelcode + ", brandname="
				+ brandname + ", launchdate=" + launchdate + "]";
	}	
}
