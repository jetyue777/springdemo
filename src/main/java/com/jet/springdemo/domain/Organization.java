package com.jet.springdemo.domain;

import com.jet.springdemo.service.BusinessService;
import com.jet.springdemo.serviceimpl.CloudServiceImpl;
import com.jet.springdemo.serviceimpl.EcommerceServiceImpl;

public class Organization {

    private String companyName;
    private int yearOfIncorporation;
    private String postalCode;
    private int employeeCount;

    private String slogan;

    //before dependency injection, tightly coupled
    //private BusinessService businessService = new EcommerceServiceImpl();
    //if we want to change to different implementation, then we need to modify code to swap
    //private BusinessService businessService = new CloudServiceImpl();


    //BusinessService is in fact a dependency of Organization
    //Organization depends on business inorder to get the job done.
    //have setter based dependency injection and
    //constructor based dependency injection

    private BusinessService businessService;


    //	public Organization() {
//	}

    public Organization(String companyName, int yearOfIncorporation) {
        this.companyName = companyName;
        this.yearOfIncorporation = yearOfIncorporation;
    }


    public void setPostalCode(String postalCode) {
        this.postalCode = postalCode;
    }


    public void setEmployeeCount(int employeeCount) {
        this.employeeCount = employeeCount;
    }


    public String corporateSlogan() {
        return slogan;
    }

    public void setSlogan(String slogan) {
        this.slogan = slogan;
    }

    //setter based dependency injection
    public void setBusinessService(BusinessService businessService) {
        this.businessService = businessService;
    }

    public String corporateService() {
        return businessService.offerService(companyName);
    }

    @Override
    public String toString() {
        return "Organization{" +
                "companyName='" + companyName + '\'' +
                ", yearOfIncorporation=" + yearOfIncorporation +
                ", postalCode='" + postalCode + '\'' +
                ", employeeCount=" + employeeCount +
                '}';
    }
}
