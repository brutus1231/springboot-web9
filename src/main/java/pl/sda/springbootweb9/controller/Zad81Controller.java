package pl.sda.springbootweb9.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@Controller
public class Zad81Controller {

    @GetMapping("/zad81/{id}")
    public String zad81(@PathVariable("id") String id, Model model) {
        model.addAttribute("id", id);
        return "zad81";
    }
}
