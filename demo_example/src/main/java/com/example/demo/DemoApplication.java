package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}
}

// ** [회원관리]
// * 회원가입
// * 회원정보 조회
// * 회원정보 변경
// * 회원정보 삭제

// ** [상품관리]
// * 상품 등록
// * 상품 조회
// * 상품정보 변경
// * 상품 삭제

// ** [주문관리]
// * 주문
// * 주문 조회
// * 주문 변경
// * 주문 취소

// ** [배송관리]
// * 배송 시작
// * 배송 조회
// * 주문 취소 및 배송 철회
