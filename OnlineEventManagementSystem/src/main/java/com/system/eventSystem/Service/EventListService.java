package com.system.eventSystem.Service;

import java.util.List;

import com.system.eventSystem.Model.Event;
import com.system.eventSystem.Model.EventBookingList;

public interface EventListService {

	List<EventBookingList> getAllEvents();
	void saveMyEventBookingList(EventBookingList eventList);
	void deleteById(long id);
	EventBookingList editList(long id);
}
