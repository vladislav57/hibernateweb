package ru.test;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EventServiceImpl implements EventSerive{

    @Autowired
    private EventDAO eventDAO;

    @Override
    public void addEvent(Event event) {
        eventDAO.addEvent(event);
    }

    @Override
    public Event getEvent(Long id) {
        return eventDAO.getEvent(id);
    }
}
