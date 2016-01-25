package com.govorov.tut1.dao;

import com.govorov.tut1.entity.User;

import java.sql.SQLException;
import java.util.Collection;

/**
 * @author Govorov Andrey
 */
public interface UserDAO {

    void add(User user) throws SQLException;

    void update(Long userId, User user) throws SQLException;

    User findById(Long userId) throws SQLException;

    Collection getAllUsers() throws SQLException;

    boolean delete(Long userId) throws SQLException;

}
