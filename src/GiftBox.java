public interface GiftBox {
    void addSweet(Sweet sweet);
    void removeLastSweet();
    double getTotalWeight();
    double getTotalPrice();
    void printAllSweets();
    void optimizeByWeight(double maxWeight);
    void optimizeByPrice(double maxWeight);
}

