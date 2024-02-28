package com.system.eventSystem.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.system.eventSystem.Model.Event;
import com.system.eventSystem.Model.EventBookingList;
import com.system.eventSystem.Service.EventListService;


@Controller
public class EventBookingListController {
	@Autowired
    private EventListService eList;
	
//	@GetMapping("/eventBookingList")
//	public String eventBookingList() {
//		return "eventBookingList";
//	}
//	
	@GetMapping("/eventBookingList")
	public ModelAndView EventBookingList() {
		List<EventBookingList> list = eList.getAllEvents();
		ModelAndView m = new ModelAndView();
		m.setViewName("eventBookingList");
		m.addObject("eventBookingList", list);
		return m;
	}
	@PostMapping("/book1")
	public String bookEvent(@ModelAttribute EventBookingList eventList) {
		eList.saveMyEventBookingList(eventList);
		return "redirect:/payment";
	}
	@RequestMapping("/deleteEvent/{id}")
    public String deleteMyList(@PathVariable("id") long id) 
    {
		eList.deleteById(id);
    	return "redirect:/eventBookingList";
    }
	
	@RequestMapping("/editEvent/{id}")
    public String editList(@PathVariable("id") int id, Model model) {
        EventBookingList s = eList.editList(id);
        model.addAttribute("ed", s);
        return "bookEvent";
    }
	
	
}
