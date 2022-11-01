package com.example.demo_6.dto;


import com.example.demo_6.domain.Member;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.Setter;

@Getter @Setter
@NoArgsConstructor
public class MemberDto {

    @NonNull
    private String userName;

    public MemberDto(String userName){
        this.userName = userName;
    }
}
