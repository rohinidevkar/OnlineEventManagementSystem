package com.system.eventSystem.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.system.eventSystem.Model.CustomerPaymentList;

@Repository
public interface CustPaymentListRepo extends JpaRepository<CustomerPaymentList, Long> {

}
