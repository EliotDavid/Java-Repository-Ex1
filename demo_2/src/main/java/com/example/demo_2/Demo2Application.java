package com.example.demo_2;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

// ** 이 어노테이션이 Springboot의 핵심이 됨
// ** Srpingboot가 이 어노테이션부터 시작을해서 얘가 메인이 됨
// ** 이 어노테이션이 Srpingboot의 출발지점임
@SpringBootApplication
public class Demo2Application {

	public static void main(String[] args) {

		SpringApplication.run(Demo2Application.class, args);
		// ** run메서드 옆 Demo2Application.class는 Demoapplication이라는 클래스이름을 말함)
		// ** Dembo2Application클래스에서 사용하는 파라미터를 그대로 받아씀
	}

}
