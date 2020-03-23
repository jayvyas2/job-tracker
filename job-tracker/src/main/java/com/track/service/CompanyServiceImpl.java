package com.track.service;

import com.track.dao.CompanyRepository;
import com.track.entity.Company;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CompanyServiceImpl implements CompanyService {

    @Autowired
    CompanyRepository companyRepository;

    private static final Logger LOG = LogManager.getLogger(CompanyServiceImpl.class);

    @Override
    public Company getCompanyByName(String name) {
        LOG.info("Getting company by name");
        Company company = companyRepository.findByName(name);
        return company;

    }

}
