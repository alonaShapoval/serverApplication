package com.beekeeper.modules.dao.interfaces;

import com.beekeeper.modules.domain.User;

import java.util.List;

public interface UserDao extends BaseDao<User> {

    User getUserByLoginAndPassword(String login, String password);

    List<User> getByRole(String role);

    User findByLogin(String login);
}
