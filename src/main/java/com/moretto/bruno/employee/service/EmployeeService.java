package com.moretto.bruno.employee.service;

import com.moretto.bruno.employee.dto.EmployeeDto;

/**
 * Service to deal with operation around employees
 */
public interface EmployeeService {

    /**
     * Save a new employee in the database
     * @param employeeDto employee to be saved
     */
    void create(EmployeeDto employeeDto);

}
