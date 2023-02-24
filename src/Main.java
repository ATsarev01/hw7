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
    }

    public static void task1() {
        System.out.println("Задача 1");
        int need = 2_459_000;
        int sum = 0;
        int salary = 15_000;
        int month = 1;
        while (sum <= need) {
            sum = sum + salary;
            System.out.println("Месяц " + month + ", сумма накоплений равна " + sum + " рублей");
            month++;
        }
    }

    public static void task2() {
        System.out.println("Задача 2");
        int i = 1;
        while (i <= 10) {
            System.out.print(i + " ");
            i++;
        }
        i = i - 1;
        System.out.println();
        for (; i >= 1; i--) {
            System.out.print(i + " ");
        }
        System.out.println();
    }


    public static void task3() {
        System.out.println("Задача 3");
        int y = 12_000_000;
        int birth = 17;
        int death = 8;
        int years = 10;
        for (int year = 1; year <= years; year++) {
            y = y + y * birth / 1000 - y * death / 1000;
            System.out.println("Год " + year + ", численность населения составляет " + y + " человек");
        }
    }

    public static void task4() {
        System.out.println("Задача 4");
        int sum = 15000;
        int mainSum = 12_000_000;
        int month = 1;
        double monthlyPercent = 0.07;
        while (sum <= mainSum) {
            sum = (int) (sum * (1 + monthlyPercent));
            System.out.println("Месяц " + month + " сумма накоплений равна " + sum);
            month++;
        }
    }


    public static void task5() {
        System.out.println("Задача 5");
        int sum = 15000;
        int mainSum = 12_000_000;
        int month = 1;
        double monthlyPercent = 0.07;
        while (sum <= mainSum) {
            sum = (int) (sum * (1 + monthlyPercent));
            if (month%6==0) {
                System.out.println("Месяц " + month + ", сумма накоплений равна " + sum);
            }
            month++;
            }
        }



    public static void task6 () {
        System.out.println("Задача 6");
        int sum = 15000;
        int years = 12*9;
        double monthlyPercent = 0.07;

        for (int month = 1;month <= years; month++) {
            sum = (int) (sum * (1 + monthlyPercent));
            if (month % 6 == 0) {
                System.out.println("Месяц " + month + ", сумма накоплений равна " + sum);
            }
        }}

    public static void task7 () {
                System.out.println("Задача 7");
                int fridayFirst = 3;
                for (int friday = fridayFirst; friday <= 31; friday = friday + 7) {
                    System.out.println("Сегодня пятница, " + friday + " число. Необходимо подготовить отчет");
                }
            }

    public static void task8 () {
        System.out.println("Задача 8");
        int firstCometa = 0;
        int period = 79;
        int currentYear = 2023;
        int start = currentYear - 200;
        int end = currentYear + 100;
        for (int year = firstCometa; year <= end; year += period) {
            if (year >= start) {
                System.out.println(year);
            }
        }
    }}


