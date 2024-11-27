package com.sitamvan.student;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class StudentService {

    private final StudentRepository studentRepository;

    public void saveStudent(Student student){
        studentRepository.save(student);
    }
    public List<Student>findAllStudent(){
        return studentRepository.findAll();
    }

    public List<Student> findAllStudentBySchool(Integer schoolId) {
        return studentRepository.findAllBySchoolId(schoolId);
    }
}
