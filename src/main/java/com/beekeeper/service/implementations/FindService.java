package com.beekeeper.service.implementations;

import com.beekeeper.modules.dao.interfaces.*;
import com.beekeeper.modules.domain.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.io.IOException;
import java.util.List;

@Service
public class FindService {
    @Autowired
    private UserDao userDao;
    @Autowired
    private RoleDao roleDao;
    @Autowired
    private WorkingHoursDao workingHoursDao;
    @Autowired
    private BeehiveDao beehiveDao;
    @Autowired
    private TemperatureDao temperatureDao;
    @Autowired
    private HumidityDao humidityDao;
    @Autowired
    private OxygenDao oxygenDao;
    @Autowired
    private AmountDao amountDao;


    public User getUserById(long id) throws IOException {
        return userDao.findById(id);
    }

    public List<User> getListUserByRole(String role) throws IOException {
        return userDao.getByRole(role);
    }

    public List<Role> getListRole() throws IOException {
        return roleDao.findAll();
    }

    public User getUserByLoginAndPassword(String login, String password) throws IOException {
        return userDao.getUserByLoginAndPassword(login, password);
    }

    public List<WorkingHours> getWorkingHoursByUserName(Long name) throws IOException {
        return workingHoursDao.findByUserName(name);
    }
    public Beehive getBeehiveById(long id) throws IOException {
        return beehiveDao.findById(id);
    }
    public Temperature getTemperatureById(long id) throws IOException {
        return temperatureDao.findById(id);
    }
    public Humidity getHumidityById(long id) throws IOException {
        return humidityDao.findById(id);
    }
    public Oxygen getOxygenById(long id) throws IOException {
        return oxygenDao.findById(id);
    }
    public Amount getAmountById(long id) throws IOException {
        return amountDao.findById(id);
    }

}
