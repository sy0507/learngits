package com.example.javademo.service;



import com.example.javademo.pojo.domain.Film;
import com.example.javademo.pojo.dto.Page;

import java.util.List;
public interface FilmService {
    List<Film> list(Page page);
}
