package homework.lesson2;

/*1. Напишите метод, который принимает на вход строку (String) и
     определяет является ли строка палиндромом (возвращает boolean значение).
     шалаш
     abcdedcba*/

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {

        System.out.println(isPalindrom());

    }

    private static boolean isPalindrom() {
        System.out.println("Введите слово: ");
        Scanner sc = new Scanner(System.in);
        String palindromString = sc.nextLine();
        String reverse = "";
        for (int i = 0; i < palindromString.length(); i++) {
            reverse = palindromString.charAt(i) + reverse;
        }

        return palindromString.equals(reverse);
    }
}
