package com.system.eventSystem.EventDTO;

import lombok.Data;

@Data
public class EventDTO {
	private long id;
	private String name;
	private int mobNo;
	private String email;
	private String pass;
	private String confPass;

}
