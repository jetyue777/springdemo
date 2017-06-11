package com.jet.springdemo.serviceimpl;

import java.util.Random;

import com.jet.springdemo.service.BusinessService;

public class CloudServiceImpl implements BusinessService {

	public String offerService(String companyName) {
		Random random = new Random();
		String service = "\nAs an Organization, " + companyName +
				" offers world class Cloud computing infrastructure."+
				"\nThe annual income exceeds "+ random.nextInt(revenue) + " dollars.";
		return service;
	}

}
