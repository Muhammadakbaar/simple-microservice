package com.sitamvan.school;

import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/schools")
@RequiredArgsConstructor
public class SchoolController {

    private final SchoolService schoolService;

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public void save(
            @RequestBody School school
    ){
        schoolService.saveSchool(school);
    }
    @GetMapping
    public ResponseEntity<List<School>> findAllStudents(){
        return ResponseEntity.ok(schoolService.findAllSchool());
    }
    @GetMapping("/with-students/{school-id}")
    public ResponseEntity<FullSchollResponse> findAllSchool(
            @PathVariable("school-id") Integer schoolId
    ){
        return ResponseEntity.ok(schoolService.finddSchoolsWithStudent(schoolId));
    }

}
