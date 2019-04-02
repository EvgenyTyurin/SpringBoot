package spring_demo;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * Request handler
 */

@Controller
public class SpringDemoController {
    @GetMapping
    public String springdemo(String name, Model model) {
        model.addAttribute("name", name);
        return "springdemo";
    }
    @GetMapping("/hello")
    public String hello(String name, Model model) {
        model.addAttribute("name", name);
        return "springdemo";
    }
}
