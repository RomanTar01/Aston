import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        byte N;
        do {
            System.out.print("\nВведите номер задачи от 1 до 14 или\n");
            System.out.print("любое другое число для выхода(рекомендуется 0): ");
            N = sc.nextByte();

            switch (N) {
                case 1: {
                    //Задача 1
                    printThreeWords();
                    break;
                }
                case 2: {
                    //Задача 2
                    checkSumSign();
                    break;
                }
                case 3: {
                    //Задача 3
                    printColor();
                    break;
                }
                case 4: {
                    //Задача 4
                    compareNumbers();
                    break;
                }
                case 5: {
                    //Задача 5
                    System.out.println(tenToTwenty(5, 3));
                    break;
                }
                case 6: {
                    //Задача 6
                    checkPositiveInteger(-2);
                    break;
                }
                case 7: {
                    //Задача 7
                    System.out.println(checkInteger(-1));
                    break;
                }
                case 8: {
                    //Задача 8
                    printLineN("new line", 6);
                    break;
                }
                case 9: {
                    //Задача 9
                    System.out.println(checkYear(2024));
                    break;
                }
                case 10: {
                    //Задача 10
                    invertElementsArr();
                    break;
                }
                case 11: {
                    //Задача 11
                    showArrHundredElements();
                    break;
                }
                case 12: {
                    //Задача 12
                    showArr();
                    break;
                }
                case 13: {
                    //Задача 13
                    twoDimArray();
                    break;
                }
                case 14: {
                    //Задача 14
                    String[] arr = arrayInitTwo(10, "1");
                    for (String n : arr) {
                        System.out.print(n + " ");
                    }
                    System.out.println();
                    break;
                }
                default: {
                    System.out.println("Номер не находится в диапазоне от 1 до 14.");
                }
            }
        }while (N>0 && N<15);
    }

//Задача №1
    public static void printThreeWords(){
        System.out.println("\nOrange\nBanana\nApple");
    }

//Задача №2
    public static void checkSumSign() {
        int a = 5, b = -2;

        int sum = a + b;
        System.out.printf("\nПриняты числа %d и %d.\n", a, b);
        if (sum >= 0)
            System.out.println("Сумма положительная");
        else
            System.out.println("Сумма отрицательная");
    }

//Задача №3
    public static void printColor(){
        int value = 0;

        System.out.printf("\nПеременная value равна %d.\n", value);
        if(value <= 0)
            System.out.println("Красный");
        else if(value > 0 && value <= 100)
            System.out.println("Жёлтый");
        else
            System.out.println("Зелёный");
    }

//Задача №4
    public static void compareNumbers(){
        int a = 5, b = 8;
        System.out.printf("\nПриняты числа a=%d и b=%d.\n", a, b);
        if (a >= b)
            System.out.println("a>=b");
        else
            System.out.println("a<b");
    }

//Задача №5
    public static boolean tenToTwenty(int a, int b){
        System.out.printf("\nПриняты числа a=%d и b=%d.\n", a, b);
        int sum = a + b;

        if (sum >= 10 && sum <= 20)
            return true;
        else
            return false;
    }

//Задача №6
    public static void checkPositiveInteger(int value){
        System.out.printf("\nПередано число %d.\n", value);
        if (value >= 0)
            System.out.println("Передано положительное число");
        else
            System.out.println("Передано отрицательное число");
    }

//Задача №7
    public static boolean checkInteger(int value){
        System.out.printf("\nПередано число %d.\n", value);
        if (value>=0)
            return true;
        else
            return false;
    }

//Задача №8
    public static void printLineN(String line, int n){
        System.out.printf("\nСтрока: \"%s\".\nВывести - %d раз.\n", line, n);
        for(int i = 1; i <= n; i++)
            System.out.println(line);
    }

//Задача №9
    public static boolean checkYear (int year){
        boolean check;
        System.out.printf("\nГод %d високосный.\n", year);
        if (year%4==0) {
            if (year % 400 == 0) {
                check = true;
            } else if (year % 100 == 0) {
                check = false;
            } else {
                check = true;
            }
        }
        else{
                check = false;
            }
        return check;
    }

//Задача №10
    public static void invertElementsArr(){
        byte[] arr = {1, 0, 0, 1, 0, 1, 0, 0, 1, 0, 1};

        System.out.print("\nНачальный массив:\t\t");

        for(int n: arr) System.out.print(" " + n);

        //Преобразование массива
        for (int i = 0; i < arr.length; i++){
            if (arr[i]==1) arr[i] = 0;
            else arr[i] = 1;
        }

        System.out.print ("\nПреобразованный массив:\t");

        for (int n: arr) System.out.print(" " + n);
        System.out.println();
    }

//Задача №11
    public static void showArrHundredElements(){
        int[] arr = new int [100];

        System.out.println("\nВывод значений элементов массива по порядку:");

        //инициализация и вывод элемента массива в одном цикле
        //чтобы два раза не бегать)
        for (int i = 0; i < 100; i++){
            arr[i] = i+1;
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

//Задача №12
    public static void showArr(){
        int[] arr = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};

        System.out.print("\nНачальный массив:\t\t");
        for(int n: arr) System.out.print(" " + n);

        //преобразование массива
        for (int i=0; i < arr.length; i++){
            if (arr[i] < 6) arr[i] *= 2;
        }

        System.out.print ("\nПреобразованный массив:\t");
        for (int n: arr) System.out.print(" " + n);
        System.out.println();
    }

//Задача №13
    public static void twoDimArray(){
        Scanner insertValue = new Scanner(System.in);

        System.out.print("\nВвести число (размерность массива): ");

        int N = insertValue.nextInt();
        byte[][] arr= new byte [N][N];

        //забиваем массив нулями
        for (int i = 0; i < N; i++){
            for (int j = 0; j < N; j++){
                arr[i][j] = 0;
            }
        }

        //заполняем диагонали единицами
        for (int i = 0; i < N; i++){
            arr[i][i] = 1;
            arr[i][N-1-i] = 1;
        }

        //выводим массив
        for (int i = 0; i < N; i++){
            for (int j = 0; j < N; j++){
                System.out.print(" " + arr[i][j]);
            }
            System.out.println();
        }
    }

//Задача №14
    public static String[] arrayInitTwo(int len, String initialValue){

        System.out.printf("\nКоличество элементов - %d;",len);
        System.out.printf("\nЗаполнение ячейки - %s.\n", initialValue);

        String[] arr = new String[len];

        for(int i = 0; i < len; i++){
           arr[i] = initialValue;
        }
        return arr;
    }
}