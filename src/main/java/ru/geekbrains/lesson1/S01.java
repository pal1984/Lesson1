package ru.geekbrains.lesson1;

import java.util.Scanner;

public class S01 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите число: ");

        if (scanner.hasNextInt()){
            int number = scanner.nextInt();
            System.out.printf("Вы ввели число: %d\n", number);
        }
        else{
            System.out.println("Вы ввели некорректное число.");
        }

        scanner.nextLine();
        System.out.println("Введите строку, пустая допускается");
        System.out.print("(ENTER - завершение ввода): ");
        String inputStr01 = scanner.nextLine();
        System.out.printf("Вы ввели строку \"%s\"\n", inputStr01);
        System.out.println("Введите строку, пустая недопускается,");
        System.out.println("считается только первое слово до пробела");
        System.out.print("(ENTER - завершение ввода): ");
        String inputStr02 = scanner.next();
        System.out.printf("Вы ввели строку, но считалось только слово \"%s\"\n", inputStr02);



        /*double d = 17.234;
        System.out.printf(" %.1f\n", d);*/


    }

}
