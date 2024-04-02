package com.example.dockerapp.model;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class Test {
    private Integer id;
    private String name;
}
