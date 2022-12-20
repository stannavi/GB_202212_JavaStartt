package homework.lesson3;

/* 1. Пусть дан произвольный список целых чисел, удалить из него четные числа
   (в языке уже есть что-то готовое для этого)*/

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Task1 {
    public static void main(String[] args) {

        List<Integer> listNumber = new ArrayList<>();

        listNumber.add(2);
        listNumber.add(5);
        listNumber.add(7);
        listNumber.add(12);
        listNumber.add(8);
        listNumber.add(35);
        listNumber.add(86);
        listNumber.add(14);
        listNumber.add(11);
        listNumber.add(88);
        listNumber.add(27);
        listNumber.add(24);

        System.out.println(listNumber);

        listNumber.removeIf(evenNumber -> evenNumber % 2 == 0);

        System.out.println(listNumber);
    }
}
