package com.moretto.bruno.employee.resource;

import com.moretto.bruno.employee.dto.DisabilityDto;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Api(value = "Disabilities controller", tags = {"Disabilities Controller"}, produces = MediaType.APPLICATION_JSON_VALUE)
@RequestMapping(path = "/disabilities")
public interface DisabilityController {

    @ApiOperation(value = "Get all the possible disabilities", response = DisabilityDto.class)
    @GetMapping
    ResponseEntity<List<DisabilityDto>> getAll();

}
