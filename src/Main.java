public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
        task5();
        task6();
        task7();
        task8();
        task9();
        task10();
    }

    public static void task1() {
        System.out.println("Задание 1");
        for (int i = 1; i < 11; i++) {
            System.out.printf("%d ", i);
        }
        System.out.println("\n");
    }
    public static void task2() {
        System.out.println("Задание 2");
        for (int i = 10; i > 0; i--) {
            System.out.printf("%d ", i);
        }
        System.out.println("\n");
    }
    public static void task3() {
        System.out.println("Задание 3");
        for (int i = 0; i <= 17; i += 2) {
            System.out.printf("%d ", i);
        }
        System.out.println("\n");
    }
    public static void task4() {
        System.out.println("Задание 4");
        for (int i = 10; i >= -10; i--) {
            System.out.printf("%d ", i);
        }
        System.out.println("\n");
    }
    public static void task5() {
        System.out.println("Задание 5");
        for (int i = 1904; i <= 2096; i += 4) {
            if (i % 100 != 0 || i % 400 == 0) {
                System.out.printf("%d год является високосным \n", i);
            }
        }
        System.out.println();
    }
    public static void task6() {
        System.out.println("Задание 6");
        for (int i = 1; i <= 14; i++) {
            System.out.printf("%d ", i * 7);
        }
        System.out.println("\n");
    }
    public static void task7() {
        System.out.println("Задание 7");
        for (int i = 0; i <= 9; i++) {
            System.out.printf("%d ",(int)Math.pow(2,i));
        }
        System.out.println("\n");
    }
    public static void task8() {
        System.out.println("Задание 8");
        int savingMoneyPerMonth = 29000, inBank = 0;
        for (int i = 1; i <= 12; i++) {
            inBank += savingMoneyPerMonth;
            System.out.printf("Месяц %d, сумма накоплений равна %d рублей \n", i, inBank);
        }
        System.out.println();
    }
    public static void task9() {
        System.out.println("Задание 9");
        double savingMoneyPerMonth = 29000, inBank = 0, interestRate = 0.12;
        for (int i = 1; i <= 12; i++) {
            inBank += inBank * (interestRate / 12);
            inBank += savingMoneyPerMonth;
            System.out.printf("Месяц %d, сумма накоплений равна %.2f рублей \n", i, inBank);
        }
        System.out.println();
    }
    public static void task10() {
        System.out.println("Задание 10");
        for (int i = 0; i < 10; i++) {
            System.out.printf("2*%d=%d \n", i + 1, 2 * (i + 1));
        }
        System.out.println();
    }
}