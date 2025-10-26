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
                new News("Barca teper e forte!",
                        "Shume te fortje jane, jo veq per Olimpiakos por edhe per shume tjere"
                ),
                new News("Reali me zorr fiton!",
                        "Bajn cka tbojn disi fitojne, ja me hile ja me hile!")
        );
        model.addAttribute("news", news);
        return "news";
    }

    @GetMapping("/about")
    public String about() {
        return "about";
    }

    @GetMapping("/products")
    public String products(Model model) {

        var products = List.of(
                new Product(11, "Iphone 1", "Slug1",
                        "https://iqq6kf0xmf.gjirafa.net/images/1cf1cbb8-76a7-47da-9529-efdba2898b79/1cf1cbb8-76a7-47da-9529-efdba2898b79.jpeg?w=190",
                        1000, "Blue"),
                new Product(2, "Iphone 2", "Slug2",
                        "https://iqq6kf0xmf.gjirafa.net/images/1cf1cbb8-76a7-47da-9529-efdba2898b79/1cf1cbb8-76a7-47da-9529-efdba2898b79.jpeg?w=190",
                        1100, "Yellow"),
                new Product(3, "Iphone 3", "Slug3",
                        "https://iqq6kf0xmf.gjirafa.net/images/1cf1cbb8-76a7-47da-9529-efdba2898b79/1cf1cbb8-76a7-47da-9529-efdba2898b79.jpeg?w=190",
                        1200, "Yellow"),
                new Product(4, "Iphone 3", "Slug3",
                        "https://iqq6kf0xmf.gjirafa.net/images/1cf1cbb8-76a7-47da-9529-efdba2898b79/1cf1cbb8-76a7-47da-9529-efdba2898b79.jpeg?w=190",
                        1500, "Black")
        );

        model.addAttribute("products", products);
        return "products";
    }
}
