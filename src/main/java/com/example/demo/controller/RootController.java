package com.example.demo.controller;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;

@CrossOrigin
@Controller
public class RootController {
	
	private static final Logger LOGGER = LoggerFactory.getLogger(RootController.class);
	
    @GetMapping("/")
    public String viewHomePage(Model model) {
    	LOGGER.info("Loading Root Page");
    	
    	SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
    	
        model.addAttribute("message", "Hello, world!");
        model.addAttribute("status", "success");
        model.addAttribute("serverTime", sdf.format(new Date()));

        
        return "index";
    }
	

}
