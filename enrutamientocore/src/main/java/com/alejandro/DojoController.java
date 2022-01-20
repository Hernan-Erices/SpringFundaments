package com.alejandro;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DojoController {
	
    @RequestMapping("/dojo/{dojo}")
    public String dojo(@PathVariable("dojo") String dojo){
    	return "Dojo: " + dojo;
    }
    
    @RequestMapping("/burbank-dojo/{burbank}")
    public String burbank(@PathVariable("burbank") String burbank){
    	return "Burbank Dojo: " + burbank;
    }
    
    @RequestMapping("/san-jose/{sanjose}")
    public String sanjose(@PathVariable("sanjose") String sanjose){
    	return "Dojo san jose: " + sanjose;
    }
	

}
