package org.baeldung.embedded;

import org.baeldung.embedded.domain.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {
    
    @Autowired
    UserService userService;

    @RequestMapping("/")
    public String welcome() {
        return "Hello World!";
    }

    @RequestMapping("/hello/{userName}")
    public User user(@PathVariable String userName) {
        return this.userService.getUser(userName);
    }
}
