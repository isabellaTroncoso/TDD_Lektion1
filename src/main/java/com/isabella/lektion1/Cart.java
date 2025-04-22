package com.isabella.lektion1;

import java.util.ArrayList;
import java.util.List;

public class Cart {
    private List<Product> products = new ArrayList<>();

    public void addProduct(Product product) {
        products.add(product);
    }

    public double getTotal() {
        return products.stream().mapToDouble(Product::getPrice).sum();
    }

    public double getTotalWithDiscount(double discountPercent) {
        double total = getTotal();
        return total - (total * (discountPercent / 100));
    }
}

