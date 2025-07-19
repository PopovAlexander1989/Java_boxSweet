public class OatmealCookie extends Sweet {
    private final String doughType;

    public OatmealCookie(double weight, double price, String doughType) {
        super("Овсяное печенье", weight, price);
        this.doughType = doughType;
    }

    public String getDoughType() {
        return doughType;
    }

    public String toString() {
        return super.toString() + " , Тип теста: " + doughType;
    }
}