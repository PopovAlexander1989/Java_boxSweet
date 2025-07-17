import java.util.ArrayList;

public class CandyBox implements GiftBox {
    private ArrayList<Sweet> sweets = new ArrayList<>();

    @Override
    public void addSweet(Sweet sweet) {
        sweets.add(sweet);
    }

    @Override
    public void removeLastSweet() {
        if (!sweets.isEmpty()) {
            sweets.remove(sweets.size() - 1);
        }
    }

    @Override
    public double getTotalWeight() {
        double totalWeight = 0;
        for (Sweet sweet : sweets) {
            totalWeight += sweet.getWeight();
        }
        return totalWeight;
    }

    @Override
    public double getTotalPrice() {
        double totalPrice = 0;
        for (Sweet sweet : sweets) {
            totalPrice += sweet.getPrice();
        }
        return totalPrice;
    }

    @Override
    public void printAllSweets() {
        System.out.println("Содержимое коробки:");
        for (int i = 0; i < sweets.size(); i++) {
            Sweet sweet = sweets.get(i);
            String details = "Вес: " + sweet.getWeight() + " гр., Цена: " + sweet.getPrice() + "руб., Уникальный параметр: " + sweet.getUniqueParameter();
            System.out.println((i + 1) + ". " + sweet.getName() + " - " + details);
        }
    }

    @Override
    public void optimizeByWeight(double maxWeight) {
        while (getTotalWeight() > maxWeight && sweets.size() > 1) {
            Sweet lightest = sweets.get(0);
            int lightestIndex = 0;
            for (int i = 1; i < sweets.size(); i++) {
                if (sweets.get(i).getWeight() < lightest.getWeight()) {
                    lightest = sweets.get(i);
                    lightestIndex = i;
                }
            }
            sweets.remove(lightestIndex);
        }
    }

    @Override
    public void optimizeByPrice(double maxWeight) {
        while (getTotalWeight() > maxWeight && sweets.size() > 1) {
            Sweet cheapest = sweets.get(0);
            int cheapestIndex = 0;
            for (int i = 1; i < sweets.size(); i++) {
                if (sweets.get(i).getPrice() < cheapest.getPrice()) {
                    cheapest = sweets.get(i);
                    cheapestIndex = i;
                }
            }
            sweets.remove(cheapestIndex);
        }
    }
}