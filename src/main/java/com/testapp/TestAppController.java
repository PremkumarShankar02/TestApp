package com.testapp;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestAppController {
	
	@GetMapping(path="/getmsg")
	public String getMsg() {
		return "Valhalla";
	}

}
