package com.beekeeper.modules.dao.implementation;

import com.beekeeper.modules.dao.interfaces.OxygenDao;
import com.beekeeper.modules.domain.Oxygen;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class OxygenDBDao extends DBDao<Oxygen> implements OxygenDao {
    public boolean deleteItemById(long index) {
        return super.deleteItemById(Oxygen.class, index);
    }

    public boolean update(Oxygen module) {
        return super.update(module);
    }

    public boolean insert(Oxygen module) {
        return super.insert(module);
    }

    public Oxygen findById(long id) {
        return super.findById(Oxygen.class, id);
    }

    public List<Oxygen> findAll() {
        return super.findAll(Oxygen.class);
    }
}
