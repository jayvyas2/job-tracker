package com.track.service;

import com.track.dao.InterviewRepository;
import com.track.dao.InterviewRoundsRepository;
import com.track.dto.InterviewDto;
import com.track.entity.Interview;
import com.track.entity.InterviewRounds;
import com.track.enums.InterviewStatus;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

@Service
public class InterviewServiceImpl implements InterviewService {

    @Autowired
    InterviewRepository interviewRepository;

    @Autowired
    InterviewRoundsRepository interviewRoundsRepository;

    private static final Logger LOG = LogManager.getLogger(InterviewServiceImpl.class);

    @Override
    public List<InterviewDto> getInterviewForCandidate(long candidateId, String status) {
        try {
            InterviewStatus interviewStatus = InterviewStatus.valueOf(status);
        } catch (Exception e) {
            LOG.error("Invalid status passed ", e);
            return Collections.emptyList();
        }
        LOG.info("Getting [{}] interviews for candidate", status);
        List<InterviewDto> interviewDtoList = new ArrayList<>();
        List<Interview> interviewList = interviewRepository.getInterviewsForCandidate(candidateId, status);
        setInterviewDto(interviewDtoList, interviewList);
        return interviewDtoList;
    }

    private void setInterviewDto(List<InterviewDto> interviewDtoList, List<Interview> interviewList) {
        for (Interview interview : interviewList) {
            InterviewDto interviewDto = new InterviewDto();
            interviewDto.setId(interview.getId());
            interviewDto.setCompanyId(interview.getCompanyId());
            interviewDto.setCompanyName(interview.getCompany().getName());
            interviewDto.setDate(interview.getDate());
            interviewDto.setPositionId(interview.getPositionId());
            interviewDto.setPositionName(interview.getPosition().getTitle());
            interviewDto.setStatus(interview.getStatus());
            InterviewRounds interviewRounds = interviewRoundsRepository.findByInterviewId(interview.getId());
            if (interviewRounds != null) {
                interviewDto.setRoundStatus(interviewRounds.getName());
            }
            interviewDtoList.add(interviewDto);
        }
    }
}
