package com.moretto.bruno.employee.repository;

import com.moretto.bruno.employee.entity.Role;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RoleRepository extends JpaRepository<Role, Long> {
}
