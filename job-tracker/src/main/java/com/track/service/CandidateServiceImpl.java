package com.track.service;

import com.track.dao.CandidateRepository;
import com.track.entity.Candidate;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CandidateServiceImpl implements CandidateService {

    @Autowired
    CandidateRepository candidateRepository;

    private static final Logger LOG = LogManager.getLogger(CandidateServiceImpl.class);

    @Override
    public List<Candidate> getCandidatesByName(String name) {
        LOG.info("Getting candidates by name");
        List<Candidate> candidates = candidateRepository.findByName(name);
        return candidates;
    }

    @Override
    public Candidate getCandidateByPhone(String phone) {
        LOG.info("Getting candidate by phone");
        Candidate candidate = candidateRepository.findByPhone(phone);
        return candidate;
    }

    @Override
    public Candidate getCandidateByEmail(String email) {
        LOG.info("Getting candidate by email");
        Candidate candidate = candidateRepository.findByEmail(email);
        return candidate;
    }

}
