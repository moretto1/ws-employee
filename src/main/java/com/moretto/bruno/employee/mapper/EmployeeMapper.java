package com.moretto.bruno.employee.mapper;

import com.moretto.bruno.employee.dto.DisabilityDto;
import com.moretto.bruno.employee.dto.EmployeeDto;
import com.moretto.bruno.employee.dto.RoleDto;
import com.moretto.bruno.employee.entity.Disability;
import com.moretto.bruno.employee.entity.Employee;
import com.moretto.bruno.employee.entity.Role;

import java.util.Objects;
import java.util.Set;
import java.util.stream.Collectors;

public class EmployeeMapper {

    private EmployeeMapper() {
    }

    public static EmployeeDto toDto(Employee entity) {
        RoleDto roleDto = RoleMapper.toDto(entity.getRole());

        Set<DisabilityDto> disabilitiesDtoSet = null;
        if(Objects.nonNull(entity.getDisabilities())) {
            disabilitiesDtoSet = entity.getDisabilities()
                    .stream()
                    .map(DisabilityMapper::toDto)
                    .collect(Collectors.toSet());
        }

        return EmployeeDto.builder()
                .id(entity.getId())
                .name(entity.getName())
                .cpf(entity.getCpf())
                .birthDate(entity.getBirthDate())
                .birthCountry(entity.getBirthCountry())
                .mothersName(entity.getMothersName())
                .gender(entity.getGender())
                .address(entity.getAddress())
                .admissionDate(entity.getAdmissionDate())
                .role(roleDto)
                .disabilities(disabilitiesDtoSet)
                .build();
    }

    public static Employee toEntity(EmployeeDto dto) {
        Role roleEntity = RoleMapper.toEntity(dto.getRole());

        Set<Disability> disabilitiesEntitySet = null;
        if(Objects.nonNull(dto.getDisabilities())) {
            disabilitiesEntitySet = dto.getDisabilities()
                    .stream()
                    .map(DisabilityMapper::toEntity)
                    .collect(Collectors.toSet());
        }

        return Employee.builder()
                .id(dto.getId())
                .name(dto.getName())
                .cpf(dto.getCpf())
                .birthDate(dto.getBirthDate())
                .birthCountry(dto.getBirthCountry())
                .mothersName(dto.getMothersName())
                .gender(dto.getGender())
                .address(dto.getAddress())
                .admissionDate(dto.getAdmissionDate())
                .role(roleEntity)
                .disabilities(disabilitiesEntitySet)
                .build();
    }

}
