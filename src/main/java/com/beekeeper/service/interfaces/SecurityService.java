package com.beekeeper.service.interfaces;

public interface SecurityService {
    String findLoggedInUsername();

    void autoLogin(String username, String password);
}
