package com.distribuida.service;

import com.distribuida.db.Authors;


import java.util.List;

public interface AuthorService {

    List<Authors> findAll();
    Authors findById(Long id);
    void save(Authors author);
    void deleteById(Long id);
    void update(Long id, Authors author);

}

