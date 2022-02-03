package com.moretto.bruno.employee.service;

import com.moretto.bruno.employee.dto.RoleDto;

import java.util.List;

/**
 * Service to deal with operation around roles
 */
public interface RoleService {

    /**
     * Get all the roles saved in the database
     * @return a list of dtos with all roles found
     */
    List<RoleDto> getAll();

}
