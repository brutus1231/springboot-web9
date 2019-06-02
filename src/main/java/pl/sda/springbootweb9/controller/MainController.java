package pl.sda.springbootweb9.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class MainController {

    @GetMapping("/")
    public String main() {
        return "index";
    }

    @PostMapping(value = "/myButtonClick")
    public String clicked(Model model) { //@RequestParam("kliknij") String buttonClick
        model.addAttribute("przyciskKliknieto", true);
        return "index";
    }
}
