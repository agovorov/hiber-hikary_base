package com.govorov.tut1.dao;

import com.govorov.tut1.entity.Car;

import java.sql.SQLException;
import java.util.Collection;

/**
 * @author Govorov Andrey
 */
public interface CarDAO {
    void add(Car car) throws SQLException;

    void update(Long carId, Car car) throws SQLException;

    Car findById(Long carId) throws SQLException;

    Collection getAllCars() throws SQLException;

    Collection getAllCars(Long userId) throws SQLException;

    boolean delete(Long carId) throws SQLException;
}
