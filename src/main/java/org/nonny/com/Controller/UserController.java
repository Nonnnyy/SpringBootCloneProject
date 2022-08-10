package org.nonny.com.Controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

public class UserController {
	
	@RestController
	@RequestMapping("/home")

	public class home {
		
		public String home() {
			
			return "Welcome to HOME PAGE";
			
		}
		
	public String dashboard() {
		
		return "Welcome to DASHBOARD PAGE";
		}
		

	}
}
