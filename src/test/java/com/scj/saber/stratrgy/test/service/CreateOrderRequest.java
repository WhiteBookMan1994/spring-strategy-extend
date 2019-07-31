package com.scj.saber.stratrgy.test.service;

import com.scj.saber.stratrgy.test.UserLevel;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author shengchaojie
 * @date 2019-07-30
 **/
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class CreateOrderRequest {

    private String sku;

    private Integer num;

    private Long userId;

    private UserLevel userLevel;

}
