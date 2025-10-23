package dev.naimsulejmani.layoutfragmentdemo;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller
public class HomeController {

    @GetMapping
    public String home() {
        return "home";
    }

    @GetMapping("/gallery")
    public String gallery() {
        return "gallery";
    }

    @GetMapping("/contact")
    public String contact() {
        return "contact";
    }

    @GetMapping("/news")
    public String news(Model model) {
        var news = List.of(
                new News("Barca shume e forte!",
                        "Shume te fortje jane, jo veq per Olimpiakos por edhe per shume tjere"
                ),
                new News("Reali me zorr fiton!",
                        "Bajn cka tbojn disi fitojne, ja me hile ja me hile!")
        );
        model.addAttribute("news", news);
        return "news";
    }
}
