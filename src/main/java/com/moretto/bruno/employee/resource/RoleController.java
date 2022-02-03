package com.moretto.bruno.employee.resource;

import com.moretto.bruno.employee.dto.RoleDto;
import com.moretto.bruno.employee.entity.Role;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Api(value = "Roles controller", tags = {"Roles controller"}, produces = MediaType.APPLICATION_JSON_VALUE)
@RequestMapping(path = "/roles")
public interface RoleController {

    @ApiOperation(value = "Get all the possible roles", response = Role.class)
    @GetMapping
    ResponseEntity<List<RoleDto>> getAll();

}
