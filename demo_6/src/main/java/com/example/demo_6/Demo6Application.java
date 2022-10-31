package com.example.demo_6;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication // 얘가 첫번쨰 출발지점
					   // 각 패키지에 있는 어노테이션들을 확인을 함(계층을 나누기 위함임)
						// 그럼 그 계층이 생성되면
						// MemberController에 보면 @A
public class Demo6Application {

	public static void main(String[] args) {
		SpringApplication.run(Demo6Application.class, args);
	}


		
}

// ** 비즈니스 모델 (c, r, u, d)
    // ** 회원관리(에서도 4가지로 나뉨) 
        //** 회원가입 받을 수 있어야함 (create)
        //** 회원정보 변경 (r)
        //** 회원정보 조회 (update)
        //** 회원정보 삭제 (delete)
 
    // ** 상품관리
        // ** 상품등록 
        // ** 상품 조회
        // ** 상품정보 변경
        // ** 상품 삭제

    // ** 주문관리 
		// ** 주문을 할 수 있었고
		// ** 주문 조회가 가능해야 됨
		// ** 주분 변경
		// ** 주문 취소

    // ** 배송관리 
		// ** 배송 시작
		// ** 배송 조회
		// ** 주문 취소 및 배송 변경사항(철회)(배송에 대한 변경 사항은 취소상태와 같음/2가지 기능을 한 번에 처리해야됨)

