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
public class DisabilityDto {

    @ApiModelProperty(example = "1")
    private Long id;

    @ApiModelProperty(example = "BLINDNESS")
    private String name;

}
