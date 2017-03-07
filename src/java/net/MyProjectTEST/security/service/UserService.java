package net.MyProjectTEST.security.service;

import net.MyProjectTEST.security.model.User;

/**
 * Service class fot {@link net.MyProjectTEST.security.model.User}
 * @author pidhornyi
 * @version 1.0
 */
public interface UserService {
    void save(User user);
    User findByUsername(String username);

}
