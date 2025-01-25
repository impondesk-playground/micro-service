package com.example.demo.rest;

import java.util.HashMap;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/status")
public class StatusAPIController {
	
	private static final Logger LOGGER = LoggerFactory.getLogger(StatusAPIController.class);
	
	@GetMapping("/ping")
	public ResponseEntity<Object> sample() {
		
		LOGGER.info("Loading Status");
		
		
		Map<String, Object> map = new HashMap<>();
	    map.put("key1", "value11");
	    map.put("key2", "value12");

        // Return the ResponseEntity with status OK and body
	    return ResponseEntity.status(HttpStatus.OK).body(map);

	}

}
