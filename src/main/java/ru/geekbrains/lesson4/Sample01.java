package ru.geekbrains.lesson4;

import java.util.Random;
import java.util.Scanner;

public class Sample01 {

    static final char DOT_HUMAN = 'X'; // Фишка - человек
    static final char DOT_AI = '0'; // Фишка - компьютер
    static final char DOT_EMPTY = '*'; // Признак пустого поля
    static final Scanner SCANNER = new Scanner(System.in); // Вспомогательный класс для ввода данных
    static final Random RANDOM = new Random(); // Вспомогательный класс для генерации случайных чисел
    static char[][] field; // Двумерный массив, хранит текущее состояние игрового поля
    static int fieldSizeX; // Размерность игрового поля
    static int fieldSizeY; // Размерность игрового поля

    /**
     * Инициализация объектов игры
     */
    static void initialize(){
        // Установим размерность игрового поля
        fieldSizeY = 3;
        fieldSizeX = 3;
        // Инициализация массива, описывающего игровое поле
        field = new char[fieldSizeY][fieldSizeX];
        for (int y = 0; y < fieldSizeY; y++){
            for (int x = 0; x < fieldSizeX; x++){
                // Проинициализируем все элементы массива DOT_EMPTY (признак пустого поля)
                field[y][x] = DOT_EMPTY;
            }
        }
    }

    /**
     * Отрисовка игрового поля
     */
    static void printField(){

        System.out.print("+");
        for (int i = 0; i < fieldSizeX * 2 + 1; i++){
            if (i % 2 == 0) // четный
            {
                System.out.print("-");
            }
            else {
                System.out.print(i / 2 + 1);
            }
        }
        System.out.println();

        for (int y = 0; y < fieldSizeY; y++){
            System.out.print(y + 1 + "|");
            for (int x = 0; x < fieldSizeX; x++){
                // Проинициализируем все элементы массива DOT_EMPTY (признак пустого поля)
                //field[y][x] = DOT_EMPTY;
                System.out.print(field[y][x] + "|");
            }
            System.out.println();
        }

        for (int i = 0; i <= fieldSizeX * 2 + 1; i++){
            System.out.print("-");
        }
        System.out.println();
    }

    /**
     * Обработка хода игрока (человека)
     */
    static void humanTurn(){
        int x, y;
        do{
            System.out.println("Введите координаты хода X и Y (от 1 до 3)\nчерез пробел >>>");
            x = SCANNER.nextInt() - 1;
            y = SCANNER.nextInt() - 1;
        }
        while(!isCellValid(x, y) || !isCellEmpty(x, y));
        field[y][x] = DOT_HUMAN;
    }

    /**
     * Обработка хода компьютера
     */
    static void aiTurn(){
        int x, y;
        do{
            x = RANDOM.nextInt(fieldSizeX);
            y = RANDOM.nextInt(fieldSizeY);
        }
        while(!isCellEmpty(x, y));
        field[y][x] = DOT_AI;
    }

    /**
     * Проверка корректности ввода
     * (координаты хода игрока не должны превышать размерность массива,
     * описывающего игровое поле)
     * @param x
     * @param y
     * @return
     */
    static boolean isCellValid(int x, int y){
        return x >=0 && x < fieldSizeX && y >= 0 && y < fieldSizeY;
    }

    static boolean isCellEmpty(int x, int y){
        return field[y][x] == DOT_EMPTY;
    }

    /**
     * Проверка победы
     * @param c - фишка игрока/компьютера
     * @return
     */
    static boolean checkWin(char c){
        // Проверка по трем горизонталям
        if (field[0][0] == c && field[0][1] == c && field[0][2] == c) return true;
        if (field[1][0] == c && field[1][1] == c && field[1][2] == c) return true;
        if (field[2][0] == c && field[2][1] == c && field[2][2] == c) return true;

        // Проверка по трем вертикалям
        if (field[0][0] == c && field[1][0] == c && field[2][0] == c) return true;
        if (field[0][1] == c && field[1][1] == c && field[2][1] == c) return true;
        if (field[0][2] == c && field[1][2] == c && field[2][2] == c) return true;

        // Проверка по диагоналям
        if (field[0][0] == c && field[1][1] == c && field[2][2] == c) return true;
        if (field[0][2] == c && field[1][1] == c && field[2][0] == c) return true;

        return false;
    }

    /**
     * Проверка на ничью
     * @return
     */
    static boolean checkDraw(){
        for (int y = 0; y < fieldSizeY; y++){
            for (int x = 0; x < fieldSizeX; x++){
                // Проинициализируем все элементы массива DOT_EMPTY (признак пустого поля)
                if (isCellEmpty(x, y))
                    return false;
            }
        }
        return true;
    }

    /**
     * Метод проверки состояния игры
     * @param c
     * @param s
     * @return
     */
    static boolean gameChecks(char c, String s){
        if (checkWin(c))
        {
            System.out.println(s);
            return true;
        }
        if (checkDraw()) {
            System.out.println("Ничья!");
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        while (true){
            initialize();
            printField();
            while (true){
                humanTurn(); // Обработка хода игрока (человека)
                printField();
                if (gameChecks(DOT_HUMAN, "Вы победили!"))
                    break;
                aiTurn(); // Обработка хода компьютера
                printField();
                if (gameChecks(DOT_AI, "Победил компьютер!"))
                    break;
            }
            System.out.print("Желаете сыграть еще раз? (Y - да): ");
            if (!SCANNER.next().equalsIgnoreCase("Y"))
                break;
        }
    }

}
