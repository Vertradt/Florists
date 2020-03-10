package florists;

//róża, kolor: czerwony, ilość 5, cena 10.0
public abstract class  Flower {
    private int amount;
    private String name;
    private String colour;

    public Flower(int amount, String name, String colour) {
        this.amount = amount;
        this.name = name;
        this.colour = colour;
    }

    public String getName() {
        return name;
    }

    public String getColour() {
        return colour;
    }

    double getPrice() {
        return PriceList.getInstance().findPriceByName(name);
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(name).append(", kolor: ").append(colour).append(", ilosc ").append(amount).append(", cena ");
        sb.append(getPrice());
        return sb.toString();
    }

    public double totalPrice() {
        return amount * getPrice();
    }
}
