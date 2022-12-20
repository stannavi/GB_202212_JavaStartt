package homework.lesson3;

/* 2. Задан целочисленный список ArrayList. Найти минимальное, максимальное и среднее
   арифметическое из этого списка.*/

import java.util.ArrayList;
import java.util.List;

public class Task2 {
    public static void main(String[] args) {

        List<Integer> listNumberArray = new ArrayList<>();

        listNumberArray.add(2);
        listNumberArray.add(5);
        listNumberArray.add(7);
        listNumberArray.add(12);
        listNumberArray.add(8);
        listNumberArray.add(35);
        listNumberArray.add(86);
        listNumberArray.add(14);
        listNumberArray.add(11);
        listNumberArray.add(88);
        listNumberArray.add(27);
        listNumberArray.add(24);

        int max = listNumberArray.get(0);
        int min = listNumberArray.get(0);
        double average;
        int count = 0;
        double sum = 0;

        System.out.println(listNumberArray);

        for (Integer integer : listNumberArray) {

            if (min < integer) {
                min = integer;
            }
            if (max > integer) {
                max = integer;
            }
            count++;
            sum += integer;
        }

        average = sum / count;

        System.out.println("Минимальное: " + min + "\n" + "Максимальное: " + max);
        System.out.print("Среднее: ");
        System.out.printf("%.1f", average);
    }
}
