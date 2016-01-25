package com.govorov.tut1;

import com.govorov.tut1.entity.Car;
import com.govorov.tut1.entity.User;
import com.govorov.tut1.service.CarService;
import com.govorov.tut1.service.UserService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.List;

/**
 * @author Govorov Andrey
 */
public class Main {

    private static final Logger log = LoggerFactory.getLogger(Main.class);

    public static final void main(String[] args) {
        UserService service = new UserService();
        User user = service.getById(1L);

        if (user == null) {
            throw new RuntimeException("User not found!");
        }

        log.info("User name: {}", user);

        // Get list of all vehicles
        List<Car> cars = user.getCars();
        if (!cars.isEmpty()) {
            for(Car car : cars) {
                log.trace("Car: {}", car.toString());
            }
        }


//        Car car = new Car();
//        car.setVendor("Toyota");
//        car.setModel("Land Cruiser Prado");
//        car.setYear(2014);
//        car.setPrice(45000);
//        car.setOwner(user.getId());

//        CarService carService = new CarService();
//        carService.add(car);
    }
}
