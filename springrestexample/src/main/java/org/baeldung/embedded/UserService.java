package org.baeldung.embedded;

import org.baeldung.embedded.domain.User;
import org.springframework.stereotype.Service;

@Service
public class UserService {
    
    public User getUser(String name) {
        User user = new User();
        user.setName(name);
        
        return user;
    }

}
