package com.alejandro;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {

	@RequestMapping("/hello")

    public String hello() {

            return "Hello World!";

    }

    @RequestMapping("/world")

    public String world() {

            return "¡Las anotaciones de clase tambien son geniales!";

    }
}


