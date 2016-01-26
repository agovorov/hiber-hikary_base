package com.govorov.tut1.dao.impl;

import com.govorov.tut1.dao.UserDAO;
import com.govorov.tut1.entity.User;
import com.govorov.tut1.utils.HibernateUtils;
import org.hibernate.Session;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.sql.SQLException;
import java.util.Collection;
import java.util.List;

/**
 * @author Govorov Andrey
 */
public class UserDAOImpl extends AbstractDAOImpl implements UserDAO {

    private static final Logger log = LoggerFactory.getLogger(UserDAOImpl.class);

    public void add(User user) throws SQLException {
        super.add(user);
    }

    public void update(Long userId, User user) throws SQLException {

    }

    public User findById(Long userId) throws SQLException {
        Session session = HibernateUtils.getSessionFactory().openSession();
        User user = (User) session.get(User.class, userId);

//        user.getCars();
//        log.warn("User: {}", user);
        session.close();
        return user;
    }

    public Collection getAllUsers() throws SQLException {
        Session session = HibernateUtils.getSessionFactory().openSession();
        session.beginTransaction();

        @SuppressWarnings("unchecked")
        List<User> users = (List<User>) session.createQuery(
                "FROM User u ORDER BY u.firstname"
        ).list();

        session.getTransaction().commit();
        session.close();
        return users;
    }

    public boolean delete(Long userId) throws SQLException {
        return false;
    }
}
