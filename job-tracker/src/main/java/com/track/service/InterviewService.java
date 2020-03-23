package com.track.service;

import com.track.dto.InterviewDto;

import java.util.List;

public interface InterviewService {

    List<InterviewDto> getInterviewForCandidate(long candidateId, String status);
}
