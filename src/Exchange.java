import java.util.Scanner;

public class Exchange {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите стоимость товара: ");
        double cost = scanner.nextDouble();
        System.out.print("Введите количество денег, которое вы дали продавцу: ");
        double money = scanner.nextDouble();
        double change = money - cost;
        if (change < 0) {
            System.out.println("Недостаточно денег");
            return;
        }
        int rubles = (int) change;
        double coins = change - rubles;
        System.out.println("Сдача: " + rubles + " рублей");
        int kopecks = (int) Math.round(coins * 100);
        int tenCoins = kopecks / 10;
        kopecks %= 10;
        int fiveCoins = kopecks / 5;
        kopecks %= 5;
        int oneCoins = kopecks;
        System.out.println("Монеты: ");
        System.out.println("10 копеек " + tenCoins);
        System.out.println("5 копеек " + fiveCoins);
        System.out.println("1 копейка " + oneCoins);
    }
}
