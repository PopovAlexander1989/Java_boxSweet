public class MarmelandiaJelly extends Sweet {
    private final String shape;

    public MarmelandiaJelly(double weight, double price, String shape) {
        super("Мармелад Мармеландия", weight, price);
        this.shape = shape;
    }

    public String getShape() {
        return shape;
    }

    public String toString() {
        return super.toString() + " , Форма: " + shape;
    }
}