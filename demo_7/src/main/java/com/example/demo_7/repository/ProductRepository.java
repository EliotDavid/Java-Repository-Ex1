package com.example.demo_7.repository;


import com.example.demo_7.domain.ImageObject;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

//@RequiredArgsConstructor // 얘는 뭐하는 애냐면 final이 붙어 있거나 @NotNull이 붙어있는 필드값에 생성자를 자동으로 생성한다
@Repository
public class ProductRepository {

    @PersistenceContext
    private EntityManager em;

    public void save(ImageObject product) {
        em.persist(product);
    }
}
