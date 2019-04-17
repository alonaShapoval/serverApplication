package com.beekeeper.modules.dao.implementation;

import com.beekeeper.modules.dao.interfaces.BeehiveDao;
import com.beekeeper.modules.domain.Beehive;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class BeehiveDBDao extends DBDao<Beehive> implements BeehiveDao {
    public boolean deleteItemById(long index) {
        return super.deleteItemById(Beehive.class, index);
    }

    public boolean update(Beehive module) {
        return super.update(module);
    }

    public boolean insert(Beehive module) {
        return super.insert(module);
    }

    public Beehive findById(long id) {
        return super.findById(Beehive.class, id);
    }

    public List<Beehive> findAll() {
        return super.findAll(Beehive.class);
    }
}
