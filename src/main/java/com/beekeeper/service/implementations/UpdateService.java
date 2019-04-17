package com.beekeeper.service.implementations;

import com.beekeeper.modules.dao.interfaces.BeehiveDao;
import com.beekeeper.modules.dao.interfaces.UserDao;
import com.beekeeper.modules.domain.Beehive;
import com.beekeeper.modules.domain.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.io.IOException;

@Service
public class UpdateService {
    @Autowired
    private UserDao userDao;
@Autowired
private BeehiveDao beehiveDao;

    @Transactional
    public void updateUser(User user) throws IOException {
        userDao.update(user);
    }
    @Transactional
    public void updateBeehive(Beehive beehive) throws IOException {
        beehiveDao.update(beehive);
    }

}
