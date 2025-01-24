package com.example.demo.controller;

import java.util.HashMap;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class SampleRestControler {
	
	private static final Logger LOGGER = LoggerFactory.getLogger(SampleRestControler.class);
	
	@GetMapping("/root")
	public ResponseEntity<Object> sample() {
		
		LOGGER.info("Loading Sample Root Data");
		
		
		Map<String, Object> map = new HashMap<>();
	    map.put("message", "Hello, world!");
        map.put("status", "success");

        // Return the ResponseEntity with status OK and body
	    return ResponseEntity.status(HttpStatus.OK).body(map);

	}

}
