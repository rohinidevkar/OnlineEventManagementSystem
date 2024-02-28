package com.system.eventSystem.ServiceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.system.eventSystem.Model.Event;
import com.system.eventSystem.Repository.EventRepository;
import com.system.eventSystem.Service.EventService;
@Service
public class EventServiceImpl implements EventService{
	@Autowired
	private EventRepository eRepo;
	@Override
	public Event create(Event e) {
		// TODO Auto-generated method stub
		return eRepo.save(e);
	}
	public List<Event> getAllEvents(){
		return eRepo.findAll();
	}
	public Event getEventById(long id) {
		return eRepo.findById(id).get();        
	}
	//@Override
    public List<Event> getAllCustomer() {
    	 List<Event> users = eRepo.findAll();
    	    System.out.println("Retrieved customers: " + users);
    	    return users;
    }
	
	@Override
		public void deleteById(long id) {
			// TODO Auto-generated method stub
			eRepo.deleteById(id);
		}
	
	@Override
	public Event save(Event e) {
		// TODO Auto-generated method stub
		return eRepo.save(e);
	}
	@Override
	public Event editList(long id) {
		// TODO Auto-generated method stub
		return eRepo.findById(id).get();
	}
}












































//package com.system.eventSystem.Service;
//
//import java.util.List;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Service;
//import org.springframework.ui.Model;
//
//import com.system.eventSystem.Model.Event;
//import com.system.eventSystem.Repository.EventRepository;
//
//
//@Service
//public abstract class EventService {
//	
//	Event create(Event e);
//	@Autowired
//	private EventRepository eRepo;
//	//List<Event> getAllCustomer();
//	
//	public void save(Event e) {
//		eRepo.save(e);
//	}
//	public List<Event> getAllEvents(){
//		return eRepo.findAll();
//	}
//	public Event getEventById(int id) {
//		return eRepo.findById(id).get();        
//	}
//	//@Override
//    public List<Event> getAllCustomer() {
//    	 List<Event> users = eRepo.findAll();
//    	    System.out.println("Retrieved customers: " + users);
//    	    return users;
//    }
//	
//}