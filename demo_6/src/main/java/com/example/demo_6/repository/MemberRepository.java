package com.example.demo_6.repository;

import com.example.demo_6.domain.Member;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository // ** 이 클래스를 Repository로 쓰겠다는 뜻

// ** 원래 일반 클래스였는데 인터페이스로 바꿈
public interface MemberRepository extends JpaRepository<Member, Long> {
}
