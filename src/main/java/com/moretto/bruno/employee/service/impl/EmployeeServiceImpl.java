package com.moretto.bruno.employee.service.impl;

import com.moretto.bruno.employee.dto.EmployeeDto;
import com.moretto.bruno.employee.entity.Employee;
import static com.moretto.bruno.employee.mapper.EmployeeMapper.toEntity;

import com.moretto.bruno.employee.repository.EmployeeRepository;
import com.moretto.bruno.employee.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

@Service
public class EmployeeServiceImpl implements EmployeeService {

    @Autowired
    private EmployeeRepository employeeRepository;

    @Override
    public void create(EmployeeDto employeeDto) {
        try {
            Employee entity = toEntity(employeeDto);
            employeeRepository.save(entity);
        } catch (Exception e) {
            throw new ResponseStatusException(
                    HttpStatus.INTERNAL_SERVER_ERROR,
                    "There was a problem saving the employee."
            );
        }
    }

}
