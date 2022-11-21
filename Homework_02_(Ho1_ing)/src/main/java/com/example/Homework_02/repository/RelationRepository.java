package com.example.Homework_02.repository;

import com.example.Homework_02.domain.Academy;
import com.example.Homework_02.domain.Student;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

@Repository
public class RelationRepository {

    @PersistenceContext // ** 얘는 무조건 있어야함
    private EntityManager em;

    public void insertStudentInfo(Student std){
        em.persist(std);
    }

    public void insertAcademyInfo(Academy acd){
        em.persist(acd);
    }
}
