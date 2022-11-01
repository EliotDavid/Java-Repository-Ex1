package com.example.demo_6.repository;

import com.example.demo_6.domain.Member;
import com.example.demo_6.dto.MemberDto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;

@Repository // ** 이 클래스를 Repository로 쓰겠다는 뜻

// ** 원래 일반 클래스였는데 인터페이스로 바꿈
//public class MemberRepository extends JpaRepository<Member, Long> {

public class MemberRepository{ // **레파지토리에서 컨테이너로 데이터를 넣어줄거임

    // ** 영속성이라는 컨테이너의 이름을 
    @PersistenceContext //** 로 지정 해줘야 됨
    private EntityManager em; // ** 엔티티매니저는 Data Access Layer에 있음
    // ** Repository -> Entity MAnager -> DB (Entity Manager가 DB로 보내줌)
    // ** 엔티티매니저안에 컨테니어가 있고 1차캐시가 있음
    // ** 엔티티매니저는 영역이라기보다 역할임
    // ** 레파지토리에서 데이터를 EM으로 넘겨주고 EM이 DB로 넘겨줌

    public void insertMember(Member member)
    {
        em.persist(member);
    }

    public List<Member> findAll(){
        return em.createQuery("select m from Member m", Member.class).getResultList();
    }


    }





