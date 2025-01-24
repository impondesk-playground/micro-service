package com.example.demo;

import java.util.HashMap;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin
@RestController
public class RootController {
	
	private static final Logger LOGGER = LoggerFactory.getLogger(RootController.class);

	
	@GetMapping("/root")
	public ResponseEntity<Object> getMethodName() {
		
		LOGGER.info("Loading Root Data");
		
		
		Map<String, Object> map = new HashMap<>();
	    map.put("key1", "value1");
	    map.put("key2", "value2");
	    map.put("message", "Hello, world!");
        map.put("status", "success");

        // Return the ResponseEntity with status OK and body
	    return ResponseEntity.status(HttpStatus.OK).body(map);

	}
	

}
