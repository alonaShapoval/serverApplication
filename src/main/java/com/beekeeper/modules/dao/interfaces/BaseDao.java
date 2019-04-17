package com.beekeeper.modules.dao.interfaces;

import java.util.List;

public interface BaseDao<T> {

    boolean deleteItemById(long index);

    boolean update(T module);

    boolean insert(T module);

    T findById(long id);

    List<T> findAll();
}
