package ru.geekbrains.lesson5;

public class Sample01 {

    public static void main(String[] args) {

        Cat cat = new Cat("Барсик", -5, "Серый");

        cat.setAge(-10);
        //cat.name = "Барсик";
        //cat.age = -5;
        //cat.color = "Серый";


        cat.displayInfo();

        Cat cat02 = new Cat();
        cat02.displayInfo();

        Cat cat03 = new Cat();
        cat03.displayInfo();

        System.out.println("Счетчик: " + Cat.getCounter());


    }

}
