/*
Задание: Пользователь вводит сумму вклада и процент, который будет начисляться ежегодно. Отобразить размер вклада поочередно на ближайшие 5 лет.
*/

import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double money = scan.nextDouble();
        double percent = scan.nextDouble();

        for (int i = 1; i < 6; i++) {
            money = money + money / 100 * percent;
            System.out.println("Сумма вклада на " + i + " год равна " + money);
            
        }

    }
}
