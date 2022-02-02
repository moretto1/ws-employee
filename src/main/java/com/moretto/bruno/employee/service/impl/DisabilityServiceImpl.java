package com.moretto.bruno.employee.service.impl;

import com.moretto.bruno.employee.dto.DisabilityDto;
import com.moretto.bruno.employee.entity.Disability;
import com.moretto.bruno.employee.mapper.DisabilityMapper;
import com.moretto.bruno.employee.repository.DisabilityRepository;
import com.moretto.bruno.employee.service.DisabilityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class DisabilityServiceImpl implements DisabilityService {

    @Autowired
    private DisabilityRepository disabilityRepository;

    @Override
    public List<DisabilityDto> getAll() {
        List<Disability> disabilities = disabilityRepository.findAll(Sort.by(Sort.Order.asc("name")));
        return disabilities.stream()
                .map(DisabilityMapper::toDto)
                .collect(Collectors.toList());
    }

}
