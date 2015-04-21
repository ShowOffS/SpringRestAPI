package in.showoffs.medstore.controllers;

import java.util.List;

import in.showoffs.medstore.domain.Users;
import in.showoffs.medstore.repo.UserReop;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RequestPath {

	@Autowired
	private UserReop userRepo;
	
	@RequestMapping("/")
	  public String hello() {
	    return "Hello World!";
	  }
	
	@RequestMapping("/santa")
	public String saySanta(){
		return "This is santa Test";
	}
	
	@RequestMapping("/adiktz")
	public List<Users> getAdiktz(){
		return (List<Users>) userRepo.findByUserNameLike("adiktz");
	}
	
	@RequestMapping("/all")
	public List<Users> getAll(){
		return (List<Users>) userRepo.findAll();
	}
	
	@RequestMapping("/me")
	List<Users> getMe(){
		return (List<Users>)userRepo.tellMe("adiktz");
	}
	
	@RequestMapping("/getmyname")
	String getMyName(){
		List<Users> fn = userRepo.findByUserNameLike("adiktz");
		String name = fn.get(0).getFirstName() + " " + fn.get(0).getLastName();
		return name;
	}
}
