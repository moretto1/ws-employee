package com.moretto.bruno.employee.dto;

import com.moretto.bruno.employee.entity.Disability;
import com.moretto.bruno.employee.entity.Role;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;
import java.util.Set;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class EmployeeDto {

    private Long id;

    private String name;

    private String cpf;

    private LocalDate birthDate;

    private String birthCountry;

    private String mothersName;

    private String gender;

    private String address;

    private LocalDate admissionDate;

    private Role role;

    private Set<Disability> disabilities;

}
