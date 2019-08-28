package com.company.laba12;

import java.io.FileNotFoundException;
import java.net.URL;
import java.util.Scanner;
import java.io.File;

public class task5 {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner s = new Scanner(System.in);

        int n = s.nextInt();
        //Относительный путь
        String path = "task4488/test" + n + ".txt";

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

        if (!fileScanner.hasNext()) {
            System.out.println("Файл пуст");
            fileScanner.close();
            return;
        }
        int q = -1;

        while (fileScanner.hasNext()) {
            String data = fileScanner.nextLine();
            q++;
            if (q == 0) {
                System.out.print(data);
            }

        }
        System.out.println(" "+q);

        fileScanner.close();
    }
}
