package com.moretto.bruno.employee.service;

import com.moretto.bruno.employee.dto.EmployeeDto;

import java.util.Optional;

/**
 * Service to deal with operation around employees
 */
public interface EmployeeService {

    /**
     * Searches by an employee in the database by your id
     * @param id employee id to searches by
     */
    Optional<EmployeeDto> searchById(Long id);

    /**
     * Save a new employee in the database
     * @param employeeDto employee to be saved
     */
    EmployeeDto create(EmployeeDto employeeDto);

}
