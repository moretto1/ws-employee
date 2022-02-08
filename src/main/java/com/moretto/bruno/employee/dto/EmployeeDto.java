package com.moretto.bruno.employee.dto;

import com.fasterxml.jackson.annotation.JsonFormat;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.hateoas.RepresentationModel;

import java.time.LocalDate;
import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@ApiModel
public class EmployeeDto extends RepresentationModel<EmployeeDto> {

    @ApiModelProperty(example = "123")
    private Long id;

    @ApiModelProperty(example = "Tom Brady")
    private String name;

    @ApiModelProperty(example = "12345678911")
    private String cpf;

    @ApiModelProperty(example = "01/01/2000")
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "dd/MM/yyyy")
    private LocalDate birthDate;

    @ApiModelProperty(example = "Brazil")
    private String birthCountry;

    @ApiModelProperty(example = "Marry Smith")
    private String mothersName;

    @ApiModelProperty(example = "M")
    private String gender;

    @ApiModelProperty(example = "Random Street, 123")
    private String address;

    @ApiModelProperty(example = "10/10/2020")
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "dd/MM/yyyy")
    private LocalDate admissionDate;

    private RoleDto role;

    private List<DisabilityDto> disabilities;

}
