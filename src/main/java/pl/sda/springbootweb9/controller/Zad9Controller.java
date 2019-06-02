package pl.sda.springbootweb9.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import pl.sda.springbootweb9.model.Customer;
import pl.sda.springbootweb9.repository.CustomerRepository;

import java.util.Optional;

@Controller
public class Zad9Controller {

    @Autowired
    private CustomerRepository customerRepository;

    @GetMapping("/zad9")
    public String zad9(@RequestParam(value = "textbox1", required = false) String textBox,
                       Model model) {

        if (textBox != null) {
            Long customerId = Long.parseLong(textBox);
            Optional<Customer> customer = customerRepository.findById(customerId);
            if (customer.isPresent()) {
                model.addAttribute("text", customer.get().toString());
            } else {
                model.addAttribute("text", "brak");
            }

        }
        return "zad9";
    }
}
