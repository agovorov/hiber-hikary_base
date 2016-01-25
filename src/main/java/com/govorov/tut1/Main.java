package com.govorov.tut1;

import com.govorov.tut1.dao.UserDAO;
import com.govorov.tut1.dao.impl.UserDAOImpl;
import com.govorov.tut1.entity.User;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.sql.SQLException;
import java.util.Collection;
import java.util.List;

/**
 * @author Govorov Andrey
 */
public class Main {

    private static final Logger log = LoggerFactory.getLogger(Main.class);

    public static final void main(String[] args) {

//        User user = new User();
//        user.setFirstname("Andrey");
//        user.setLastname("Govorov");
//        user.setEmail("thegovorovs@gmail.com");
//        user.setPassword("password");
//
//        log.info("User: {}", user);

        UserDAO dao = new UserDAOImpl();
//        try {
//            dao.add(user);
//        } catch (SQLException e) {
//
//        }


        Collection list = null;
        try {
            list = dao.getAllUsers();
        } catch (SQLException e) {
            e.printStackTrace();
        }

        if (!list.isEmpty()) {
            for(User u : (List<User>)list) {
                log.info("User: {}", u);
            }
        }
        log.info("{}", list);



//        UserDAO dao =



//        DriverDAO driverDAO = Factory.getInstance().getDriverDAO();
//        Driver driver = driverDAO.getDriverById(1L);
//        log.trace("Driver name: {}", driver.getName());
    }
}
