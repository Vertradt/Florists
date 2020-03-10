package florists;

import java.util.ArrayList;
import java.util.List;

class Customer {
    private ShoppingCart shoppingCart = new ShoppingCart(this);
    private String name;
    private double cash;


    Customer(String name, double cash) {
        this.name = name;
        this.cash = cash;
    }

    String getName() {
        return name;
    }

    void takeAwayFromCart() {
        List<Flower> listOfFlower = shoppingCart.getFlowers();

        for (int i = 0; i < listOfFlower.size(); i++) {
            if (shoppingCart.giveTotalPrice() > cash) {
                listOfFlower.remove(shoppingCart.getFlowerByMaxPrice());
            }
        }
    }


    @Override
    public String toString() {
        return name;
    }

    void get(Flower flower) {

        shoppingCart.add(flower);
    }

    ShoppingCart getShoppingCart() {
        return shoppingCart;
    }

    void pay() {
        takeAwayFromCart();
        List<Flower> listOfFlower = shoppingCart.getFlowers();
        List<Flower> flowersToRemove = new ArrayList<>();

        for (Flower flower : listOfFlower) {
            if (flower.getPrice() > cash || flower.getPrice() <= 0) {
                flowersToRemove.add(flower);
            } else {
                cash -= flower.totalPrice();
            }
        }
        listOfFlower.removeAll(flowersToRemove);
    }

    double getCash() {
        return cash;

    }

    void pack(Box box) {
        box.add(shoppingCart.getFlowers());
        shoppingCart.removeFromCart();
    }

//    Pudełko własciciel Janek
//    róża, kolor: czerwony, ilość 5, cena 10.0
//    piwonia, kolor: czerwony, ilość 5, cena 8.0
//    bez, kolor: biały, ilość 3, cena 12.0

}
