package com.beekeeper.modules.dao.implementation;

import com.beekeeper.modules.dao.interfaces.RoleDao;
import com.beekeeper.modules.domain.Role;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.criterion.Restrictions;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class RoleDBDao extends DBDao<Role> implements RoleDao {
    private static final Logger LOG = LogManager.getLogger(RoleDBDao.class);
    public boolean deleteItemById(long index) {
        return super.deleteItemById(Role.class, index);
    }

    public boolean update(Role module) {
        return super.update(module);
    }

    public boolean insert(Role module) {
        return super.insert(module);
    }

    public Role findById(long id) {
        return super.findById(Role.class, id);
    }

    public List<Role> findAll() {
        return super.findAll(Role.class);
    }

    public Role findByName(String name) {
        Session session = null;
        try {
            session = template.getSessionFactory().openSession();

            Criteria criteria = session.createCriteria(Role.class);
            criteria.add(Restrictions.eq("name", name));

            return (Role) criteria.uniqueResult();

        } catch (Exception e) {
            throw LOG.throwing(new RuntimeException(e));
        } finally {
            session.close();
        }
    }
}
