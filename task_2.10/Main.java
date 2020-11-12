/*
Задание: Дан массив с числами. Проверьте, есть ли в нем два одинаковых числа подряд. Если есть - выведите 'да', а если нет - выведите 'нет'.
*/

public class Main {
    public static void main(String[] args) {
        int[] numbers = {7, 9, 5, 6, 4, 3, 2, 1,};
        for (int i = 0; i < numbers.length - 1; i++) {
            if (numbers[i] == numbers[i + 1]) {
                System.out.println("Да");
                break;
            } else if (i == numbers.length-2 ) {
                System.out.println("Нет");
            }
        }
    }
}
