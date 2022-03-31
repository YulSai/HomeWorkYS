package home_work_2.utils;

public class SortsUtils {
    public static void main(String[] args) {
    }

    // Метод пузырьковой сортировки
    public static void bubble(int[] arr) {
        boolean sorted;
        int temp;

        System.out.print("Исходный массив: ");
        for (int i = 0; i < arr.length; i++) {

            System.out.printf("%d ", arr[i]);
        }
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
        for (int i = 0; i < arr.length; i++) {
            System.out.printf("%d ", arr[i]);
        }
    }

    // Метод шейкерной сортировки
    public static void shake(int[] arr) {
        int right;
        int left;
        int temp;

        System.out.print("Исходный массив: ");
        for (int i = 0; i < arr.length; i++) {
            System.out.printf("%d ", arr[i]);
        }
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
        for (
                int i = 0;
                i < arr.length; i++) {
            System.out.printf("%d ", arr[i]);
        }
    }
}



