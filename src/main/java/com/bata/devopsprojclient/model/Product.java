package com.bata.devopsprojclient.model;

import lombok.*;

import java.math.BigDecimal;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Product {

    private Long prodId;
    private String prodName;
    private BigDecimal prodPrice;
}
