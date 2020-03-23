package com.track.controller;

import com.track.entity.Company;
import com.track.service.CompanyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/job-tracker")
public class CompanyController {

    @Autowired
    CompanyService companyService;

    @GetMapping(value = "/company/{name}", headers = "Accept=application/json")
    public ResponseEntity getCompanyByName(@PathVariable String name) {
        Company company = companyService.getCompanyByName(name);
        return new ResponseEntity(company, HttpStatus.OK);
    }

}
