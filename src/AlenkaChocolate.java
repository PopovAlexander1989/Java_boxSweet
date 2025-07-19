public class AlenkaChocolate extends Sweet {
    private final String cocoaPercentage;

    public AlenkaChocolate(double weight, double price, String cocoaPercentage) {
        super ("Шоколадка Алёнка", weight, price);
        this.cocoaPercentage = cocoaPercentage;
    }

    public String getCocoaPercentage() {
        return cocoaPercentage;
    }

    public String toString() {
        return super.toString() + " , Процент какао: " + cocoaPercentage;
    }
}