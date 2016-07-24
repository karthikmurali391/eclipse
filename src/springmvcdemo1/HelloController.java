package springmvcdemo1;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

public class HelloController {
	
	@RequestMapping("/sayWelcome")
	public ModelAndView sayHello() {
		String data = "Welcome to Spring MVC!";
		System.out.println("Inside action...");
		
		return new ModelAndView("home", "responsedata", data);
	}

}
