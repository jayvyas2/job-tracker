package com.track.service;

import com.track.entity.Candidate;

import java.util.List;

public interface CandidateService {

    List<Candidate> getCandidatesByName(String name);

    Candidate getCandidateByPhone(String phone);

    Candidate getCandidateByEmail(String email);

}
