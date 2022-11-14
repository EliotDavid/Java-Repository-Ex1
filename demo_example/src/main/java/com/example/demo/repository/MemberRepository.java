package com.example.demo.repository;


import com.example.demo.domain.Member;
import com.example.demo.dto.MemberDto;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import javax.persistence.PersistenceContext;
import java.util.List;

@Repository
public class MemberRepository {
    @PersistenceContext
    private EntityManager em;

    public void insertMember(Member member)
    {
        em.persist(member);
    }

    public List<Member> findAll() {
        return em.createQuery("select m from Member m", Member.class)
                .getResultList();
    }

    public List<Member> findName(String username) {
        return em.createQuery("select m from Member m where m.username = :name", Member.class)
                .setParameter("name", username)
                .getResultList();
    }

    public void deleteMember(String username) {
        List<Member> members = findName(username);

        for(int i = 0 ; i < members.size() ; ++i) {
            em.remove(members.get(i));
        }
    }
}
