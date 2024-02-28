package com.system.eventSystem.EventDTO;

import lombok.Data;

@Data
public class PaymentDTO {
	private long id;
	private String cardNo;
	private String nameOnCard;
	private String expDate;
	private String totalPrice;
}
