/*
Задание: Дан массив с числами. Проверьте, что в этом массиве есть число 5. Если есть - выведите 'да', а если нет - выведите 'нет'.
*/

public class Main {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        int a = 0;
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] == 5) {
                System.out.println("да");
                a = 1;
                break;
            }
            
        }
        if (a == 0) {
            System.out.println("нет");
        }
    }
}
