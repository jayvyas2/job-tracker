package com.track.dao;

import com.track.entity.Candidate;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface CandidateRepository extends JpaRepository<Candidate, Long> {

    List<Candidate> findByName(String name);

    Candidate findByPhone(String phone);

    Candidate findByEmail(String email);

}
