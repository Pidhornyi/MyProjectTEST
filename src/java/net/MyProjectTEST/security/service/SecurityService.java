package net.MyProjectTEST.security.service;

/**
 *  Service for Security.
 *  @author pidhornyi
 *  @version 1.0
 */
public interface SecurityService {

    String findLoggedInUsername();
    void autoLogin(String username, String password);
}
