package com.track.controller;

import com.track.entity.Candidate;
import com.track.service.CandidateService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/job-tracker")
public class CandidateController {

    @Autowired
    CandidateService candidateService;

    @GetMapping(value = "/candidate/detail-by-name/{name}", headers = "Accept=application/json")
    public ResponseEntity getCandidatesByName(@PathVariable String name) {
        List<Candidate> candidates = candidateService.getCandidatesByName(name);
        return new ResponseEntity(candidates, HttpStatus.OK);
    }

    @GetMapping(value = "/candidate/detail-by-phone/{phone}", headers = "Accept=application/json")
    public ResponseEntity getCandidateByPhone(@PathVariable String phone) {
        Candidate candidate = candidateService.getCandidateByPhone(phone);
        return new ResponseEntity(candidate, HttpStatus.OK);
    }

    @GetMapping(value = "/candidate/detail-by-email/{email}", headers = "Accept=application/json")
    public ResponseEntity getCandidateByEmail(@PathVariable String email) {
        Candidate candidate = candidateService.getCandidateByEmail(email);
        return new ResponseEntity(candidate, HttpStatus.OK);
    }


}
