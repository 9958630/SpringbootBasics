package com.spring.springbasics;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

/*
 *  This Annotation enable to scan this class
 *  Value will decide the ID of create bean. This ID can be used to get the bean of this class
 */
@Component(value = "company1")
public class Company {

    @Autowired
    @Value("VGautam")
    String companyCEO;

    @Autowired(required = true)
    // @Qualifier("Address")
    Address companyAddress;

    public String getCompanyCEO() {
        return companyCEO;
    }

    public void setCompanyCEO(String companyCEO) {
        this.companyCEO = companyCEO;
    }

    public Address getCompanyAddress() {
        return companyAddress;
    }

    public void setCompanyAddress(Address companyAddress) {
        this.companyAddress = companyAddress;
    }

    @Override
    public String toString() {
        return "Company [companyCEO=" + companyCEO + ", companyAddress="
                + companyAddress + "]";
    }

}