package com.system.eventSystem.Model;



import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@Entity
//@NoArgsConstructor

public class Event {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	private String name;
	private String mobNo;
	private String email;
	private String pass;
	private String confPass;
	private String userType;
	public Event(long id, String name, String mobNo, String email, String pass, String confPass, String userType) {
		super();
		this.id = id;
		this.name = name;
		this.mobNo = mobNo;
		this.email = email;
		this.pass = pass;
		this.confPass = confPass;
		this.userType = userType;
	}
	public Event() {
		super();
	}
	
	
	
		
}

