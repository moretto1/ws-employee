package com.moretto.bruno.employee.mapper;

import com.moretto.bruno.employee.dto.DisabilityDto;
import com.moretto.bruno.employee.entity.Disability;

public class DisabilityMapper {

    private DisabilityMapper() {
    }

    public static DisabilityDto toDto(Disability entity) {
        return DisabilityDto.builder()
                .id(entity.getId())
                .name(entity.getName())
                .build();
    }

    public static Disability toEntity(DisabilityDto dto) {
        return Disability.builder()
                .id(dto.getId())
                .name(dto.getName())
                .build();
    }

}
