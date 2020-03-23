package com.track.controller;

import com.track.dto.InterviewDto;
import com.track.service.InterviewService;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/job-tracker")
public class InterviewController {

    @Autowired
    InterviewService interviewService;

    private static final Logger LOG = LogManager.getLogger(InterviewController.class);


    @GetMapping(value = "/candidate/{candidateId}/interview", headers = "Accept=application/json")
    public ResponseEntity getInterviewForCandidate(@PathVariable Long candidateId,
                                                   @RequestParam(value = "status", required = true) String status) {
        List<InterviewDto> interviewDtoList = interviewService.getInterviewForCandidate(candidateId, status);
        return new ResponseEntity(interviewDtoList, HttpStatus.OK);
    }


}
