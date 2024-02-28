package com.system.eventSystem.Controller;

import java.util.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.system.eventSystem.Model.Event;
import com.system.eventSystem.Model.EventBookingList;
import com.system.eventSystem.Service.EventService;
import com.system.eventSystem.ServiceImpl.EventServiceImpl;

@Controller

public class EventController {
    @Autowired
    private EventService es;
 
	@GetMapping("/mainPage")
	public String mainPage(){
		return "mainPage";
	}
	@GetMapping("/register")
	public String register() {
		return "register";
	}
	@GetMapping("/login")
	public String login() {
		return "login";
	}
	@GetMapping("/addEvent")
	public String addEvent() {
		return "addEvent";
	}
	@GetMapping("/bookEvent")
	public String bookEvent() {
		return "bookEvent";
	}
	@GetMapping("/bookEventAdv")
	public String bookEventAdv() {
		return "bookEventAdv";
	}
	@GetMapping("/payment")
	public String payment() {
		return "payment";
	}
	@GetMapping("/userList")
    public ModelAndView getAllCustomer() {
        List<Event> list = es.getAllCustomer();
        ModelAndView m = new ModelAndView();
        m.setViewName("userList");
        m.addObject("events", list);
//        m.addObject("editEvent",new Event());
        return m;
    }
	@PostMapping("/login")
	public String processLogin(@ModelAttribute Event e) {
		es.save(e);
		return "redirect:/login";
	}
	@PostMapping("/open")
	public String bookEventAdv(@ModelAttribute Event e) {
		//es.save(e);
		return "redirect:/bookEventAdv";
	}
	@PostMapping("/book")
	public String bookEvent(@ModelAttribute Event e) {
		es.save(e);
		return "redirect:/payment";
	}

	@RequestMapping("/deleteBook/{id}")
    public String deleteMyList(@PathVariable("id") int id) 
    {
    	es.deleteById(id);
    	return "redirect:/userList";
    }
	
	@RequestMapping("/editBook/{id}")
	public String editList(@PathVariable ("id") int id, Model model) {
      Event e = es.editList(id);
      model.addAttribute("edit", e);
      return "register";
	}
	
}
