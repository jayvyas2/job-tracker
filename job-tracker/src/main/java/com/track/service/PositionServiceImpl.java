package com.track.service;

import com.track.dao.PositionRepository;
import com.track.dto.PositionDto;
import com.track.entity.Position;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class PositionServiceImpl implements PositionService {

    @Autowired
    PositionRepository positionRepository;

    private static final Logger LOG = LogManager.getLogger(PositionServiceImpl.class);

    public List<PositionDto> getPositionByName(String name) {
        LOG.info("Getting positions by name");
        List<Position> positionList = positionRepository.findByTitle(name);
        List<PositionDto> positionDtoList = preparePositionDto(positionList);
        return positionDtoList;
    }

    @Override
    public List<PositionDto> getPositionByCompany(String name) {
        LOG.info("Getting position by company");
        List<Position> positionList = positionRepository.findByCompanyId(name);
        List<PositionDto> positionDtoList = preparePositionDto(positionList);
        return positionDtoList;
    }

    private List<PositionDto> preparePositionDto(List<Position> positionList) {
        List<PositionDto> positionDtoList = new ArrayList<PositionDto>();
        for (Position position : positionList) {
            PositionDto positionDto = setPositionDto(position);
            positionDtoList.add(positionDto);
        }
        return positionDtoList;
    }

    private PositionDto setPositionDto(Position position) {
        PositionDto positionDto = new PositionDto();
        positionDto.setCompanyId(position.getCompany().getId());
        positionDto.setCompanyName(position.getCompany().getName());
        positionDto.setId(position.getId());
        positionDto.setDescription(position.getDescription());
        positionDto.setPositionTitle(position.getTitle());
        positionDto.setMinimumExperience(position.getMinimumExperience());
        positionDto.setMaximumExperience(position.getMaximumExperience());
        positionDto.setMinimumSalary(position.getMinimumSalary());
        positionDto.setMaximumSalary(position.getMaximumSalary());
        positionDto.setNoOfOpening(position.getNoOfOpening());
        return positionDto;
    }
}
