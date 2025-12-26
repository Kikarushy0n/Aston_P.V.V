public class Lesson_1 {

    public static void main(String[] args) {

        printThreeWords();

        checkSumSign();

        printColor();

        compareNumbers();

        System.out.println("Сумма в пределах 10-20: " + isSumBetween10And20(5, 8));
        System.out.println("Сумма в пределах 10-20: " + isSumBetween10And20(5, 20));

        printPositiveOrNegative(10);
        printPositiveOrNegative(-3);
        printPositiveOrNegative(0);

        System.out.println("Число отрицательное? " + isNegative(-5));
        System.out.println("Число отрицательное? " + isNegative(0));

        printStringNTimes("Hello", 3);

        System.out.println("2024 високосный? " + isLeapYear(2024));
        System.out.println("2023 високосный? " + isLeapYear(2023));
        System.out.println("1900 високосный? " + isLeapYear(1900));
        System.out.println("2000 високосный? " + isLeapYear(2000));

        int[] binaryArray = {1, 1, 0, 0, 1, 0, 1, 1, 0, 0};
        invertArray(binaryArray);
        for (int i = 0; i < binaryArray.length; i++) {
            System.out.print(binaryArray[i] + " ");
        }
        System.out.println();
        System.out.println();

        int[] numbers = fillSequential();
        for (int i = 0; i < numbers.length; i++) {
            System.out.print(numbers[i] + " ");
        }
        System.out.println();
        System.out.println();

        int[] arr12 = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        multiplyLessThan6By2(arr12);
        for (int i = 0; i < arr12.length; i++) {
            System.out.print(arr12[i] + " ");
        }
        System.out.println();
        System.out.println();

        int[][] matrix = createDiagonalMatrix(5);
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();

        int[] myArray = createArray(7, 42);
        for (int i = 0; i < myArray.length; i++) {
            System.out.print(myArray[i] + " ");
        }
        System.out.println();
        System.out.println();
    }
    // Task 1
    public static void printThreeWords() {
        System.out.println("Orange");
        System.out.println("Banana");
        System.out.println("Apple");
        System.out.println();
    }
    // Task 2
    public static void checkSumSign() {
        int a = 5;
        int b = -8;
        int sum = a + b;
        if (sum >= 0) {
            System.out.println("Сумма положительная");
        } else {
            System.out.println("Сумма отрицательная");
        }
        System.out.println();
    }
    // Task 3
    public static void printColor() {
        int value = 50;
        if (value <= 0) {
            System.out.println("Красный");
        } else if (value <= 100) {
            System.out.println("Желтый");
        } else {
            System.out.println("Зеленый");
        }
        System.out.println();
    }
    // Task 4
    public static void compareNumbers() {
        int a = 10;
        int b = 7;
        if (a >= b) {
            System.out.println("a >= b");
        } else {
            System.out.println("a < b");
        }
        System.out.println();
    }
    // Task 5
    public static boolean isSumBetween10And20(int a, int b) {
        int sum = a + b;
        if (sum >= 10 && sum <= 20) {
            return true;
        } else {
            return false;
        }
    }
    // Task 6
    public static void printPositiveOrNegative(int number) {
        if (number >= 0) {
            System.out.println("Число положительное");
        } else {
            System.out.println("Число отрицательное");
        }
    }
    // Task 7
    public static boolean isNegative(int number) {
        if (number < 0) {
            return true;
        } else {
            return false;
        }
    }
    // Task 8
    public static void printStringNTimes(String str, int times) {
        for (int i = 0; i < times; i++) {
            System.out.println(str);
        }
        System.out.println();
    }
    // Task 9
    public static boolean isLeapYear(int year) {
        if (year % 4 != 0) {
            return false;
        }
        if (year % 100 != 0) {
            return true;
        }
        if (year % 400 == 0) {
            return true;
        } else {
            return false;
        }
    }
    // Task 10
    public static void invertArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 0) {
                arr[i] = 1;
            } else {
                arr[i] = 0;
            }
        }
    }
    // Task 11
    public static int[] fillSequential() {
        int[] arr = new int[100];
        for (int i = 0; i < 100; i++) {
            arr[i] = i + 1;
        }
        return arr;
    }
    // Task 12
    public static void multiplyLessThan6By2(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < 6) {
                arr[i] = arr[i] * 2;
            }
        }
    }
    // Task 13
    public static int[][] createDiagonalMatrix(int size) {
        int[][] matrix = new int[size][size];
        for (int i = 0; i < size; i++) {
            matrix[i][i] = 1;
            matrix[i][size - 1 - i] = 1;
        }
        return matrix;
    }
    // Task 14
    public static int[] createArray(int len, int initialValue) {
        int[] arr = new int[len];
        for (int i = 0; i < len; i++) {
            arr[i] = initialValue;
        }
        return arr;
    }
}