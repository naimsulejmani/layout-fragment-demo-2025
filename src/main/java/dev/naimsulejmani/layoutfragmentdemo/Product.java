package dev.naimsulejmani.layoutfragmentdemo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Product {
    private int id;
    private boolean isNew = true;
    private boolean fast24h = false;
    private String slug;
    private String imageUrl;
    private String name;
    private int storage = 256;
    private String color;
    private double price;
    private double oldPrice;
    private String currencySymbol = "€"; // ALT + 0128

    public Product(int id, String name, String slug, String imageUrl, double price,
                   String color) {
        this.id = id;
        this.name = name;
        this.slug = slug;
        this.imageUrl = imageUrl;
        this.price = price;
        this.color = color;
        this.storage = Math.random() > 0.5 ? 256 : 512;
        this.fast24h = Math.random() > 0.5;
    }
}
