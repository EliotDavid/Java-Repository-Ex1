package com.example.demo.relation.domain.academy;

import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;
import java.util.List;

@Repository
public class AcademyRepository {

    @PersistenceContext
    private EntityManager em; // ** 멤버 레파지토리에서 쓰이는 엔티티매니저나 똑같은 애임
                              // ** 왜 나누나면 헷갈릴까봐 나눈다고 함
                              // ** 나중에 합칠거라고 함

    // 사실 얘는 save는 필요없음
    public Academy findById(Long id){
        return em.find(Academy.class, id);
    }

    public List <Academy> findAll(){
        return em.createQuery("select a from Academy a").getResultList();
    }

    
    // ** 이름으로 찾는 건 보류함
    //public List <Academy> findByName(String academyName){

        //return em.createQuery("select m from Member m where m.academy.academy_id.academy_name = :name", Academy.class)
                //.setParameter("name", academyName)
                //.getResultList(); // ** 찾으면 반환해
    //}
}
