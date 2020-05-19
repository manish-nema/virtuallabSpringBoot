package com.ibm.FirstService;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FirstController {
	
	@GetMapping("/test")
	public String getMessage() {
		
		return "welcome to spring boot: Boot camp session: second day";
	}

}
