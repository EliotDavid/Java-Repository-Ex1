package com.example.demo_6.dto;


import com.example.demo_6.domain.Member;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.Setter;

import javax.validation.constraints.NotEmpty;

@Getter @Setter
@NoArgsConstructor
public class MemberDto {


    //@NotEmpty(message = "이름 입력은 필수사항 입니다") // ** 이름입력은 필수사항이라고 반드시 채워넣어주라고 하는 기능
    @NonNull
    private String userName;

    public MemberDto(String userName){
        this.userName = userName;
    }
}
