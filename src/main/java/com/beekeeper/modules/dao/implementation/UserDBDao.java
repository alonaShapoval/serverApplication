package com.beekeeper.modules.dao.implementation;

import com.beekeeper.modules.dao.interfaces.UserDao;
import com.beekeeper.modules.domain.User;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.criterion.Restrictions;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class UserDBDao extends DBDao<User> implements UserDao {
    private static final Logger LOG = LogManager.getLogger(UserDBDao.class);


    public boolean deleteItemById(long index) {
        return super.deleteItemById(User.class, index);
    }

    @Override
    public boolean update(User module) {
        return super.update(module);
    }

    @Override
    public boolean insert(User module) {
        return super.insert(module);
    }


    public User getUserByLoginAndPassword(String login, String password) {
        Session session = null;
        try {
            session = template.getSessionFactory().openSession();

            Criteria criteria = session.createCriteria(User.class);
            criteria.add(Restrictions.eq("user.email", login));
            criteria.add(Restrictions.eq("user.password", password));

            return (User) criteria.uniqueResult();

        } catch (Exception e) {
            throw LOG.throwing(new RuntimeException(e));
        } finally {
            session.close();
        }
    }


    public List<User> getByRole(String role) {

        return (List<User>) template.find(
                "select u from user u join u.role r where r.name = ?", role);
    }

    public User findByLogin(String login) {
        Session session = null;
        try {
            session = template.getSessionFactory().openSession();

            Criteria criteria = session.createCriteria(User.class);
            criteria.add(Restrictions.eq("login", login));

            return (User) criteria.uniqueResult();

        } catch (Exception e) {
            throw LOG.throwing(new RuntimeException(e));
        } finally {
            session.close();
        }
    }

    public User findById(long id) {
        return super.findById(User.class, id);
    }


    public List<User> findAll() {
        return super.findAll(User.class);
    }
}
