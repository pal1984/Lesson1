package ru.geekbrains.lesson1;

import java.util.ArrayList;
import java.util.List;

public class Sample02 {

    public static void main(String[] args) {

        /*

        for (инициализация; условие; итерация){

            рабор_инструкций
        }

        */


        for (int i = 0; i < 5; i++)
        {
            System.out.println("i= " + i);
        }

        int counter = 0;
        for(;;){

            counter++;
            System.out.println("Hello!");
            if (counter > 5)
                break;
        }

        for(int i = 0, j = 10; i < j; i++, j--){
            System.out.println("i-j: " + i  + "-" + j);
        }

        counter = 0;

        do{
            System.out.print(counter + "\t");
            counter++;
        }
        while (counter < 10);

        System.out.println();

        while (counter > 0){

            counter--;
            System.out.print(counter + "\t");
        }

        System.out.println();

        // foreach
        // for - Java

        char[] arr = {'A', 'B', 'C', 'D'}; // Iterable
        int j = 10;
        boolean flag = false;
        List<Integer> lst = new ArrayList<>();

        for (char c : arr) {
            System.out.println(c);
        }
    }

}
