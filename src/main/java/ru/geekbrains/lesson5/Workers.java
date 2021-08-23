package ru.geekbrains.lesson5;

public class Workers {

    private String name;
    private String position;
    private String email;
    private String phone;
    private int pay;
    private static int age;

    public Workers(String name, String position, String email, String phone, int pay, int age){
        this.name = name;
        this.position = position;
        this.email = email;
        this.phone = phone;
        this.pay = pay;
        this.age = age;
    }

    void displayInfo(){
        System.out.printf("Имя: %s\tДолжность: %s\tEmail: %s\tТелефон: %s\tЗарплата: %d\tВозраст: %d\n", name, position, email, phone, pay, age);
    }


    public static void main(String[] args) {

        Workers worker1 = new Workers("Иванов Иван", "Директор", "ivanov@mail.ru", "+79384800623", 100000, 46);
        Workers worker2 = new Workers("Петров Петр", "Зам директора", "petrov@mail.ru", "+79284810722", 80000, 39);
        Workers worker3 = new Workers("Васильева Елена", "Бухгалтер", "vasilyeva@mail.ru", "+79185911734", 60000, 42);
        Workers worker4 = new Workers("Павлова Анастасия", "Оператор", "pavlova@mail.ru", "+79883794532", 40000, 26);
        Workers worker5 = new Workers("Алексеев Алексей", "Логист", "alekseev@mail.ru", "+79003234573", 50000, 36);

        worker1.displayInfo();
        worker2.displayInfo();
        worker3.displayInfo();
        worker4.displayInfo();
        worker5.displayInfo();



        Workers[] arrWorkers = new Workers[5];
        arrWorkers[0] = new Workers("Иванов Иван", "Директор", "ivanov@mail.ru", "+79384800623", 100000, 46);
        arrWorkers[1] = new Workers("Петров Петр", "Зам директора", "petrov@mail.ru", "+79284810722", 80000, 39);
        arrWorkers[2] = new Workers("Васильева Елена", "Бухгалтер", "vasilyeva@mail.ru", "+79185911734", 60000, 42);
        arrWorkers[3] = new Workers("Павлова Анастасия", "Оператор", "pavlova@mail.ru", "+79883794532", 40000, 26);
        arrWorkers[4] = new Workers("Алексеев Алексей", "Логист", "alekseev@mail.ru", "+79003234573", 50000, 36);

        for (int i = 0; i < 5; i++) {
            //if (arrWorkers(age) > 40)
                System.out.println("Сотрудники старше 40 лет:");
            System.out.println(arrWorkers[i]);
        }
    }


}
