package com.track.dao;

import com.track.entity.Interview;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface InterviewRepository extends JpaRepository<Interview, Long> {

    @Query(value = "select i.* from interview i where candidate_id=?1 and status=?2", nativeQuery = true)
    List<Interview> getInterviewsForCandidate(Long candidateId, String status);

}
