package com.system.eventSystem.ServiceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.system.eventSystem.Model.CustomerPaymentList;
import com.system.eventSystem.Model.EventBookingList;
import com.system.eventSystem.Repository.CustPaymentListRepo;
import com.system.eventSystem.Repository.EventBookingListRepo;
import com.system.eventSystem.Service.PaymentListService;

@Service
public class PaymentListServiceIMpl implements PaymentListService{
	@Autowired
	private CustPaymentListRepo cPLRepo;
	
	@Override
	public List<CustomerPaymentList> getAllPaymentList(){
		return cPLRepo.findAll();
	}
	@Override
	public void savePaymentList(CustomerPaymentList paymentList) {
		cPLRepo.save(paymentList);
	}
	@Override
	public void deleteById(long id) {
		// TODO Auto-generated method stub
		cPLRepo.deleteById(id);
	}
	@Override
	public CustomerPaymentList editList(long id) {
		// TODO Auto-generated method stub
		return cPLRepo.findById(id).get();
	}
}
