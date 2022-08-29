package com.kodilla.good.patterns.allegro;


import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;


public class ProductOrderRecive {
    public ProductOrderRequest recive() {

        UserData user = new UserData("John", "Bambo");
        LocalDateTime orderDate = LocalDateTime.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofLocalizedDateTime(FormatStyle.MEDIUM);
        Product product = new PC("AMD 9000 series", "Boost Your Game", 6250);
        int quantity = 3;
        double sum= product.getProductPrice()*(double)quantity;

        System.out.println("Witaj "+user.getRealName());
        System.out.println("UserName:"+user.getUserName() +"\n"+
                        product+"\n"+
                        "Ordered Date: " + formatter.format(orderDate) + "\n"+
                        "Product Quantity: "+quantity+"\n"+
                        "Total Cost: "+sum);
        return new ProductOrderRequest(user, orderDate, product, quantity);
    }
}
