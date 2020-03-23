package com.track.service;

import com.track.dao.OfferRepository;
import com.track.dto.OfferDto;
import com.track.entity.Offer;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class OfferServiceImpl implements OfferService {

    @Autowired
    OfferRepository offerRepository;

    private static final Logger LOG = LogManager.getLogger(OfferServiceImpl.class);

    @Override
    public List<OfferDto> getOfferByCandidate(long candidateId) {
        LOG.info("Getting offer by candidate");
        List<Offer> offerList = offerRepository.findByCandidateId(candidateId);
        List<OfferDto> offerDtoList = new ArrayList<>();
        setOfferDto(offerList, offerDtoList);
        return offerDtoList;

    }

    private void setOfferDto(List<Offer> offerList, List<OfferDto> offerDtoList) {
        for (Offer offer : offerList) {
            OfferDto offerDto = new OfferDto();
            offerDto.setId(offer.getId());
            offerDto.setCandidateId(offer.getCandidateId());
            offerDto.setStatus(offer.getStatus());
            offerDto.setPositionId(offer.getPositionId());
            offerDto.setCostToCompany(offer.getCostToCompany());
            offerDto.setCandidateName(offer.getCandidate().getName());
            offerDto.setPositionName(offer.getPosition().getTitle());
            offerDtoList.add(offerDto);
        }
    }
}
