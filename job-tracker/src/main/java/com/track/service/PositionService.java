package com.track.service;

import com.track.dto.PositionDto;

import java.util.List;

public interface PositionService {

    List<PositionDto> getPositionByName(String name);

    List<PositionDto> getPositionByCompany(String name);
}
