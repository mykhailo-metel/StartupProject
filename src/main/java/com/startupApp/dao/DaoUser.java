package com.startupApp.dao;

import com.startupApp.entities.User;

import java.util.List;

public interface DaoUser <U, T> {
    void insert(U u);
    U read(T t);
    U update(U u);
    void delete(T t);
    List<U> getAll();
}
