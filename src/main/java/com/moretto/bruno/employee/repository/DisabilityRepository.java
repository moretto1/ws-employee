package com.moretto.bruno.employee.repository;

import com.moretto.bruno.employee.entity.Disability;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DisabilityRepository extends JpaRepository<Disability, Long> {
}
