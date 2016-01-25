package com.govorov.tut1.dao.impl;

import com.govorov.tut1.dao.DaoFactory;
import com.govorov.tut1.dao.GenericDao;

/**
 * @author Govorov Andrey
 */
public class JdbcDaoFactory extends DaoFactory {

    public static final String DAO_PACKAGE_PATH = "com.epam.ag.dao.impl";

    @Override
    public <T extends GenericDao> T getDao(Class<T> clazz) {
        //
        // TODO пакет можно положить в пропертя и читать оттуда
        //
        String daoClassName = DAO_PACKAGE_PATH + ".Jdbc" + clazz.getSimpleName();
        GenericDao dao = null;
        try {
            log.trace("Trying to create DAO instance ({})", daoClassName);
            Class c = Class.forName(daoClassName);

            // Looking for constructor with 'Connection' class as parameter
            dao = (T) c.getDeclaredConstructor(Connection.class).newInstance(connection);
            log.trace("Created DAO: {}", dao);
        } catch (ClassNotFoundException | NoSuchMethodException | IllegalAccessException | InstantiationException | InvocationTargetException e) {
            log.error("Unable to create DAO instance {}", daoClassName, e);
            throw new RuntimeException("Unable to create/find DAO instance", e);
        }

        log.trace("DAO successfully created ({})", daoClassName);
        return (T) dao;
    }
}
