package com.beekeeper.service.implementations;

import com.beekeeper.modules.dao.interfaces.UserDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.io.IOException;

@Service
public class DeleteService {
    @Autowired
    private UserDao userDao;

    @Transactional
    public void deleteUserById(long id) throws IOException {
        userDao.deleteItemById(id);
    }
}
