package com.beekeeper.modules.dao.implementation;

import com.beekeeper.modules.dao.interfaces.WorkingHoursDao;
import com.beekeeper.modules.domain.WorkingHours;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.hibernate.Criteria;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.criterion.Restrictions;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class WorkingHoursDBDao extends DBDao<WorkingHours> implements WorkingHoursDao {
    private static final Logger LOG = LogManager.getLogger(WorkingHoursDBDao.class);

    public boolean deleteItemById(long index) {
        return super.deleteItemById(WorkingHours.class, index);
    }

    public boolean update(WorkingHours module) {
        return super.update(module);
    }

    public boolean insert(WorkingHours module) {
        return super.insert(module);
    }

    public WorkingHours findById(long id) {
        return super.findById(WorkingHours.class, id);
    }

    public List<WorkingHours> findAll() {
        return super.findAll(WorkingHours.class);
    }

    public List<WorkingHours> findByUserName(Long id) {
        Session session = null;
        try {
            session = template.getSessionFactory().openSession();

            String hql = " from working_hours where user_id= :id" ;

            Query query = session.createQuery(hql).setParameter("id", id);

            return (List<WorkingHours>) query.list();

        } catch (Exception e) {
            throw LOG.throwing(new RuntimeException(e));
        } finally {
            session.close();
        }

    }
}
