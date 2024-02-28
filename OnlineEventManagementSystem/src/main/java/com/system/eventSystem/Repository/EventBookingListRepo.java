package com.system.eventSystem.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.system.eventSystem.Model.EventBookingList;

@Repository
public interface EventBookingListRepo extends JpaRepository<EventBookingList, Long>{

}
