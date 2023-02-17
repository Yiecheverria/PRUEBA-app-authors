package com.distribuida.repository;

import com.distribuida.db.Authors;

import io.quarkus.hibernate.orm.panache.PanacheRepository;

import javax.enterprise.context.ApplicationScoped;

@ApplicationScoped
public class AuthorRepositoryImpl implements PanacheRepository<Authors> {
}
