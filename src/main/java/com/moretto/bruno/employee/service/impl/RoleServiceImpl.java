package com.moretto.bruno.employee.service.impl;

import com.moretto.bruno.employee.dto.RoleDto;
import com.moretto.bruno.employee.entity.Role;
import com.moretto.bruno.employee.mapper.RoleMapper;
import com.moretto.bruno.employee.repository.RoleRepository;
import com.moretto.bruno.employee.service.RoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;

import java.util.List;
import java.util.stream.Collectors;

public class RoleServiceImpl implements RoleService {

    @Autowired
    private RoleRepository roleRepository;

    @Override
    public List<RoleDto> getAll() {
        List<Role> roles = roleRepository.findAll(Sort.by(Sort.Order.asc("name")));
        return roles.stream()
                .map(RoleMapper::toDto)
                .collect(Collectors.toList());
    }

}
