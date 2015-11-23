package org.exemple.ws;

import javax.jws.WebService;

@WebService
public class Salutation {
	private String message = "salut ! tu vas bien ? oui et toi ?";
	
	
	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {	
		this.message=this.message.concat(message);
	}
	
}
