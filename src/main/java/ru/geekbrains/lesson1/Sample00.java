package ru.geekbrains.lesson1;

public class Sample00 {

    //region Задача 1
    public static void invertArray() {
        int i;
        int[] arr = new int[] {0, 1, 0, 1, 0, 1, 0, 1};
        for (i = 0; i < arr.length; i++) {
            if (arr[i] == 0) arr[i] = 1;
            else if (arr[i] == 1) arr[i] = 0;
            System.out.print(arr[i] + " ");
            }

    }
    //endregion

    //region Задача 2
    public static void fillArray() {
        int i;
        int[] arr2 = new int[8];
        for (i = 0; i < arr2.length; i++) {
            arr2[i] = i * 3;
            System.out.print(arr2[i] + " ");
        }
    }
    //endregion

    //region Задача 3
    public static void lowerSix() {
        int i;
        int[] arr3 = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        for (i = 0; i < arr3.length; i++){
            if (arr3[i] < 6) arr3[i] *= 2;
            System.out.print(arr3[i] + " ");
        }
    }
    //endregion

    //region Задача 4
    public static void twoDArr(){
        int i;
        int j;
        int[][] arr4 = new int[5][5];
        for (i = 0; i < arr4.length; i++){
            for (j = 0; j < arr4[i].length; j++){
                if (i == j) arr4[i][j] = 1;
                if (j == arr4.length - 1 - i) arr4[i][j] = 1;
                System.out.format("%d ", arr4[i][j]);
            }
            System.out.println();
        }
    }
    //endregion

    //region Задача 5

    public static void maxMin(){
        int i;
        int[] arr5 = {2, 56, 25, 88, 42, 8, 5, 9};
        int minN = 0;
        int min = arr5[minN];
        int maxN = 0;
        int max = arr5[maxN];
        for (i = 0; i < arr5.length; i++){
            if (arr5[i] < min) {
                min = arr5[i];
                minN = i;
            }
            if (arr5[i] > max) {
                max = arr5[i];
                maxN = i;
            }
        }
        System.out.printf("Минимальный элемент имеет индекс [%d] и равен %d\n", minN, min);
        System.out.printf("Максимальный элемент имеет индекс [%d] и равен %d\n", maxN, max);
    }
    //endregion

    //region Задача 6
    static boolean balance() {
        int[] arr6 = {3, 4, 7, 6, 2, 6};
        int sum = 0;
        for (int i = 0; i < arr6.length; i++) {
            sum += arr6[i];
        }
        if (sum % 2 != 0) return false;
        sum /= 2;
        int left = 0;
        for (int i : arr6) {
            left += i;
            if (left == sum) return true;
            if (left > sum) return false;
        }
        return false;

    }
    //endregion

    //region Задача 7 Здесь не понял ничего вообще, оставил просто, чтобы не потерять.

    static void shift(int[] arr, int n) {
        int shift = (arr.length + n % arr.length) % arr.length; // Вычисляем реальное смещение
        for (int i = 0; i < shift; i++) { // Выполним цикл смещения по одному элементу в соответствии со значением реального смещения (переменная shift)
            int temp = arr[arr.length - 1]; // Сохраняем значение ПОСЛЕДНЕГО элемента массива
            for (int j = arr.length - 1; j > 0 ; j--) { // Пройдем по всем элементам массива с конца в начало, заменим значение текущего элемента массива значением элемента, предшествующего текущему
                arr[j] = arr[j - 1];
            }
            arr[0] = temp; // А как быть с самым первым элементом? Вот как раз из переменной temp мы и получим недостающее значение
        }
    }

    //endregion


    public static void main(String[] args) {

        invertArray();
        System.out.println();
        fillArray();
        System.out.println();
        lowerSix();
        System.out.println();
        twoDArr();
        System.out.println();
        maxMin();
        System.out.println(balance());





    }

}
