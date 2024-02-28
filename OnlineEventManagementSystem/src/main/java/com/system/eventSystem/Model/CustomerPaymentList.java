package com.system.eventSystem.Model;



import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@NoArgsConstructor
//@AllArgsConstructor

public class CustomerPaymentList {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	private String cardNo;
	private String nameOnCard;
	private String expDate;
	private String totalPrice;
	public CustomerPaymentList(long id, String cardNo, String nameOnCard, String expDate, String totalPrice) {
		super();
		this.id = id;
		this.cardNo = cardNo;
		this.nameOnCard = nameOnCard;
		this.expDate = expDate;
		this.totalPrice = totalPrice;
	}
	
	
	
}
