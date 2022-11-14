package com.example.demo.dto;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.validation.constraints.NotEmpty;

@Getter @Setter
@NoArgsConstructor
public class MemberDto {
    @NotEmpty(message = "이름 입력은 필수사항 입니다.")
    private String username;

    public MemberDto(String username)
    {
        this.username = username;
    }
}
