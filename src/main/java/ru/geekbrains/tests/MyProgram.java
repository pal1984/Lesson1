package ru.geekbrains.tests;

import java.util.Scanner;

public class MyProgram {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        int space = str.indexOf(' ');
        String word = Integer.toString(space + 1);

        boolean abc = str.charAt(0) < word.charAt(0);

        System.out.println(abc);


    }
}
