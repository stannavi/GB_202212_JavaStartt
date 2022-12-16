package homework.lesson2;

/* 2. Напишите метод, который определит тип (расширение) файлов из текущей папки
 * и выведет в консоль результат вида
 *          1 Расширение файла: txt
 *          2 Расширение файла: pdf
 *          3 Расширение файла:
 *          4 Расширение файла: jpg
 */

import java.io.File;


public class Task2 {
    public static void main(String[] args) {


        File dirPath = new File("/Users/stannavi/IdeaProjects/GB_202212_JavaStartt/src/homework/lesson2/diffExtFiles");

        String[] files = dirPath.list();
        System.out.println("Список файлов в папке: ");

        for (int i = 0; i < files.length; i++) {
            System.out.print((i + 1) + " " + "Расширение файла " + files[i] + ": " );
            String extension = "";
            int j = files[i].lastIndexOf('.');

            extension = files[i].substring(j + 1);
            System.out.println(extension);

        }
    }
}
