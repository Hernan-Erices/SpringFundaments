package com.alejandro;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HolaController {
    @RequestMapping("/")

    public String index(@RequestParam(value="name", required=false) String name, String lastname) {
    	
    	if(name == null) {
    		return "Hello Human! Welcome to SpringBoot";
    	}else {
            return "Hello " + name + " " + lastname + " Welcome to SpringBoot";
    	}
    }

}
