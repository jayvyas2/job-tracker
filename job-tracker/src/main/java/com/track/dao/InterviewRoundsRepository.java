package com.track.dao;

import com.track.entity.InterviewRounds;
import org.springframework.data.jpa.repository.JpaRepository;

public interface InterviewRoundsRepository extends JpaRepository<InterviewRounds, Long> {

    InterviewRounds findByInterviewId(Long interviewId);
}
