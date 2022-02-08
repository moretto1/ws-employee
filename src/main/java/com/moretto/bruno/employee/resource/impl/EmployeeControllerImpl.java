package com.moretto.bruno.employee.resource.impl;

import com.moretto.bruno.employee.dto.EmployeeDto;
import com.moretto.bruno.employee.resource.EmployeeController;
import com.moretto.bruno.employee.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.mvc.method.annotation.MvcUriComponentsBuilder;

import java.net.URI;
import java.util.Optional;

@RestController
public class EmployeeControllerImpl implements EmployeeController {

    @Autowired
    private EmployeeService employeeService;

    @Override
    public ResponseEntity<EmployeeDto> searchById(Long id) {
        Optional<EmployeeDto> employeeDto = employeeService.searchById(id);
        return employeeDto.map(ResponseEntity::ok)
                .orElseGet(() -> ResponseEntity.noContent().build());
    }

    @Override
    public ResponseEntity<URI> create(EmployeeDto dto) {
        dto = employeeService.create(dto);

        final URI uri = MvcUriComponentsBuilder
                .fromController(EmployeeController.class)
                .path("/{id}")
                .buildAndExpand(dto.getId())
                .toUri();

        return ResponseEntity.created(uri).build();
    }

}
