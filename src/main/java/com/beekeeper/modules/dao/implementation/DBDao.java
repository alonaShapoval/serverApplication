package com.beekeeper.modules.dao.implementation;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.criterion.DetachedCriteria;
import org.hibernate.criterion.Restrictions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate4.HibernateTemplate;

import java.util.List;

public class DBDao<T> {
    private static final Logger LOG = LogManager.getLogger(DBDao.class);

    @Autowired
    protected HibernateTemplate template;

    protected boolean insert(T object) {
        template.save(object);

        return true;
    }

    protected T findById(Class object, long id) {
        Session session = null;
        try {
            session = template.getSessionFactory().openSession();

            Criteria criteria = session.createCriteria(object);
            criteria.add(Restrictions.eq("id", id));

            return (T) criteria.uniqueResult();

        } catch (Exception e) {
            throw LOG.throwing(new RuntimeException(e));
        } finally {
            session.close();
        }
    }

    protected List<T> findAll(Class object) {
        return (List<T>) template.findByCriteria(DetachedCriteria.forClass(object));
    }

    protected boolean update(T object) {
        template.update(object);

        return true;
    }

    protected boolean deleteItemById(Class object, long index) {
        Session session = null;
        try {
            session = template.getSessionFactory().openSession();

            String hql = "delete from " + object.getSimpleName().toLowerCase() + " as o where o.id = :id";
            session.createQuery(hql).setParameter("id", index).executeUpdate();


        } catch (Exception e) {
            throw LOG.throwing(new RuntimeException(e));
        } finally {
            session.close();
        }

        return true;
    }
}
