package com.moretto.bruno.employee.resource.impl;

import com.moretto.bruno.employee.dto.RoleDto;
import com.moretto.bruno.employee.resource.RoleController;
import com.moretto.bruno.employee.service.RoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class RoleControllerImpl implements RoleController {

    @Autowired
    private RoleService roleService;

    @Override
    public ResponseEntity<List<RoleDto>> getAll() {
        return ResponseEntity.ok(roleService.getAll());
    }

}
