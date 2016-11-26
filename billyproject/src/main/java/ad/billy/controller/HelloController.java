package ad.billy.controller;

import org.springframework.stereotype.Controller;

@Controller
public class HelloController {

	private String message = "Hola Mon MSG";

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}
	
}
