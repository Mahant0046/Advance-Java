package in.ac.kletech.controller;

import in.ac.kletech.service.GreetingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class GreetingController {

    @Autowired
    private GreetingService greetingService;

    @GetMapping("/")
    public String showForm() {
        return "greeting";
    }

    @PostMapping("/greet")
    public String greet(@RequestParam("name") String name, Model model) {
        String message = greetingService.getGreeting(name);
        model.addAttribute("message", message);
        return "result";
    }
}
