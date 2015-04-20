package in.showoffs.medstore.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RequestPath {

	@RequestMapping("/")
	  public String hello() {
	    return "Hello World!";
	  }
	
	@RequestMapping("/santa")
	public String saySanta(){
		return "This is santa Test";
	}
}
