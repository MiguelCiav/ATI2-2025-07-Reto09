package com.laboratorio3.ati2microservicio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GreetingControllerTests {
    GreetingService greetingService;

    public void GreetingController(@Autowired GreetingService greetingService) {
    }

    @GetMapping("/greet")
    public String getGreeting() throws Exception {
        return greetingService.getServiceGreeting();
    }
}