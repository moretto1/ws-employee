package com.moretto.bruno.employee.repository;

import com.moretto.bruno.employee.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepository extends JpaRepository<Employee, Long> {
}
