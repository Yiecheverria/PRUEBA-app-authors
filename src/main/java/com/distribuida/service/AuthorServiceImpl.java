package com.distribuida.service;

import com.distribuida.db.Authors;

import com.distribuida.repository.AuthorRepositoryImpl;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;
import javax.transaction.Transactional;
import java.util.List;

@ApplicationScoped
@Transactional
public class AuthorServiceImpl implements AuthorService {

    @Inject
    AuthorRepositoryImpl repository;

    @Override
    public List<Authors> findAll() {

        return repository.findAll().list();
    }

    @Override
    public Authors findById(Long id) {

        return repository.findById(id);
    }

    @Override
    public void save(Authors author) {

        repository.persistAndFlush(author);
    }

    @Override
    public void deleteById(Long id) {
        repository.deleteById(id);
    }

    @Override
    public void update(Long id, Authors author) {
        repository.update("UPDATE Author SET first_name = ?1, last_name = ?2 WHERE id = ?3",
                author.getFirstName(),
                author.getLastName(),
                id);
    }

}
