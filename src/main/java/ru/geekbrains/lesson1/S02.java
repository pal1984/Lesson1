package ru.geekbrains.lesson1;

import java.util.Scanner;

public class S02 {

    static Scanner scanner = new Scanner(System.in);

    /**
     * Проверка числа на четность
     * @param number - число для проверки
     * @return - результат проверки числа на четность
     */
    static boolean isEvent(int number){
         return number % 2 == 0;
    }

    static void task1(){
        System.out.println("Подсчет суммы нечетных положительных чисел");
        System.out.println("==========================================");
        System.out.println("Вводите целые числа (0 - завершение ввода:");

        int sum = 0;
        int count = 0;
        boolean isNumber = false;
        int number = 0;

        do{
            count++;
            System.out.print("Введите число: ");
            isNumber = scanner.hasNextInt();
            if (isNumber){
                number = scanner.nextInt();
                scanner.nextLine();
                //System.out.printf("Вы ввели число: %d\n", number);
                if (number > 0 && !isEvent(number)){
                    sum += number; // sum = sum + number;
                }
            }
            else{
                System.out.println("Вы ввели некорректное число.\nПожалуйста, повторите попытку ввода.");
                scanner.nextLine();
            }
        }
        while (!(isNumber && number == 0));
        System.out.printf("Сумма нечетных, положительных чисел: %d;\nКол-во попыток ввода: %d\n", sum, count);
        System.out.println("Завершение работы подпрограммы.");
    }

    static void task2(){
        System.out.println("Task2 ...");
    }

    public static void main(String[] args) {

        boolean fExit = false;
        while (!fExit){
            System.out.println("1 - \"Подсчет суммы нечетных положительных чисел.\"");
            System.out.println("2 - Task2");
            System.out.print("Введите номер задания (0 - выход из программы): ");
            if (scanner.hasNextInt()){
                int no = scanner.nextInt();
                scanner.nextLine();
                switch (no){
                    case 0:
                        System.out.println("Завершение работы приложения.");
                        fExit = true;
                        break;
                    case 1:
                        task1();
                        break;
                    case 2:
                        task2();
                        break;
                    default:
                        System.out.println("Номер задания не найден.\nПожалуйста, повторите попытку ввода.");

                }
            }
            else{
                System.out.println("Вы ввели некорректное число.\nПожалуйста, повторите попытку ввода.");
                scanner.nextLine();
            }
        }
        scanner.close();
    }

}
