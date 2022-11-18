package com.example.Homework_02.service;

import com.example.Homework_02.domain.Academy;
import com.example.Homework_02.domain.Student;
import com.example.Homework_02.dto.AcademyDto;
import com.example.Homework_02.dto.StudentDto;
import com.example.Homework_02.repository.RelationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;

@Transactional
@Service
public class RelationService {

    @Autowired
    private RelationRepository relationRepository;

    @Transactional
    public void saveStudentInfo(StudentDto dto){
        Student std = new Student(dto.getName(), dto.getAge(), dto.getTel(), dto.getEmail());
        relationRepository.insertStudentInfo(std);

    }

    @Transactional
    public void saveAcademyInfo(AcademyDto dto){
        Academy acd = new Academy(dto.getAcademyName());
        relationRepository.insertAcademyInfo(acd);

    }
}
