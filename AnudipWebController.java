package edu.learning.anudip;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AnudipWebController {
	
	@GetMapping("/link")
	public String web() {
		return "<a href='https://www.anudip.org/'>"
				+ "<body bgcolor='black' text='white'><center><h1>Click ME !</h1></center></body></a>";
	}
		
	}
