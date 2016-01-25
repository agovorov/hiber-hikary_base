package com.govorov.tut1.service;

import com.govorov.tut1.dao.CarDAO;
import com.govorov.tut1.dao.impl.CarDAOImpl;
import com.govorov.tut1.entity.Car;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.sql.SQLException;

/**
 * @author Govorov Andrey
 */
public class CarService {

    private static final Logger log = LoggerFactory.getLogger(CarService.class);

    public boolean add(Car car) {
        CarDAO dao = new CarDAOImpl();
        try {
            dao.add(car);
        } catch (SQLException e) {
            log.error("Unable to add car", e);
            return false;
        }
        return true;
    }

    public Car getById(Long id) {
        Car car = null;
        CarDAO dao = new CarDAOImpl();
        try {
            car = dao.findById(id);
        } catch (SQLException e) {
            log.error("Unable to find");
            return null;
        }
        return car;
    }

}
