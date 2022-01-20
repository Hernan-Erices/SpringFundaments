package com.alejandro;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("coding")
public class CodingController {

	@RequestMapping(value="", method=RequestMethod.GET)
    public String index(){
      return "¡Hola Coding Dojo!";
    }

	@RequestMapping(value="/python", method=RequestMethod.GET)
    public String python(){
      return "¡Python/Django fue increíble!";
    }

    @RequestMapping(value="/java", method=RequestMethod.GET)
    public String java(){
      return "¡Java/Spring es mejor!";
    }
    
    

}
