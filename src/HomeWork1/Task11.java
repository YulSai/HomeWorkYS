package HomeWork1;

//Math

public class Task11 {
    public static void main(String[] args) {
        //Вычисление абсолютных значений

        System.out.println(Math.abs(1)); //1
        System.out.println(Math.abs(5.253f)); //5.253
        System.out.println(Math.abs(-21.52d)); //21.52
        System.out.println(Math.abs(5255L)); //5255

        //Вычисление значений тригонометрических функций
        System.out.println(Math.sin(25.18d));
        System.out.println(Math.cos(32.22d));

        //Возведение в степень
        System.out.println(Math.pow(2, 3)); // 8
        System.out.println(Math.pow(5, 2)); // 25

        //Извлечение корней
        System.out.println(Math.sqrt(36)); //6
        System.out.println(Math.sqrt(25)); //6
        System.out.println(Math.sqrt(38)); //6.1644...

        //System.out.println(Math.cbrt(27)); //3
        System.out.println(Math.cbrt(81)); //4.3267...
        System.out.println(Math.cbrt(8)); //2

        //Генерация случайных чисел
        for (int i = 0; i < 3; i++) {
            System.out.println(Math.random());
        }
        for (int i = 0; i < 5; i++) {
            System.out.println(Math.random());
        }

        //Округление
        // round - округляет так, как привычно
        System.out.println(Math.round(2.3)); // 2
        System.out.println(Math.round(3.4)); // 3
        System.out.println(Math.round(5.5)); // 6

        //floor всегда округляет в меньшую сторону
        System.out.println(Math.floor(2.3)); // 2
        System.out.println(Math.floor(3.4)); // 3
        System.out.println(Math.floor(5.5)); // 5

        //ceil всегда округляет числа в большую сторону
        System.out.println(Math.ceil(2.3)); // 3
        System.out.println(Math.ceil(3.4)); // 4
        System.out.println(Math.ceil(5.5)); // 6

        //Максимальное и минимальное число
        System.out.println(Math.max(8, 10)); //10
        System.out.println(Math.max(18, 2)); //18
        System.out.println(Math.min(8, 10)); //8
        System.out.println(Math.min(18, 2)); //2
    }

}
