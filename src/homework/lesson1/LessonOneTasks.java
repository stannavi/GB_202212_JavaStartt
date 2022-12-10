package homework.lesson1;

import java.util.Arrays;
import java.util.Scanner;

public class LessonOneTasks {
    public static void main(String[] args) {

        System.out.println(checkNumbers());
        positiveOrNegative(-8);
        System.out.println(isPositive(6));
        repeatString("напечатать сроку", 5);
        System.out.println(leapYear());
        changeArrayNumbers();
        fillArray();
        multiplyArray();
        twoDimenArr();
        singleArray(5, 6);
        minMaxArr();

    }

    /* 1. Написать метод, принимающий на вход два целых числа и проверяющий,
    что их сумма лежит в пределах от 10 до 20 (включительно), если да – вернуть true,
    в противном случае – false.*/

    private static boolean checkNumbers() {
        System.out.println("Введите два числа: ");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int sum = a + b;
        return sum >= 10 && sum <= 20;
    }

    /* 2. Написать метод, которому в качестве параметра передается целое число,
    метод должен напечатать в консоль, положительное ли число передали или отрицательное.
    Замечание: ноль считаем положительным числом.*/

    private static void positiveOrNegative(int n) {
        if (n >= 0) {
            System.out.println("Число " + n + " - положительное.");
        } else {
            System.out.println("Число " + n + " - отрицательное.");
        }
    }

    /* 3. Написать метод, которому в качестве параметра передается целое число.
    Метод должен вернуть true, если число отрицательное, и вернуть false если положительное.*/

    private static boolean isPositive(int b) {
        return b <= 0;
    }

    /* 4. Написать метод, которому в качестве аргументов передается строка и число,
    метод должен отпечатать в консоль указанную строку, указанное количество раз;*/

    private static void repeatString(String s, int a) {
        for (int i = 0; i < a; i++) {
            System.out.println(s);
        }
    }

    /* 5. Написать метод, который определяет, является ли год високосным,
    и возвращает boolean (високосный - true, не високосный - false).
    Каждый 4-й год является високосным, кроме каждого 100-го, при этом каждый 400-й – високосный.*/

    private static boolean leapYear() {
        System.out.println("Введите год: ");
        Scanner sc = new Scanner(System.in);
        int year = sc.nextInt();
        return year % 4 == 0 && year % 100 != 0 || year % 400 == 0;
    }

    /* 6. Задать целочисленный массив, состоящий из элементов 0 и 1.
    Например: [ 1, 1, 0, 0, 1, 0, 1, 1, 0, 0 ]. С помощью цикла и условия заменить 0 на 1, 1 на 0;*/

    private static void changeArrayNumbers() {
        System.out.println("Первоначальный массив: ");
        int[] arr = {1, 1, 0, 0, 1, 0, 1, 1, 0, 0};
        System.out.println(Arrays.toString(arr));
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 1) {
                arr[i] = 0;
            } else if (arr[i] == 0) {
                arr[i] = 1;
            }
        }
        System.out.println("Массив после изменений: ");
        System.out.println(Arrays.toString(arr));
    }

    /* 7. Задать пустой целочисленный массив длиной 100.
    С помощью цикла заполнить его значениями 1 2 3 4 5 6 7 8 … 100;*/

    private static void fillArray() {
        int[] emptyArray = new int[100];
        for (int i = 0; i < emptyArray.length; i++) {
            emptyArray[i] = i + 1;
        }
        System.out.println(Arrays.toString(emptyArray));
    }

    /* 8. Задать массив [ 1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1 ] пройти по нему циклом,
    и числа меньшие 6 умножить на 2;*/

    private static void multiplyArray() {
        int[] multiArr = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        for (int i = 0; i < multiArr.length; i++) {
            if (multiArr[i] < 6) {
                multiArr[i] *= 2;
            }
        }
        System.out.println(Arrays.toString(multiArr));
    }

    /* 9. Создать квадратный двумерный целочисленный массив (количество строк и столбцов одинаковое),
    и с помощью цикла(-ов) заполнить его диагональные элементы единицами
    (можно только одну из диагоналей, если обе сложно).
    Определить элементы одной из диагоналей можно по следующему принципу:
    индексы таких элементов равны, то есть [0][0], [1][1], [2][2], …, [n][n];*/

    private static void twoDimenArr() {
        int[][] arr = new int[5][5];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (i == j) {
                    arr[i][j] = 1;
                } else {
                    arr[i][j] = 0;
                }
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }

    /* 10. Написать метод, принимающий на вход два аргумента: len и initialValue,
    и возвращающий одномерный массив типа int длиной len, каждая ячейка которого равна initialValue;*/

    private static void singleArray(int len, int initiaValue) {
        int[] oneArray = new int[len];
        for (int i = 0; i < oneArray.length; i++) {
            oneArray[i] = initiaValue;
        }
        System.out.println(Arrays.toString(oneArray));
    }

    // 11. Задать одномерный массив и найти в нем минимальный и максимальный элементы ;

    private static void minMaxArr() {
        int[] arr = {5, 3, 2, 8, 4, 12, 13, 3, 56, 23};
        int max = arr[0];
        int min = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] > max) {
                max = arr[i];
            }
            if (arr[i] < min) {
                min = arr[i];
            }
        }
        System.out.println("Максимальный элемент массива: " + max);
        System.out.println("Минимальный элемент массива: " + min);
    }
}
