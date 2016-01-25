package com.govorov.tut1.dao;

import java.util.List;

/**
 * @author Govorov Andrey
 */
public interface GenericDao<T> {

    T save(T entity);

    // Read
    T getByParameter(String param, String value);
    T getById(Long id);
    List<T> getAll();

    // Delete
    boolean delete(T entity);
}
