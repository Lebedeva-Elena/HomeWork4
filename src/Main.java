public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
        task5();
    }

    public static void task1() {
        System.out.println("Задача 1.");
        int clientOS = 0;
        if (clientOS == 1) {
            System.out.println("Установите версию приложения для Android по ссылке");
        } else if (clientOS == 0) ;
        {
            System.out.println("Установите версию приложения для iOS по ссылке");
        }

    }

    public static void task2() {
        System.out.println("Задача 2.");

        int incVersion = 1;
        int incYear = 2014;

        int iOS = 0;
        int android = 1;
        int minYear = 2015;

        String os;
        String version;

        if (incVersion == iOS) {
            os = "iOs";

        } else if (incVersion == android) {
            os = "android";
        } else {
            os = "";
        }
        if (incYear >= minYear) {
            version = "";
        } else {
            version = " облегченную";
        }
        System.out.println("Установите " + version + " версию для " + os + " по ссылке");

    }

    public static void task3() {
        System.out.println("Задача 3");
        int year = 2025;

        int firstYear = 1;
        int highYear = firstYear + 3;
        int highFourHundredYear = highYear * 100;
        int oneHundreadYear = 100;
        int year1 = year % highYear;
        int yaer2 = year % oneHundreadYear;
        int yaer3 = year % highFourHundredYear;

        if (year1 == 0 && yaer2 != 0) {
            if (yaer3 == 0) {
                System.out.println(year + " год является  высокосным");
            }
        } else {
            System.out.println(year + " год является не высокосным");
        }
    }

    public static void task4() {
        System.out.println("Задача 4");

        int clientDistance = 105;

        int distance = 20;
        int time = 1;
        int maxDistance = 100;


        if (clientDistance <= 20) {

            System.out.println("Потребуется дней: " + time);
        } else if (clientDistance > 20 && clientDistance <= 60) {
            System.out.println("Потребуется дней: " + (time + 1));
        } else if (clientDistance > 60 && clientDistance <= 100) {
            System.out.println("Потребуется дней: " + (time + 2));
        } else if (clientDistance < maxDistance) ;
        System.out.println("Доставка не осуществляется");
    }

    public static void task5() {
        System.out.println("Задача 5");
        int monthNumber = 13;
        switch (monthNumber) {
            case 1:
            case 2:
            case 12:
                System.out.println("Месяц " + monthNumber + " принадлежит сезону ЗИМА");
                break;
            case 3:
            case 4:
            case 5:
                System.out.println("Месяц " + monthNumber + " принадлежит сезону ВЕСНА");
                break;
            case 6:
            case 7:
            case 8:
                System.out.println("Месяц " + monthNumber + " принадлежит сезону ЛЕТО");
                break;
            case 9:
            case 10:
            case 11:
                System.out.println("Месяц " + monthNumber + " принадлежит сезону ОСЕНЬ");
            default:
                System.out.println("Неверный номер месяца.");
        }
    }
}






