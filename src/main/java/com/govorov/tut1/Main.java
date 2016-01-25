package com.govorov.tut1;

import com.govorov.tut1.entity.User;
import com.govorov.tut1.service.UserService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

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
    }
}
