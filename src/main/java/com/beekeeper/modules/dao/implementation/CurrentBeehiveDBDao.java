package com.beekeeper.modules.dao.implementation;

import com.beekeeper.modules.dao.interfaces.CurrentBeehiveDao;
import com.beekeeper.modules.domain.CurrentBeehive;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class CurrentBeehiveDBDao extends DBDao<CurrentBeehive> implements CurrentBeehiveDao {
    public boolean deleteItemById(long index) {
        return super.deleteItemById(CurrentBeehive.class, index);
    }

    public boolean update(CurrentBeehive module) {
        return super.update(module);
    }

    public boolean insert(CurrentBeehive module) {
        return super.insert(module);
    }

    public CurrentBeehive findById(long id) {
        return super.findById(CurrentBeehive.class, id);
    }

    public List<CurrentBeehive> findAll() {
        return super.findAll(CurrentBeehive.class);
    }
}
