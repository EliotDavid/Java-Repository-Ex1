package com.example.demo_6.service;

import com.example.demo_6.domain.Member;
import com.example.demo_6.dto.MemberDto;
import com.example.demo_6.repository.MemberRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PostMapping;

import javax.transaction.Transactional;
import java.util.List;


@Transactional // ** 변경사항에 대한 저장을 해주는 것
                // ** 자동으로 변경된 작업들을 저장해주는 것

@Service // ** 이 클래스를 서비스로 쓰겠다는 뜻
public class MemberService { // ** 서비스계층에서 레파지토리로 넘겨줄거임
    // ** 어떤 특정 변경 작업이 있
    // ** 변경, 삭제, 조회 이런 기능들이 서비스 계층에서 함

    @Autowired // ** 우리가 new를 할당해서 객체화 해주지 않았는데 Autorwired해주면 밑에 애가 MemberRepository를 인식을 함(객체인 상태(Bean 상태: 객체상태)로 맵핑이 된다라는 의미임)
    private MemberRepository memberRepository;
    // ** 레파지토리는 뭐가 필요할까?
    // ** 영속상태가 필요함
    // ** 그래서 엔티티매니저가 들어와야함


    public void insertMember(MemberDto dto){ // ** 오류나는거는 임폴트해주면 됨 / 클래스로 받아와야함
        memberRepository.insertMember(
                new Member(dto.getUserName()));

    }

    public List<Member> findAll(){
        return memberRepository.findAll();
    } // 홍길동을 검색했을 때 1명만 나오는게 아니라 여러명이 나올거기 때문에 이럴 땐 List로 받아야됨

    public List<Member> findName(MemberDto dto) { // ** dto로 받아서 name으로 검색하려고 만든거임
        return  memberRepository.findName(dto.getUserName());
    }

    public void deleteMember(String userName) {
        memberRepository.deleteMember(userName);
    }
}
