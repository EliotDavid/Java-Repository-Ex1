package com.example.demo.relation.view.member.dto;

import com.example.demo.relation.domain.academy.Academy;
import lombok.Data;


@Data
public class MemberDto {

    private String memberName;

    private Academy academy;
}
