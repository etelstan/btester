package btester.dao;

import btester.model.Test;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

/**
 * @author Yuri Yerokhin
 * @version 1.0
 * @since 24.11.2016
 */
@Repository
@Transactional
public class TestDao {

    @Autowired
    private SessionFactory sessionFactory;

    public Test get(Long id) {
        return sessionFactory.getCurrentSession().get(Test.class, id);
    }
}
