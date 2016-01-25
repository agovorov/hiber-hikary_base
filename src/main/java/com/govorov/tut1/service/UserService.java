package com.govorov.tut1.service;

import com.govorov.tut1.dao.DaoFactory;
import com.govorov.tut1.dao.UserDAO;
import com.govorov.tut1.dao.impl.UserDAOImpl;
import com.govorov.tut1.entity.User;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.sql.SQLException;

/**
 * @author Govorov Andrey
 */
public class UserService {

    private static final Logger log = LoggerFactory.getLogger(UserService.class);


    public boolean add(User user) {
        DaoFactory factory = DaoFactory.getInstance();
        UserDAO dao = factory.getDao(UserDAO.class);
//        UserDAO dao = new UserDAOImpl();
        try {
            dao.add(user);
        } catch (SQLException e) {
            log.error("Unable to add user", e);
            return false;
        }
        return true;
    }

    public User getById(Long id) {
        User user = null;
        UserDAO dao = new UserDAOImpl();
        try {
            user = dao.findById(id);
        } catch (SQLException e) {
            log.error("Unable to find");
            return null;
        }
        return user;
    }
}
