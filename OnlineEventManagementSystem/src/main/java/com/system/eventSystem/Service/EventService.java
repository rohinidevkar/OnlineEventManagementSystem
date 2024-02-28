package com.system.eventSystem.Service;

import java.util.List;

import com.system.eventSystem.Model.Event;

public interface EventService {
	Event create(Event e);
	List<Event> getAllCustomer();
	Event save(Event e);
	void deleteById(long id);
	Event editList(long id);

}
