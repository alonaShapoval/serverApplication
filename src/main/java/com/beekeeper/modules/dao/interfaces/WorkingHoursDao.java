package com.beekeeper.modules.dao.interfaces;

import com.beekeeper.modules.domain.WorkingHours;

import java.util.List;

public interface WorkingHoursDao extends BaseDao<WorkingHours> {
    List<WorkingHours> findByUserName(Long id);

}
