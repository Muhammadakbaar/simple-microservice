package com.sitamvan.school;

import com.sitamvan.school.client.StudentClient;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class SchoolService {

    private final SchoolRepository schoolRepository;
    private final StudentClient studentClient;

    public void saveSchool(School school){
        schoolRepository.save(school);
    }
    public List<School>findAllSchool(){
        return schoolRepository.findAll();
    }

    public FullSchollResponse finddSchoolsWithStudent(Integer schoolId) {
        var school = schoolRepository.findById(schoolId)
                .orElse(School.builder()
                        .name("NOT_FOUND")
                        .email("NOT_FOUND")
                        .build());
        var students = studentClient.findAllStudentsBySchool(schoolId);
        return FullSchollResponse.builder()
                .id(school.getId())
                .name(school.getName())
                .email(school.getName())
                .students(students)
                .build();
    }
}
