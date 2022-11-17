package com.example.Homework_02.service;

import com.example.Homework_02.domain.Academy;
import com.example.Homework_02.domain.Student;
import com.example.Homework_02.dto.AcademyDto;
import com.example.Homework_02.dto.StudentDto;
import com.example.Homework_02.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.ui.Model;

import javax.transaction.Transactional;

@Transactional
@Service
public class StudentService {

    @Autowired
    private StudentRepository studentRepository;

    @Transactional
    public void saveStudentInfo(StudentDto dto){
        Student std = new Student(dto.getName(), dto.getAge(), dto.getTel(), dto.getEmail());
        studentRepository.insertStudentInfo(std);

    }

    @Transactional
    public void saveAcademyInfo(AcademyDto dto){
        Academy acd = new Academy(dto.getAcademyName());
        studentRepository.insertAcademyInfo(acd);

    }
}
