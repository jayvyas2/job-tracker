package com.track.service;

import com.track.dto.OfferDto;

import java.util.List;

public interface OfferService {

    List<OfferDto> getOfferByCandidate(long candidateId);
}
