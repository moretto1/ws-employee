package com.moretto.bruno.employee.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.List;
import java.util.Set;

@Entity
@Table
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Data
public class Employee {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(name = "NAME")
    private String name;

    @Column(name = "CPF")
    private String cpf;

    @Column(name = "BIRTH_DATE")
    private LocalDate birthDate;

    @Column(name = "BIRTH_COUNTRY")
    private String birthCountry;

    @Column(name = "MOTHERS_NAME")
    private String mothersName;

    @Column(name = "GENDER")
    private String gender;

    @Column(name = "ADDRESS")
    private String address;

    @Column(name = "ADMISSION_DATE")
    private LocalDate admissionDate;

    @ManyToOne
    @JoinColumn(name = "ROLE_ID")
    private Role role;

    @ManyToMany
    @JoinTable(
            name = "EMPLOYEE_DISABILITY",
            joinColumns = @JoinColumn(name = "EMPLOYEE_ID"),
            inverseJoinColumns = @JoinColumn(name = "DISABILITY_ID")
    )
    private List<Disability> disabilities;

}
