package ru.geekbrains.lesson5;

public class Cat {

    private static int counter = 0; // Счетчик
    private String name; // Кличка
    private int age; // Возраст
    private String color; // Цвет
    private int id; // Идентификатор

    public int getAge(){
        return  age;
    }

    public void setAge(int age){
        if (age < 0)
            this.age = 1;
        else
            this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    // Инициализатор
    {
        System.out.println("Initializer ...");
        name = "Undefined";
        color = "Undefined";
        age = 1;
        id = ++counter;
    }

    public Cat(){
        //name = "Undefined";
        //color = "Undefined";
        //age = 1;
    }

    Cat(String name){
        this.name = name;
    }

    Cat(String name, int age){
        //this.name = name;
        this(name);
        if (age < 0)
            this.age = 1;
        else
            this.age = age;
    }

    /*Cat(String name, int age, String color){

        this(name, age);
        //this.name = name;
        //this.age = age;
        this.color = color;

    }*/

    public Cat(String name, int age, String color) {
        this(name, age);
        //this.name = name;
        //this.age = age;
        this.color = color;
    }

    /**
     * Информация о животном
     */
    void displayInfo(){
        System.out.printf("Id: %d\tName: %s\tAge: %d\tColor: %s\n", id, name, age, color);
    }

    static int getCounter(){
        return counter;
    }

}
