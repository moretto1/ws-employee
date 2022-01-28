package com.moretto.bruno.employee.mapper;

import com.moretto.bruno.employee.dto.RoleDto;
import com.moretto.bruno.employee.entity.Role;

public class RoleMapper {

    private RoleMapper(){
    }

    public static RoleDto toDto(Role entity) {
        return RoleDto.builder()
                .id(entity.getId())
                .name(entity.getName())
                .salary(entity.getSalary())
                .build();
    }

    public static Role toEntity(RoleDto dto) {
        return Role.builder()
                .id(dto.getId())
                .name(dto.getName())
                .salary(dto.getSalary())
                .build();
    }

}
