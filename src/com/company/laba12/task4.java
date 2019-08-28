package com.company.laba12;

import java.io.FileNotFoundException;
import java.net.URL;
import java.util.Scanner;
import java.io.File;

public class task4 {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner s = new Scanner(System.in);

        int n = s.nextInt();
        //Относительный путь
        String path = "task6175/test" + n + ".txt";

        //Технический адрес к файлу
        URL url = task4.class.getClassLoader().getResource(path);

        if (url == null) {
            System.out.print("Файл '" + path + "' Не существует");
            return;
        }

        //Объект для работы с файлом в программе
        File file = new File(url.getFile());

        // Сканнер для чтения файла
        Scanner fileScanner = new Scanner(file);

        //цикл FOR заменили на цикл WHILE!!!!
        /*for (int i = 0; i <= 3; i++) {
            if (fileScanner.hasNext()) {
                String data = fileScanner.nextLine();
                System.out.println(data);
                i = 0;
            } else if (!fileScanner.hasNext()) {
                i = 10;
            }
        }
*/
        if (!fileScanner.hasNext()) {
            System.out.println("Файл пуст");
        }
        while (fileScanner.hasNext()) {
            String data = fileScanner.nextLine();
            System.out.println(data);

        }

        fileScanner.close();
    }
}
