package com.beekeeper.modules.dao.interfaces;

import com.beekeeper.modules.domain.Role;

public interface RoleDao extends BaseDao<Role> {
    Role findByName(String name);
}
