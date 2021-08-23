package ru.geekbrains.lesson5;

public class Sample02 {

    public static void main(String[] args) {

        Cat cat01 = new Cat("Тиграша",4 , "Серый");
        cat01.displayInfo();
        changeName(cat01);
        cat01.displayInfo();

        //-----

        changeCat(cat01);
        cat01.displayInfo();
    }

    static void changeName(Cat cat){
        cat.setName("Персик");
    }

    static void changeCat(Cat cat){
        cat = new Cat("Персик", 3, "Белый");
        cat.setName("Бублик");
        cat.displayInfo();
    }

}
