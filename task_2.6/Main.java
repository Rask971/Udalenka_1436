/*
Задание: Даны переменные a и b. Проверьте, что a делится без остатка на b. Если это так - выведите 'Делится' и результат деления, иначе выведите 'Делится с остатком' и остаток от деления.
*/

public class Main {
    public static void main(String[] args) {
        int a = 15;
        int b = 3;
        if (a % b == 0){
            System.out.println("Делится a/b=" + a/b );
        } else {
            System.out.println("Делится с остатком, остаток равен " + a % b);
        }

    }
}
