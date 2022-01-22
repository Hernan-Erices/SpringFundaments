package com.alejandro;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
@Controller
public class HomeController {

    @RequestMapping("/")
    public String index(Model index) {
    	index.addAttribute("index", "Esto es el index");
        return "index.jsp";
    }
    @RequestMapping("/fechaactual")
    public String fecha(Model fecha, Model Date) {
    	fecha.addAttribute("fecha", "Hola, esta es la fecha actual");
    	
    	Date date = Calendar.getInstance().getTime();  
    	DateFormat dateFormat = new SimpleDateFormat("E, dd MMM yyyy");  
    	String strDate = dateFormat.format(date);  

    	Date.addAttribute("fechaactual", strDate);
        return "fechaactual.jsp";    
        
    }
    @RequestMapping("/horaactual")
    public String hora(Model hora, Model horaactual) {
    	hora.addAttribute("hora", "Hola, esta es la hora actual");
    	
    	Date date = Calendar.getInstance().getTime();  
    	DateFormat dateFormat = new SimpleDateFormat("HH:mm:ss");  
    	String strDate = dateFormat.format(date);  
    	horaactual.addAttribute("horaactual", strDate);
        return "horaactual.jsp";
    }
}