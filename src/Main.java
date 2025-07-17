import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        GiftBox box = new CandyBox();
        box.addSweet(new AlenkaChocolate(90, 250, "35%"));
        box.addSweet(new BonPariCandy(500, 300, "Фруктовый микс"));
        box.addSweet(new OatmealCookie(400, 200, "Хрустящее"));
        box.addSweet(new MarmelandiaJelly(250, 150, "Дольки"));

        System.out.println("Начальное содержимое коробки:");
        box.printAllSweets();
        System.out.println("Общий вес: " + box.getTotalWeight() + " гр.");
        System.out.println("Общая стоимость: " + box.getTotalPrice() + " руб.");

        System.out.print("Введите максимальный вес для оптимизации по весу: ");
        double maxWeightWeight = scanner.nextDouble();
        box.optimizeByWeight(maxWeightWeight);
        System.out.println("\nПосле оптимизации по весу:");
        box.printAllSweets();
        double finalWeightWeight = box.getTotalWeight();
        System.out.println("Общий вес: " + finalWeightWeight + " гр. (меньше " + maxWeightWeight + " гр.)");
        if (finalWeightWeight >= maxWeightWeight) {
            System.out.println("Ошибка: вес не уменьшился до требуемого уровня!");
        }


        box.addSweet(new AlenkaChocolate(90, 250, "35%"));
        box.addSweet(new BonPariCandy(500, 300, "Фруктовый микс"));
        box.addSweet(new OatmealCookie(400, 200, "Хрустящее"));
        box.addSweet(new MarmelandiaJelly(250, 150, "Дольки"));

        System.out.print("Введите максимальный вес для оптимизации по цене: ");
        double maxWeightPrice = scanner.nextDouble();
        box.optimizeByPrice(maxWeightPrice);
        System.out.println("\nПосле оптимизации по цене:");
        box.printAllSweets();
        double finalWeightPrice = box.getTotalWeight();
        System.out.println("Общий вес: " + finalWeightPrice + " гр. (меньше " + maxWeightPrice + " гр.)");
        if (finalWeightPrice >= maxWeightPrice) {
            System.out.println("Ошибка: вес не уменьшился до требуемого уровня!");
        }

        scanner.close();
    }
}