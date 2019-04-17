package com.ben.chacko.app;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SCSController {
	@Autowired
	SCSProperties props;
	
	@GetMapping("/hi")
    public String hello() {
        return "Greetings " + props.getTestData();
	}
}
