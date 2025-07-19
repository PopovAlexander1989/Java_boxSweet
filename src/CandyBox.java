import java.util.*;

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
            String fullDetails = sweet.toString();
            int uniqueStart = fullDetails.lastIndexOf(", ") + 2;
            String baseDetails = sweet.getName() + " - Вес: " + sweet.getWeight() + "г, Цена: " + sweet.getPrice() + "р";
            String uniqueParam = (uniqueStart > 0 && uniqueStart < fullDetails.length()) ? fullDetails.substring(uniqueStart).trim() : "";
            System.out.println((i + 1) + ". " + baseDetails + (uniqueParam.isEmpty() ? "" : ", Уникальный параметр: " + uniqueParam));
        }
    }

    @Override
    public void optimizeByWeight(double maxWeight) {
        while (getTotalWeight() > maxWeight && !sweets.isEmpty()) {
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
        while (getTotalWeight() > maxWeight && !sweets.isEmpty()) {
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