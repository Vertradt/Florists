package florists;

import java.util.HashMap;
import java.util.Map;

class PriceList {
    private Map<String, Double> map = new HashMap<>();
    private static PriceList priceList;

    private PriceList() {
    }

    public double findPriceByName(String flower) {
        return map.getOrDefault(flower, -1.0);
    }

    static PriceList getInstance() {
        if (priceList == null) {
            priceList = new PriceList();
        }
        return priceList;
    }

    void put(String flowerType, double costOfFlower) {
        map.put(flowerType, costOfFlower);
    }

}
