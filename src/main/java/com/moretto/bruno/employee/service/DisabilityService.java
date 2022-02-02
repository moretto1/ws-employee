package com.moretto.bruno.employee.service;

import com.moretto.bruno.employee.dto.DisabilityDto;

import java.util.List;

/**
 * Service to deal with operation around disabilities
 */
public interface DisabilityService {

    /**
     * Get all the disabilities saved in the database
     * @return a list of dtos with all disabilities found
     */
    List<DisabilityDto> getAll();

}
