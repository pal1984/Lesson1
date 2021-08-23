package ru.geekbrains.lesson1;

public class Sample01 {


    public static  void task1(){
        System.out.println("Process task1 ...");
    }

    public static  void task2(){
        System.out.println("Process task2 ...");
    }

    public static  void task3(){
        System.out.println("Process task3 ...");
    }

    public static void main(String[] args) {

        int taskNumber = 5;

        switch (taskNumber){

            case 1:
                task1();
                break;
            case 2:
                task2();
                break;
            case 3:
            case 4:
            case 5:
                task3();
                break;
            default:
                System.out.println("Не удалось определить блок подпрограммы.");
                break;
        }

    }

}
