package com.subh.productservice.dto;

import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;
import java.util.Date;

@Getter @Setter
public class Coupon {
    private Long id;
    private String code;
    private BigDecimal discountAmount;
    private Date expDate;

}
