package com.govorov.tut1.dao.impl;

import com.govorov.tut1.entity.Base;
import com.govorov.tut1.entity.User;
import com.govorov.tut1.utils.HibernateUtils;
import org.hibernate.Session;

import java.sql.SQLException;

/**
 * @author Govorov Andrey
 */
public class AbstractDAOImpl {

    public void add(Base entity) throws SQLException {
        Session session = HibernateUtils.getSessionFactory().openSession();
        session.beginTransaction();
        session.save(entity);
        session.getTransaction().commit();
        session.close();
    }

}
