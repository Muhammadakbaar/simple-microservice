package com.sitamvan.school;

import lombok.*;

import java.util.List;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class FullSchollResponse {

    private Integer id;
    private String name;
    private String email;
    List<Student> students;
}
