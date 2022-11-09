package com.example.demo_7.domain;


import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;


@Getter
@NoArgsConstructor
@Entity // 얘 자체가 데이터임 / 얘 자체가 DB임 / 얘 자체가 인스턴스임
public class ImageObject { // 하나의 상품에 대한 게시물


    @Id @GeneratedValue
    private long id;


    private String title;

    private String content;

    @Column(name = "FILENAME")
    private String filename;

    @Column(name = "FILEPATH")
    private String filepath;


    private int count; // +, -로 연산이 되어야 함

    private int price;



    public ImageObject(
            String title,
            String content,
            int count,
            int price,
            String filename,
            String filepath)
    {


        this.filename = filename; // ~.png라고 나오는 그 이름
        this.filepath = filepath; // 파일 경로 : 어디에 둘거냐는 의미

        this.title = title;
        this.content = content;
        this.count = count;
        this.price = price;
    }

}
