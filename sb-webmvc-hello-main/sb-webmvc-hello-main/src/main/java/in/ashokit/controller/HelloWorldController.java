package in.ashokit.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HelloWorldController {

    @GetMapping(value = "/hello")
    public String returnHelloPage() {
        return "welcome";
    }
}
