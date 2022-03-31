package home_work_2.utils;

public class SortsUtils {
    /* В классе описаны методы для сортировки массивов:
        bubble - метод пузырьковой сортировки
        shake - метод шейкерной сортировки
        Результаты сортировок выведены в консоль*/

    public static void bubble(int[] arr) {
        boolean sorted;
        int temp;
        String result;

        System.out.print("Исходный массив: ");
        result = "";
        for (int i = 0; i < arr.length; i++) {
            result += arr[i] + " ";
        }
        System.out.printf(result);
        System.out.println();

        sorted = false;
        while (!sorted) {
            sorted = true;
            for (int i = 0; i < arr.length - 1; i++) {
                if (arr[i] > arr[i + 1]) {
                    temp = arr[i];
                    arr[i] = arr[i + 1];
                    arr[i + 1] = temp;
                    sorted = false;
                }
            }
        }
        System.out.print("Отсортированный массив: ");
        result = "";
        for (int i = 0; i < arr.length; i++) {
            result += arr[i] + " ";
        }
        System.out.printf(result);
    }

    public static void shake(int[] arr) {
        int right;
        int left;
        int temp;
        String result;

        System.out.print("Исходный массив: ");
        result = "";
        for (int i = 0; i < arr.length; i++) {
            result += arr[i] + " ";
        }
        System.out.printf(result);
        System.out.println();

        right = arr.length - 1;
        left = 0;

        while (left < right) {
            for (int i = left; i < right; i++) {
                if (arr[i] > arr[i + 1]) {
                    temp = arr[i];
                    arr[i] = arr[i + 1];
                    arr[i + 1] = temp;
                }
            }
            right--;
            for (int i = right; i > left; i--) {
                if (arr[i] < arr[i - 1]) ;
                temp = arr[i];
                arr[i] = arr[i - 1];
                arr[i - 1] = temp;
            }
        }
        left++;

        System.out.print("Отсортированный массив: ");
        result = "";
        for (int i = 0; i < arr.length; i++) {
            result += arr[i] + " ";
        }
        System.out.printf(result);
        System.out.println();
    }

    public static void main(String[] args) {
    }
}