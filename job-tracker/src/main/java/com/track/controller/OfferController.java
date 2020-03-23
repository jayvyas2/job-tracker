package com.track.controller;

import com.track.dto.OfferDto;
import com.track.service.OfferService;
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
public class OfferController {

    @Autowired
    OfferService offerService;

    @GetMapping(value = "/offer/candidate/{candidateId}", headers = "Accept=application/json")
    public ResponseEntity getOfferByCandidate(@PathVariable long candidateId) {
        List<OfferDto> offers = offerService.getOfferByCandidate(candidateId);
        return new ResponseEntity(offers, HttpStatus.OK);
    }
}
