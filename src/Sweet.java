public abstract class Sweet {
    protected String name;
    protected double weight;
    protected double price;
    protected String uniqueParameter;

    public Sweet(String name, double weight, double price, String uniqueParameter) {
        this.name = name;
        this.weight = weight > 0 ? weight : 0;
        this.price = price > 0 ? price : 0;
        this.uniqueParameter = uniqueParameter;
    }

    public String getName() {
        return name;
    }

    public double getWeight() {
        return weight;
    }

    public double getPrice() {
        return price;
    }

    public String getUniqueParameter() {
        return uniqueParameter;
    }

    @Override
    public String toString() {
        return "Название: " + name + ", Вес: " + weight + " гр., Цена: " + price + " руб., Уникальный параметр: " + uniqueParameter;
    }
}