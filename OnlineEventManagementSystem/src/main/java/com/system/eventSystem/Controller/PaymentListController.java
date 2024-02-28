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
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.system.eventSystem.Model.CustomerPaymentList;
import com.system.eventSystem.Model.EventBookingList;
import com.system.eventSystem.Service.EventService;
import com.system.eventSystem.Service.PaymentListService;

@Controller
public class PaymentListController {
	@Autowired
    private PaymentListService plService;
	
	
	@GetMapping("/TransactionList")
	public ModelAndView CustomerPaymentList() {
		List<CustomerPaymentList> list = plService.getAllPaymentList();
		ModelAndView mv = new ModelAndView();
		mv.setViewName("TransactionList");
		mv.addObject("TransactionList", list);
		return mv;
	}
	@PostMapping("/book2")
	public String bookEvent(@ModelAttribute CustomerPaymentList eventList) {
		plService.savePaymentList(eventList);
		return "redirect:/TransactionList";
	}
	
	@RequestMapping("/deletePayment/{id}")
    public String deletePaymentList(@PathVariable("id") long id) 
    {
		plService.deleteById(id);
    	return "redirect:/TransactionList";
    }
	
	@RequestMapping("/editPayment/{id}")
    public String editList(@PathVariable("id") long id, Model model) {
		CustomerPaymentList s = plService.editList(id);

//        if (s != null) {
//            model.addAttribute("edit", s);
//        }
		model.addAttribute("ex", s);
        return "payment";
    }

}
