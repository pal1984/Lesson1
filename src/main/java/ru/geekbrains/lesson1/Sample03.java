package ru.geekbrains.lesson1;

import java.util.Random;

public class Sample03 {


    public static int findElement(int[] arr, int e){
        for (int i = 0; i < arr.length; i++){
            if (arr[i] == e){
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {

        // тип_данных[] имя_переменной = new тип_данных[размер_массива];

        int[] arr = new int[5];
        int[] arr02;
        arr02 = new int[10];
        arr = new int[15];

        int arr03[] = new int[4];

        arr03[0] = 5;
        arr03[1] = 10;
        arr03[2] = 15;
        arr03[3] = 15;

        int[] arr04 = {10, 12, 11, 7, -1};

        for(int i = 0; i < 15; i++){
            arr[i] = i*2;
            System.out.println("arr[" + i + "] = " + arr[i]);
        }
        int e = 18;
        int res01 = findElement(arr, e);
        System.out.format("Искомый элемент %d массива найден по индексу %d\n", e, res01);

        int[][] table01 = new int[3][4];
        int[][] table02 = { {20, -5, 1, -1},    {5, 9, 0, 3},      {-2, 9, 1, 1} };

        for (int i = 0; i < 3; i++){

            for (int j = 0; j < 4; j++){
                System.out.print(table02[i][j] + "\t");
            }
            System.out.println();

        }


        Random random = new Random();
        int[][] table03 = new int[5][5];


        for (int i = 0; i < table03.length; i++){
            for (int j = 0; j < table03[i].length; j++){
                table03[i][j] =  random.ints(-10, 11).findFirst().getAsInt();
                System.out.print(table03[i][j] + "\t");
            }
            System.out.println();
        }

        int eX = 0;
        int eY = 0;
        int max = table03[eX][eY];

        for (int i = 0; i < table03.length; i++){
            for (int j = 0; j < table03[i].length; j++){
                if (table03[i][j] > max){
                    max = table03[i][j];
                    eX = i;
                    eY = j;
                }
            }
            System.out.println();
        }
        System.out.format("Индекс элемента с максимальным значением: [%d][%d]\n", eX, eY);
        System.out.println("Максимальное значение элемента: " + max);








    }

}
