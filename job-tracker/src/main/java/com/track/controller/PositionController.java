package com.track.controller;

import com.track.dto.PositionDto;
import com.track.service.PositionService;
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
public class PositionController {

    @Autowired
    PositionService positionService;

    @GetMapping(value = "/position/{name}", headers = "Accept=application/json")
    public ResponseEntity getPositionByName(@PathVariable String name) {
        List<PositionDto> positionDtoList = positionService.getPositionByName(name);
        return new ResponseEntity(positionDtoList, HttpStatus.OK);
    }

    @GetMapping(value = "/position/company/{name}", headers = "Accept=application/json")
    public ResponseEntity getPositionByCompany(@PathVariable String name) {
        List<PositionDto> positionDtoList = positionService.getPositionByCompany(name);
        return new ResponseEntity(positionDtoList, HttpStatus.OK);
    }

}
