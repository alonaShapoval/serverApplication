package com.beekeeper.service.implementations;


import com.beekeeper.modules.dao.interfaces.*;
import com.beekeeper.modules.domain.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.io.IOException;

@Service
public class SaveService {
    @Autowired
    private UserDao userDao;
    @Autowired
    private TemperatureDao temperatureDao;
    @Autowired
    private HumidityDao humidityDao;
    @Autowired
    private OxygenDao oxygenDao;
    @Autowired
    private AmountDao amountDao;
    @Autowired
    private BeehiveDao beehiveDao;


    @Transactional
    public void saveNewUser(User user) throws IOException {
        userDao.insert(user);
    }
    @Transactional
    public void saveNewBeehive(Beehive beehive) throws IOException {
        beehiveDao.insert(beehive);
    }

    @Transactional
    public void saveNewTemperatureValue(Temperature temperature) throws IOException {
        temperatureDao.insert(temperature);
    }

    @Transactional
    public void saveNewHumidityValue(Humidity humidity) throws IOException {
        humidityDao.insert(humidity);
    }

    @Transactional
    public void saveNewOxygenValue(Oxygen oxygen) throws IOException {
        oxygenDao.insert(oxygen);
    }

    @Transactional
    public void saveNewAmountValue(Amount amount) throws IOException {
        amountDao.insert(amount);
    }

}
