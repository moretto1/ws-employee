package com.moretto.bruno.employee.resource.impl;

import com.moretto.bruno.employee.dto.DisabilityDto;
import com.moretto.bruno.employee.resource.DisabilityController;
import com.moretto.bruno.employee.service.DisabilityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class DisabilityControllerImpl implements DisabilityController {

    @Autowired
    private DisabilityService disabilityService;

    @Override
    public ResponseEntity<List<DisabilityDto>> getAll() {
        return ResponseEntity.ok(disabilityService.getAll());
    }

}
