package com.govorov.tut1.dao.impl;

import com.govorov.tut1.dao.CarDAO;
import com.govorov.tut1.entity.Car;

import java.sql.SQLException;
import java.util.Collection;

/**
 * @author Govorov Andrey
 */
public class CarDAOImpl extends AbstractDAOImpl implements CarDAO {

    public void add(Car car) throws SQLException {
        super.add(car);
    }

    public void update(Long carId, Car car) throws SQLException {

    }

    public Car findById(Long carId) throws SQLException {
        return null;
    }

    public Collection getAllCars() throws SQLException {
        return null;
    }

    public Collection getAllCars(Long carId) throws SQLException {
        return null;
    }

    public boolean delete(Long carId) throws SQLException {
        return false;
    }
}
