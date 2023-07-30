package spring.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import spring.EventService;

@Controller
public class EventController {

    @Autowired
    EventService eventService;

    @GetMapping("/")
    public String findAll(Model model) {
        model.addAttribute("events", eventService.findAll());
        return "list";
    }

    @GetMapping("/add")
    public String add(Model model) {
        return null;
    }
}
