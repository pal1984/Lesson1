package ru.geekbrains.lesson1;

public class FirstApp {
    public static void main(String[] args) {

        //region Задача 2
        byte xs = 127;
        short s = 16000;
        int m = 1565412165;
        long l = 516451511L;
        float fl = 3.14f;
        double dbl = 29.85;
        char symbol = '\u1234';
        boolean logic = true;
        //endregion
    }
        //region Задача 3
    public static float res(float a, float b, float c, float d) {
        a = 2.0f;
        b = 4.0f;
        c = 6.0f;
        d = 8.0f;
        return a * (b + (c / d));

    }
        //endregion

        //region Задача 4
    public static boolean range(int e, int f) {
        int g = e + f;
        if (g >= 10 && g <= 20) {
            return true;
        }
        else {
            return false;
        }
    }
        //endregion

        //region Задача 5
    public static void posOrNeg(int h) {
        if (h >= 0) {
            System.out.println("Число " + h + " положительное!");
        }
        else {
            System.out.println("Число " + h + " отрицательное!");
        }
    }
        //endregion

        //region Задача 6
        public static boolean checkNumber(int i) {
            if (i >= 0) {
                return true;
            }
            else {
                return false;
            }
        }
        //endregion

        //region Задача 7
    public static void name(String name){
        System.out.println("Привет, " + name + " !");
    }
        //endregion

        //region Задача 8
    public static void year(int year) {
        int j = year / 4;
        int k = year / 100;
        int l = year / 400;
        if (j == 0 && l == 0 || k != 0) {
            System.out.println(year + " год високосный!");
        }
        else {
            System.out.println(year + " год не високосный!");
        }
    }
        //endregion













}
