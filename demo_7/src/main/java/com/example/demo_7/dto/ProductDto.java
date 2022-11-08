package com.example.demo_7.dto;


import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;

@Getter @Setter
@NoArgsConstructor
public class ProductDto {

    // 멤버(1)가 주문(2)을 하면 이 주문은 여러 개의 상품(3)들을 가질 수 있고 이 상품은 여러개의 주문들을 가짐

    private String title;

    private String content;

    //private String filename;

    //private String filepath;

    private int count; // +, -로 연산이 되어야 함

    private int price;


}
