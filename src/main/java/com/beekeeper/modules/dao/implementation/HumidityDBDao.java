package com.beekeeper.modules.dao.implementation;

import com.beekeeper.modules.dao.interfaces.HumidityDao;
import com.beekeeper.modules.domain.Humidity;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class HumidityDBDao extends DBDao<Humidity> implements HumidityDao {
    public boolean deleteItemById(long index) {
        return super.deleteItemById(Humidity.class, index);
    }

    public boolean update(Humidity module) {
        return super.update(module);
    }

    public boolean insert(Humidity module) {
        return super.insert(module);
    }

    public Humidity findById(long id) {
        return super.findById(Humidity.class, id);
    }

    public List<Humidity> findAll() {
        return super.findAll(Humidity.class);
    }
}
