package com.system.eventSystem.EventDTO;

import lombok.Data;

@Data
public class EventBookingListDTO {
	private long id;
	private String eventType;
	private String eventVenue;
	private String eventPrice;
	private String bookingDate;
	private String eventName;
	private String custEmail;
	private String mobNo;
	private int numOfTickets;
}
