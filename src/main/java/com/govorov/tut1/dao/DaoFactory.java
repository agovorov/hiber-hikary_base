package com.govorov.tut1.dao;

import com.govorov.tut1.dao.impl.JdbcDaoFactory;

/**
 * @author Govorov Andrey
 */
public abstract class DaoFactory {

    public static DaoFactory getInstance() {
        return new JdbcDaoFactory();
    }

    public abstract <T extends GenericDao> T getDao(Class<T> clazz);


}
