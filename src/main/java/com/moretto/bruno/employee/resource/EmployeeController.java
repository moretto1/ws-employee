package com.moretto.bruno.employee.resource;

import com.moretto.bruno.employee.dto.EmployeeDto;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.net.URI;

@Api(value = "Employees controller", tags = {"Employees controller"}, produces = MediaType.APPLICATION_JSON_VALUE)
@RequestMapping(path = "/employees")
public interface EmployeeController {

    @ApiOperation(value = "Search an employee by ID", response = EmployeeDto.class)
    @GetMapping(path = "/{id}")
    ResponseEntity<EmployeeDto> searchById(@PathVariable Long id);

    @ApiOperation(value = "Saves an employee in the database", response = EmployeeDto.class)
    @PostMapping
    ResponseEntity<URI> create(@RequestBody EmployeeDto dto);

}
