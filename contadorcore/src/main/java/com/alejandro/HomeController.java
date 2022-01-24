package com.alejandro;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
@Controller
@RequestMapping("/you_server")
public class HomeController {
	Integer count = 0;
	@RequestMapping(value="" )
    public String youserver(HttpSession sesion){
        return "you_server.jsp";
    }
    
    @RequestMapping("/counter")
    public String counter(HttpSession sesion){

    	count++;
    	sesion.setAttribute("count", count);
        return "counter.jsp";
    }
    
}