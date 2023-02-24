public class Main {
    public static void main(String[] args) {
        //С помощью цикла while посчитайте, сколько месяцев потребуется, чтобы накопить 2 459 000 рублей при условии,
        // что первоначально мы имеем 0 рублей и готовы откладывать по 15 тысяч рублей.
        //Результат программы должен быть выведен в консоль с тем количеством месяцев,
        // которое необходимо для накопления данной суммы. Формат сообщения: «Месяц …, сумма накоплений равна … рублей» .

    System.out.println("Задача 1");
    int need = 2_459_000;
    int have = 0;
    int salary = 15_000;
    int month = 1;
    while (have <= need) {
        have = have + salary;
        System.out.println("Месяц " + month + ", сумма накоплений равна " + have + " рублей");
        month++;
    }

        System.out.println("Задача 2");
    int i = 1;
    while (i <= 10) {
        System.out.print(i + " " );
        i++;
        }
        i = i-1;
        System.out.println();
    for (; i >= 1; i--){
        System.out.print(i + " " );
    }
        System.out.println();

    System.out.println("Задача 3");
    int y = 12_000_000;
    int birth = 17;
    int death = 8;
    int years = 10;
    for (int year = 1;year <= years; year++){
        y = y +y * birth / 1000 - y * death / 1000;
        System.out.println("Год " + year + ", численность населения составляет " + y + " человек");
    }

        System.out.println("Задача 4");
    int sum = 15000;
    int mainSum = 12_000_000;
    int month1 = 1;
    double monthlyPercent = 0.07;

    while (sum <= mainSum) {
        sum = (int) (sum * (1 + monthlyPercent));
        System.out.println("Месяц " + month1 + " сумма накоплений равна " + sum);
        month1++;
    }

            System.out.println("Задача 6");
            int sum2 = 15000;
            int years2 = 12*9;
            double monthlyPercent1 = 0.07;

            for (int month2 = 1;month2 <= years2; month2++) {
                sum2 = (int) (sum2 * (1 + monthlyPercent1));
                if (years2 % 6 == 0){
                System.out.println("Месяц " + month2 + " сумма накоплений равна " + sum2);
            }

        }

        System.out.println("Задача 7");
            int fridayFirst = 3;
            for (int friday = fridayFirst; friday <= 31; friday = friday + 7){
                System.out.println("Сегодня пятница, " + friday + " число. Необходимо подготовить отчет");
            }
        System.out.println("Задача 8");
            int firstCometa = 0;
            int period = 79;
            int currentYear = 2023;
            int start = currentYear - 200;
            int end = currentYear + 100;
            for (int year = firstCometa; year <= end; year+=period){
                if (year >= start){
                    System.out.println(year);
                }
            }






}}