package com.kodilla.good.patterns.food2door;

public class SendOrderAPI implements SendOrderToProducer {
    public boolean send(Product product, double quantity) {
        System.out.println("sending order via Fax... " + product.getName() + " x " +quantity);
        return true;
    }
}
