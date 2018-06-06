package ru.test;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class EventDAOImpl implements EventDAO {

    @Autowired
    SessionFactory sessionFactory;

    @Override
    public void addEvent(Event event) {
        Session session = sessionFactory.openSession();
        session.beginTransaction();
        session.saveOrUpdate(event);
        session.getTransaction().commit();
        session.close();
    }

    @Override
    public Event getEvent(Long id) {
        return sessionFactory.getCurrentSession().get(Event.class, id);
    }
}
