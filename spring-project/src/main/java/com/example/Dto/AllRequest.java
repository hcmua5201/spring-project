package com.example.Dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class AllRequest {
    private Integer id;
    private String className;
    private String studentNumber;
    private String name;
}
