package com.system.eventSystem.Service;

import java.util.List;

import com.system.eventSystem.Model.CustomerPaymentList;

public interface PaymentListService {

	List<CustomerPaymentList> getAllPaymentList();

	void savePaymentList(CustomerPaymentList paymentList);

	void deleteById(long id);

	CustomerPaymentList editList(long id);

}
