package com.example.demo_7.domain;


import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;


@Getter
@NoArgsConstructor
@Entity
public class ImageObject { // 하나의 상품에 대한 게시물


    @Id @GeneratedValue
    private long id;

    private String filename;

    private String filepath;

    public ImageObject(String filename, String filepath){
        this.filename = filename; // ~.png라고 나오는 그 이름
        this.filepath = filepath; // 파일 경로 : 어디에 둘거냐는 의미
    }

}
