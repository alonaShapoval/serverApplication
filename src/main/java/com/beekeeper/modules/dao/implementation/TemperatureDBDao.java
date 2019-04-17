package com.beekeeper.modules.dao.implementation;

import com.beekeeper.modules.dao.interfaces.TemperatureDao;
import com.beekeeper.modules.domain.Temperature;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class TemperatureDBDao extends DBDao<Temperature> implements TemperatureDao {
    public boolean deleteItemById(long index) {
        return super.deleteItemById(Temperature.class, index);
    }

    public boolean update(Temperature module) {
        return super.update(module);
    }

    public boolean insert(Temperature module) {
        return super.insert(module);
    }

    public Temperature findById(long id) {
        return super.findById(Temperature.class, id);
    }

    public List<Temperature> findAll() {
        return super.findAll(Temperature.class);
    }
}
