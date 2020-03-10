package florists;

import java.util.List;

//    Pudełko własciciel Janek
//    róża, kolor: czerwony, ilość 5, cena 10.0
//    piwonia, kolor: czerwony, ilość 5, cena 8.0
//    bez, kolor: biały, ilość 3, cena 12.0
public class Box extends Container {
    Box(Customer customer) {
        super(customer);
    }


    void add(List<Flower> allFlowers) {
        this.allFlowers.addAll(allFlowers);

    }

    List<Flower> showSmallerThan(double price) {
        super.showSmallerThan(price);
        return null;
    }

    List<Flower> getFlowerBy(int amount) {
        super.getFlowerBy(amount);
        return null;
    }

    @Override
    List<Flower> startsWith(String letter) {
        super.startsWith(letter);
        return null;
    }

    @Override
    List<Flower> getFlowerBy(String colour) {
        return super.getFlowerBy(colour);
    }

    @Override
    double giveTotalPrice() {
        return super.giveTotalPrice();
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Pudełko");
        sb.append(" właściciel ").append(customer.getName()).append("\n");
        for (Flower flower : allFlowers) {
            sb.append(flower).append("\n");
        }
        return sb.toString();
    }
}
