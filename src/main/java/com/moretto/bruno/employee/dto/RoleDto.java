package com.moretto.bruno.employee.dto;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@ApiModel
public class RoleDto {

    @ApiModelProperty(example = "1")
    private Long id;

    @ApiModelProperty(example = "DEVELOPER")
    private String name;

    @ApiModelProperty(example = "1500.42")
    private Double salary;

}
