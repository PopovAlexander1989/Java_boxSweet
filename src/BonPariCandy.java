public class BonPariCandy extends Sweet {
    private final String flavor;

    public BonPariCandy(double weight, double price, String flavor) {
        super("Леденцы Бон Пари", weight, price);
        this.flavor = flavor;
    }

    public String getFlavor() {
        return flavor;
    }

    public String toString() {
        return super.toString() + " , Вкус: " + flavor;
    }

}