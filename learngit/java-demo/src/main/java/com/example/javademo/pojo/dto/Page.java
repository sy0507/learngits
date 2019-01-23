package com.example.javademo.pojo.dto;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Page {
    private Integer pageSize;
    private Integer page;
    private String sort = "ASC";
}
