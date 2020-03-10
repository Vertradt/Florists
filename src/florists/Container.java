package florists;

import java.util.ArrayList;
import java.util.List;

public abstract class Container {
    List<Flower> allFlowers = new ArrayList<>();
    Customer customer;

    Container(Customer customer) {
        this.customer = customer;
    }


    double giveTotalPrice() {
        double total = 0;
        for (Flower allFlower : allFlowers) {
            total += allFlower.getPrice() * allFlower.getAmount();
        }
        return total;
    }

    List<Flower> getFlowerByMaxPrice() {
        List<Flower> flowers = new ArrayList<>();
        Flower flower = allFlowers.get(0);
        for (Flower allFlower : allFlowers) {
            if (flower.totalPrice() < allFlower.totalPrice()) {
                flower = allFlower;
                flowers.add(flower);
            }
        }
        return flowers;

    }

    List<Flower> startsWith(String letter) {
        List<Flower> flowers = new ArrayList<>();
        for (Flower allFlower : allFlowers) {
            if (allFlower.getName().startsWith(letter)) {
                flowers.add(allFlower);
            }
        }
        return flowers;
    }

    List<Flower> getFlowerBy(int amount) {
        List<Flower> flowers = new ArrayList<>();
        for (Flower allFlower : allFlowers) {
            if (allFlower.getAmount() > amount) {
                flowers.add(allFlower);
            }
        }
        return flowers;

    }

    List<Flower> showSmallerThan(double price) {
        List<Flower> flowers = new ArrayList<>();
        for (Flower allFlower : allFlowers) {
            if (allFlower.getPrice() < price) {
                flowers.add(allFlower);
            }
        }
        return flowers;
    }

    List<Flower> getFlowerBy(String colour) {
        List<Flower> oneColorFlowers = new ArrayList<>();

        for (Flower allFlower : allFlowers) {
            if (allFlower.getColour().equals(colour)) {
                oneColorFlowers.add(allFlower);
            }

        }
        return oneColorFlowers;
    }


    @Override
    public abstract String toString();
}
