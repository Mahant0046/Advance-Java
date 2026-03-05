package in.ac.kletech.service;

import org.springframework.stereotype.Service;

@Service
public class GreetingService {
    public String getGreeting(String name) {
        return "Hello, " + name + "! Welcome to Spring MVC.";
    }
}
