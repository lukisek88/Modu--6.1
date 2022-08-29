package com.kodilla.good.patterns.allegro;

public class Main {
    public static void main(String[] args) {

        ProductOrderRecive productOrderRequestRetriever = new ProductOrderRecive();
        ProductOrderRequest productOrderRequest = productOrderRequestRetriever.recive();

        ProductOrderProcessor productOrderProcessor = new ProductOrderProcessor(new MailService(), new PCOrderService(), new PCOrderRepo());
        productOrderProcessor.process(productOrderRequest);
    }
}