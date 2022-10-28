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
