package com.beekeeper.modules.dao.implementation;

import com.beekeeper.modules.dao.interfaces.AmountDao;
import com.beekeeper.modules.domain.Amount;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class AmountDBDao extends DBDao<Amount> implements AmountDao {

    public boolean deleteItemById(long index) {
        return super.deleteItemById(Amount.class, index);
    }

    public boolean update(Amount module) {
        return super.update(module);
    }

    public boolean insert(Amount module) {
        return super.insert(module);
    }

    public Amount findById(long id) {
        return super.findById(Amount.class, id);
    }

    public List<Amount> findAll() {
        return super.findAll(Amount.class);
    }
}
