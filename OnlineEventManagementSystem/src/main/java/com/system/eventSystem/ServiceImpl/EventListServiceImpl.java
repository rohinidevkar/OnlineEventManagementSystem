package com.system.eventSystem.ServiceImpl;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.system.eventSystem.Model.Event;
import com.system.eventSystem.Model.EventBookingList;
import com.system.eventSystem.Repository.EventBookingListRepo;
import com.system.eventSystem.Service.EventListService;

@Service
public class EventListServiceImpl implements EventListService {
	@Autowired
	private EventBookingListRepo eListRepo;
	@Override
	public List<EventBookingList> getAllEvents(){
		return eListRepo.findAll();
	}
	@Override
	public void saveMyEventBookingList(EventBookingList eventList) {
		eListRepo.save(eventList);
	}
	@Override
	public void deleteById(long id) {
		// TODO Auto-generated method stub
		eListRepo.deleteById(id);
	}
	@Override
	public EventBookingList editList(long id) {
		// TODO Auto-generated method stub
		return eListRepo.findById(id).get();
	}
}
