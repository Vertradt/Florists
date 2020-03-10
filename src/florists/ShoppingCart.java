package florists;

import java.util.List;

public class ShoppingCart extends Container {

    public ShoppingCart(Customer customer) {
        super(customer);
    }

    public void add(Flower flower) {
        allFlowers.add(flower);
//        customer.takeAwayFromCart();
    }

    public List<Flower> getFlowers() {
        return allFlowers;
    }

    void removeFromCart() {
        allFlowers.clear();
    }

    double giveTotalPrice() {

        return super.giveTotalPrice();
    }

    @Override
    List<Flower> getFlowerByMaxPrice() {
        return super.getFlowerByMaxPrice();
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Wózek właściciel ");
        sb.append(customer.getName());
        if (!allFlowers.isEmpty()) {
            sb.append("\n");
        } else {
            sb.append(" --pusty-- ").append("\n");
        }
        for (Flower flower : allFlowers) {
            sb.append(flower).append("\n");
        }
        return sb.toString();
    }
}

