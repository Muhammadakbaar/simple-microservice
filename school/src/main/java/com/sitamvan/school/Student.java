package com.sitamvan.school;

import lombok.*;
import org.springframework.web.bind.annotation.GetMapping;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Student {

    private Integer id;
    private String firstname;
    private String lastname;
    private String email;
}
