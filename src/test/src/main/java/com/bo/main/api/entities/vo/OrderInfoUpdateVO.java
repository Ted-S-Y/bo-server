package com.bo.main.api.entities.vo;


import lombok.Data;
import lombok.EqualsAndHashCode;

import java.io.Serializable;

@Data
@io.swagger.annotations.ApiModel("Update ")
@EqualsAndHashCode(callSuper = false)
public class OrderInfoUpdateVO extends OrderInfoVO implements Serializable {
    private static final long serialVersionUID = 1L;

}
