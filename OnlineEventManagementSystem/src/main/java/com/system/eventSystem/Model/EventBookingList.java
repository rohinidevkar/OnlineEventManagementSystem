package com.system.eventSystem.Model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@Table(name = "EventBookingList")
//@AllArgsConstructor
@NoArgsConstructor
public class EventBookingList {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	
	private long id;
	private String eventType;
	private String eventVenue;
	private String eventPrice;
	private String bookingDate;
	private String eventName;
	private String custEmail;
	private String mobNo;
	private int numOfTickets;
	public EventBookingList(long id, String eventType, String eventVenue, String eventPrice, String bookingDate,
			String eventName, String custEmail, String mobNo, int numOfTickets) {
		super();
		this.id = id;
		this.eventType = eventType;
		this.eventVenue = eventVenue;
		this.eventPrice = eventPrice;
		this.bookingDate = bookingDate;
		this.eventName = eventName;
		this.custEmail = custEmail;
		this.mobNo = mobNo;
		this.numOfTickets = numOfTickets;
	}
	
	
	
}
